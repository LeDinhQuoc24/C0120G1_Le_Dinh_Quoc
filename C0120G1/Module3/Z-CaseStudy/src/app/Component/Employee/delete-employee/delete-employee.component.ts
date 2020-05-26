import {Component, Inject, OnInit} from '@angular/core';
// @ts-ignore
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material';
import {EmployeeService} from '../../../Service/employee.service';

@Component({
  selector: 'app-delete-employee',
  templateUrl: './delete-employee.component.html',
  styleUrls: ['./delete-employee.component.css']
})
export class DeleteEmployeeComponent implements OnInit {
  public employeeName;
  public employeeId;

  constructor(
    public dialogRef: MatDialogRef<DeleteEmployeeComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public employeeService: EmployeeService
  ) { }

  ngOnInit(): void {
    this.employeeName = this.data.data1.name;
    this.employeeId = this.data.data1.id;

  }

  deleteEmployee() {
    this.employeeService.deleteEmployee(this.employeeId).subscribe(data => {
      this.dialogRef.close();
    });
  }

}
