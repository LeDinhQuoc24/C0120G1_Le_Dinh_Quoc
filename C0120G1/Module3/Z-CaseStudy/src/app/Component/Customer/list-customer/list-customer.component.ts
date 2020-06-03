import {Component, OnInit, OnDestroy} from '@angular/core';
import {CustomerService} from '../../../Service/customer.service';
import {Subscription} from 'rxjs';
import {Customer} from '../../../Model/customer.model';
import {DeleteCustomerComponent} from '../delete-customer/delete-customer.component';
// @ts-ignore
import {MatDialog} from '@angular/material';


@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public customers: Customer[];
  public totalRec: number;
  public page = 1;
  public searchText;
  message = '';

  constructor(
    public customerService: CustomerService,
    public dialog: MatDialog
  ) {
  }

  ngOnInit() {
    this.subscription = this.customerService.getAllCustomers().subscribe((data: Customer[]) => {
      this.customers = data;
      this.totalRec = this.customers.length;


    });
  }
  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }



  openDialog(id): void {
    this.customerService.getCustomer(id).subscribe(dataOfCustomer => {
      const dialogRef = this.dialog.open(DeleteCustomerComponent, {
        width: '500px',
        height: '240px',
        data: {data1: dataOfCustomer},
        disableClose: true,
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    });
  }
}
