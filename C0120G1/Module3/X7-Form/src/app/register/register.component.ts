// @ts-ignore
import { Component, OnInit } from '@angular/core';
// @ts-ignore
import {AbstractControl, FormBuilder, Validators, FormGroup} from "@angular/forms";

function comparePassword(c: AbstractControl) {
  const v = c.value;
  return (v.password === v.confirmPassword) ? null : {
    passwordnotmatch: true
  };
}
// @ts-ignore
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  registerForm: FormGroup;

  constructor(private fb: FormBuilder) {
  }

  ngOnInit() {
    this.registerForm = this.fb.group({
      email: ['', [Validators.required, Validators.email]],
      pwGroup: this.fb.group({
        password: ['', [Validators.required, Validators.minLength(6)]],
        confirmPassword: ['', [Validators.required, Validators.minLength(6)]]
      }, {validator: comparePassword}),
      country: ['', Validators.required],
      age: ['', [Validators.required, Validators.min(18)]],
      gender: ['', Validators.required],
      phone: ['', [Validators.pattern(/^\+84\d{9,10}$/), Validators.required ]]
    });

    // update form state
    this.registerForm.patchValue({
      email: 'info@example.com',
      pwGroup: {
        password: 'abcdef',
        confirmPassword: 'abcdef'
      },
      country: 'vn',
    });

  }

  onSubmit() {
  }

}
