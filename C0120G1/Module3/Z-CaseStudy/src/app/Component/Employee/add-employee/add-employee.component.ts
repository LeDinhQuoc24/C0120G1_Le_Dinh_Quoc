import { Component, OnInit } from '@angular/core';
import {Employee} from '../../../Model/employee.model';
import {Subscription} from 'rxjs';
import {EmployeeService} from '../../../Service/employee.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {
  public employee: Employee;
  public subscription: Subscription;

  constructor(
    public employeeService: EmployeeService,
    public routerService: Router
  ) {}
  ngOnInit() {
    this.employee = new Employee();
  }

  onAddEmployee() {
    this.subscription = this.employeeService.addEmployee(this.employee).subscribe(data => {
      if (data && data.id) {
        this.routerService.navigate(['employees']);
      }
    });
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }

}
