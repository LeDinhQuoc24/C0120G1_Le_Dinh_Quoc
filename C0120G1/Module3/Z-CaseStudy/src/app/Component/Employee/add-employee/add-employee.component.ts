import {Component, OnDestroy, OnInit} from '@angular/core';
import {Employee} from '../../../Model/employee.model';
import {Subscription} from 'rxjs';
import {EmployeeService} from '../../../Service/employee.service';
import {Router} from '@angular/router';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  addEmployeeForm: FormGroup;
  message = '';

  constructor(
    public employeeService: EmployeeService,
    public routerService: Router,
    private fb: FormBuilder
  ) {}
  ngOnInit() {
    this.addEmployeeForm = this.fb.group({
      name: ['', [Validators.required]],
      birthday: ['', [Validators.required]],
      idCard: ['', [Validators.pattern(/^\d{9,10}$/), Validators.required ]],
      phone: ['', [Validators.pattern(/090\d{7,8}$/), Validators.required ]],
      email: ['', [Validators.required, Validators.email]],
      degree: ['', [Validators.required]],
      part: ['', [Validators.required]],
      position: ['', [Validators.required]]
    });
  }

  onAddEmployee() {
    this.subscription = this.employeeService.addEmployee(this.addEmployeeForm.value).subscribe(data => {
      if (data && data.id) {
        this.routerService.navigate(['employees']);
      }
    });
    this.message = 'Thêm mới thành công thông tin nhân viên';
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }

}
