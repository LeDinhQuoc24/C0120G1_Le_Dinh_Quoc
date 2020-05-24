import {Component, OnDestroy, OnInit} from '@angular/core';
import {Employee} from '../../../Model/employee.model';
import {Subscription} from 'rxjs';
import {EmployeeService} from '../../../Service/employee.service';
import {ActivatedRoute, Params, Router} from '@angular/router';

@Component({
  selector: 'app-edit-employee',
  templateUrl: './edit-employee.component.html',
  styleUrls: ['./edit-employee.component.css']
})
export class EditEmployeeComponent implements OnInit, OnDestroy {
  public employee: Employee;
  public subscription: Subscription;
  public subscriptionParams: Subscription;

  constructor(
    public employeeService: EmployeeService,
    public routerService: Router,
    public activatedRouteService: ActivatedRoute
  ) {
  }

  ngOnInit() {
    this.employee = new Employee();
    this.loadData();
  }

  loadData() {
    this.subscriptionParams = this.activatedRouteService.params.subscribe((data: Params) => {
      const id = data.id;
      this.subscription = this.employeeService.getEmployee(id).subscribe((employee: Employee) => {
        this.employee = employee;
      });
    });
  }

  onEditEmployee() {
    // @ts-ignore
    this.subscription = this.employeeService.updateEmployee( this.employee).subscribe((data: Employee) => {
      this.routerService.navigate(['employees']);
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
