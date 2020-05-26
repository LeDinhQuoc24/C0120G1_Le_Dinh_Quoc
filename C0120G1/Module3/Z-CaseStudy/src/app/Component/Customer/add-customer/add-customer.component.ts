import {Component, OnDestroy, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
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
  message = '';

  constructor(
    public customerService: CustomerService,
    public routerService: Router,
    private fb: FormBuilder
  ) {}
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
  }

  onAddCustomer() {
    console.log(this.addCustomerForm);
    this.subscription = this.customerService.addCustomer(this.addCustomerForm.value).subscribe(data => {
      if (data && data.id) {
        this.routerService.navigate(['customers']);
      }
      this.message = 'Thêm mới thành công thông tin khách hàng';
    });
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }

}
