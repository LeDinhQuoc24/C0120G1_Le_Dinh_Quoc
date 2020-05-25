import {Component, OnInit, OnDestroy} from '@angular/core';
import {CustomerService} from '../../../Service/customer.service';
import {Subscription} from 'rxjs';
import {Customer} from '../../../Model/customer.model';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public customers: Customer[];
  public totalRec: number;
  public page = 1;
  public searchText;




  constructor(public customerService: CustomerService) {
  }

  ngOnInit() {
    this.subscription = this.customerService.getAllCustomers().subscribe((data: Customer[]) => {
      this.customers = data;
      this.totalRec = this.customers.length;


    });
  }
  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }


  onDeleteCustomer(id: number) {
    this.subscription = this.customerService.deleteCustomer(id).subscribe((data: Customer) => {
      this.updateDataAfterDelete(id);
    });
  }

  updateDataAfterDelete(id: number) {
    for (let i = 0; i < this.customers.length; i++) {
      if (this.customers[i].id === id) {
        this.customers.splice(i, 1);
        break;
      }
    }
  }
}
