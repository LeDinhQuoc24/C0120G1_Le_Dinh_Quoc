import {Component, OnDestroy, OnInit} from '@angular/core';
import {AbstractControl, FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Customer} from '../../../Model/customer.model';
import {Subscription} from 'rxjs';
import {CustomerService} from '../../../Service/customer.service';
import {Router} from '@angular/router';


@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  addCustomerForm: FormGroup;

  constructor(
    public customerService: CustomerService,
    public routerService: Router,
    private fb: FormBuilder
  ) {}
  ngOnInit() {
    this.addCustomerForm = this.fb.group({
      typeCustomer: ['', [Validators.required]],
      name: ['', [Validators.required]],
      birthday: ['', [Validators.required]],
      idCard: ['', [Validators.pattern(/^\d{9,10}$/), Validators.required ]],
      phone: ['', [Validators.pattern(/090\d{7,8}$/), Validators.required ]],
      email: ['', [Validators.required, Validators.email]],
      address: ['', [Validators.required]],

    });
  }

  onAddCustomer() {
    console.log(this.addCustomerForm);
    this.subscription = this.customerService.addCustomer(this.addCustomerForm.value).subscribe(data => {
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
