import {Component, OnDestroy, OnInit} from '@angular/core';
import {Customer} from '../../../Model/customer.model';
import {Subscription} from 'rxjs';
import {Router, ActivatedRoute, Params} from '@angular/router';
import {CustomerService} from '../../../Service/customer.service';

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent implements OnInit, OnDestroy {

  public customer: Customer;
  public subscription: Subscription;
  public subscriptionParams: Subscription;

  constructor(
    public customerService: CustomerService,
    public routerService: Router,
    public activatedRouteService: ActivatedRoute
  ) {
  }

  ngOnInit() {
    this.customer = new Customer();
    this.loadData();
  }

  loadData() {
    this.subscriptionParams = this.activatedRouteService.params.subscribe((data: Params) => {
      const id = data.id;
      this.subscription = this.customerService.getCustomer(id).subscribe((customer: Customer) => {
        this.customer = customer;
      });
    });
  }

  onEditCustomer() {
    // @ts-ignore
    this.subscription = this.customerService.updateCustomer( this.customer).subscribe((data: Customer) => {
        this.routerService.navigate(['customers']);
    });
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
    if (this.subscriptionParams) {
      this.subscriptionParams.unsubscribe();
    }
  }

}
