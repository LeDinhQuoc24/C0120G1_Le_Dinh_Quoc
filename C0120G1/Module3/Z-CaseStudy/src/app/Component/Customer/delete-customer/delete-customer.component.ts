import {Component, Inject, OnInit} from '@angular/core';
import {CustomerService} from '../../../Service/customer.service';
// @ts-ignore
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material';

@Component({
  selector: 'app-delete-customer',
  templateUrl: './delete-customer.component.html',
  styleUrls: ['./delete-customer.component.css']
})
export class DeleteCustomerComponent implements OnInit {

  public customerName;
public customerId;

constructor(
  public dialogRef: MatDialogRef<DeleteCustomerComponent>,
@Inject(MAT_DIALOG_DATA) public data: any,
  public customerService: CustomerService,
) { }

ngOnInit(): void {
  this.customerName = this.data.data1.name;
this.customerId = this.data.data1.id;

}

deleteCustomer() {
  this.customerService.deleteCustomer(this.customerId).subscribe(data => {
    this.dialogRef.close();
  });
}

}
