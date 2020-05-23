import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormBuilder, FormGroup, Validators} from '@angular/forms';

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
export class AddCustomerComponent implements OnInit {
  registerFormService: FormGroup;

  constructor(private fb: FormBuilder) {
  }

  ngOnInit() {
    this.registerFormService = this.fb.group({
      id: [''],
      typeCustomer: [''],
      name: [''],
      birthday: [''],
      idCard: [''],
      phone: [''],
      email: [''],
      address: [''],
      // email: ['', [Validators.required, Validators.email]],
      // pwGroup: this.fb.group({
      //   password: ['', [Validators.required, Validators.minLength(6)]],
      //   confirmPassword: ['', [Validators.required, Validators.minLength(6)]]
      // }, {validator: comparePassword}),
      // country: ['', Validators.required],
      // age: ['', [Validators.required, Validators.min(18)]],
      // gender: ['', Validators.required],
      // phone: ['', [Validators.pattern(/^\+84\d{9,10}$/), Validators.required ]]
    });
  }

  onSubmit() {
  }

}
