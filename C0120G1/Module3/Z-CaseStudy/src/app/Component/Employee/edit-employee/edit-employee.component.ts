import {Component, OnDestroy, OnInit} from '@angular/core';
import {Employee} from '../../../Model/employee.model';
import {Subscription} from 'rxjs';
import {EmployeeService} from '../../../Service/employee.service';
import {ActivatedRoute, Params, Router} from '@angular/router';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-edit-employee',
  templateUrl: './edit-employee.component.html',
  styleUrls: ['./edit-employee.component.css']
})
export class EditEmployeeComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public subscriptionParams: Subscription;
  addEmployeeForm: FormGroup;
  public id: number;
  message = '';

  constructor(
    public employeeService: EmployeeService,
    public routerService: Router,
    public activatedRouteService: ActivatedRoute,
    private fb: FormBuilder
  ) {
  }

  ngOnInit() {
    this.addEmployeeForm = this.fb.group({
      name: ['', [Validators.required]],
      codeEmployee: ['', [Validators.required, Validators.pattern(/^NV-\d{4}$/)]],
      birthday: ['', [Validators.required]],
      idCard: ['', [Validators.pattern(/^\d{9}(\d{3})?$/), Validators.required ]],
      phone: ['', [Validators.pattern(/^(090|091|(84\+90)|(84\+91))\d{7}$/), Validators.required ]],
      email: ['', [Validators.required, Validators.email]],
      degree: ['', [Validators.required]],
      part: ['', [Validators.required]],
      position: ['', [Validators.required]]
    });
    this.loadData();
  }

  loadData() {
    this.subscriptionParams = this.activatedRouteService.params.subscribe((data: Params) => {
      this.id = data.id;
      this.subscription = this.employeeService.getEmployee(this.id ).subscribe((employee: Employee) => {
        this.addEmployeeForm.patchValue(employee);
      });
    });
  }

  onEditEmployee() {
    console.log(this.addEmployeeForm);
    console.log(this.id);
    this.subscription = this.employeeService.updateEmployee(this.addEmployeeForm.value, this.id ).subscribe((data: Employee) => {
      this.routerService.navigate(['employees']);
    });
    this.message = 'Chỉnh sửa thành công thông tin nhân viên';
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
