import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {Employee} from '../../../Model/employee.model';
import {EmployeeService} from '../../../Service/employee.service';

@Component({
  selector: 'app-list-employee',
  templateUrl: './list-employee.component.html',
  styleUrls: ['./list-employee.component.css']
})
export class ListEmployeeComponent implements OnInit, OnDestroy {

  public subscription: Subscription;
  public employees: Employee[];
  public totalRec: number;
  public page = 1;
  public searchText;
  message = '';

  constructor(public employeeService: EmployeeService) {
  }

  ngOnInit() {
    this.subscription = this.employeeService.getAllEmployees().subscribe((data: Employee[]) => {
      this.employees = data;
      this.totalRec = this.employees.length;
    });
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }


  onDeleteEmployee(id: number) {
    this.subscription = this.employeeService.deleteEmployee(id).subscribe((data: Employee) => {
      this.updateDataAfterDelete(id);
    });
    this.message = 'Xóa thành công thông tin nhân viên';
  }

  updateDataAfterDelete(id: number) {
    for (let i = 0; i < this.employees.length; i++) {
      // tslint:disable-next-line:triple-equals
      if (this.employees[i].id == id) {
        this.employees.splice(i, 1);
        break;
      }
    }
  }
}

