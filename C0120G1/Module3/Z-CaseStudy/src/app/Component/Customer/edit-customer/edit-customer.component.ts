import {Component, OnDestroy, OnInit} from '@angular/core';
import {Customer} from '../../../Model/customer.model';
import {Subscription} from 'rxjs';
import {Router, ActivatedRoute, Params} from '@angular/router';
import {CustomerService} from '../../../Service/customer.service';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public subscriptionParams: Subscription;
  addCustomerForm: FormGroup;
  public id: number;
  message = '';

  constructor(
    public customerService: CustomerService,
    public routerService: Router,
    public activatedRouteService: ActivatedRoute,
    private fb: FormBuilder
  ) {
  }

  ngOnInit() {
    this.addCustomerForm = this.fb.group({
      typeCustomer: ['', [Validators.required]],
      codeCustomer: ['', [Validators.required, Validators.pattern(/^KH-\d{4}$/)]],
      name: ['', [Validators.required]],
      birthday: ['', [Validators.required]],
      idCard: ['', [Validators.pattern(/^\d{9}(\d{3})?$/), Validators.required ]],
      phone: ['', [Validators.pattern(/^(090|091|(84\+90)|(84\+91))\d{7}$/), Validators.required ]],
      email: ['', [Validators.required, Validators.email]],
      address: ['', [Validators.required]],
    });
    this.loadData();
  }

  loadData() {
    this.subscriptionParams = this.activatedRouteService.params.subscribe((data: Params) => {
      this.id = data.id;
      this.subscription = this.customerService.getCustomer(this.id).subscribe((customer: Customer) => {
        this.addCustomerForm.patchValue(customer);
      });
    });
  }

  onEditCustomer() {
    this.subscription = this.customerService.updateCustomer(this.addCustomerForm.value, this.id).subscribe((data: Customer) => {
      this.routerService.navigate(['customers']);
    });
    this.message = 'Chỉnh sửa thành công thông tin khách hàng';
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


