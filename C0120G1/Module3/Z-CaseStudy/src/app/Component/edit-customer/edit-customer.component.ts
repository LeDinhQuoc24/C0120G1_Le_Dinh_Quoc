import {Component, OnDestroy, OnInit} from '@angular/core';
import {Customer} from '../../Model/customer.model';
import {Subscription} from 'rxjs';
import {Router} from '@angular/router';
import {CustomerService} from '../../Service/customer.service';

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent implements OnInit, OnDestroy {

  public customer: Customer;
  public subscription: Subscription;
  public routerService: Router;

  constructor(public customerService: CustomerService, private router: Router) {
  }

  ngOnInit() {
    this.customer = new Customer();
  }

  onEditCustomer() {
    // @ts-ignore
    this.subscription = this.customerService.addCustomer(this.customer).subscribe(data => {
      if (data && data.id) {
        this.routerService.navigate(['customers']);
      }
    });
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }

}
