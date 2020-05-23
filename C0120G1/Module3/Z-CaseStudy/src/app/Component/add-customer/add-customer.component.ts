import {Component, OnDestroy, OnInit} from '@angular/core';
import {AbstractControl, FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Customer} from '../../Model/customer.model';
import {Subscription} from 'rxjs';
import {CustomerService} from '../../Service/customer.service';
import {Router} from '@angular/router';

function comparePassword(c: AbstractControl) {
  const v = c.value;
  return (v.password === v.confirmPassword) ? null : {
    passwordnotmatch: true
  };
}

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit, OnDestroy {
  public customer: Customer;
  public subscription: Subscription;
  public routerService: Router;

  constructor(public customerService: CustomerService, private router: Router) {
  }

  ngOnInit() {
    this.customer = new Customer();
  }

  onSubmit() {
    // @ts-ignore
    this.subscription = this.customerService.addCustomer(this.customer).subscribe(data => {
      if (data && data.id) {
        this.routerService.navigate(['customers']);
      }
      console.log(this.customer);
    });
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }

}
