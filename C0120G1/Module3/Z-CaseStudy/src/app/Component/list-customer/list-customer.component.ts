import {Component, OnInit, OnDestroy} from '@angular/core';
import {CustomerService} from '../../Service/customer.service';
import {Subscription} from 'rxjs';
import {Customer} from '../../Model/customer.model';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public customers: Customer[];

  constructor(public customerService: CustomerService) {
  }

  ngOnInit() {
    this.subscription = this.customerService.getAllCustomers().subscribe((data: Customer[]) => {
      this.customers = data;
    });
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }


  onDeleteCustomer(id: number) {
    this.subscription = this.customerService.deleteCustomer(id).subscribe((data: Customer) => {
      console.log(data);
      // this.customers = data;
    });
  }
}
