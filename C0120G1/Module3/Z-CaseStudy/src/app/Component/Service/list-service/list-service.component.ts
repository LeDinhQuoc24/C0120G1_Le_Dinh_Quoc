import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {Service} from '../../../Model/service.model';
import {ServiceService} from '../../../Service/service.service';

import {MatDialog} from '@angular/material';
import {DeleteServiceComponent} from '../delete-service/delete-service.component';

@Component({
  selector: 'app-list-service',
  templateUrl: './list-service.component.html',
  styleUrls: ['./list-service.component.css']
})
export class ListServiceComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public services: Service[];
  public totalRec: number;
  public page = 1;
  public searchText;
  message = '';


  constructor(
    public serviceService: ServiceService,
    public dialog: MatDialog
  ) {
  }

  ngOnInit() {
    this.subscription = this.serviceService.getAllServices().subscribe((data: Service[]) => {
      this.services = data;
      this.totalRec = this.services.length;
    });
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }


  // onDeleteService(id: number) {
  //   this.subscription = this.serviceService.deleteService(id).subscribe((data: Service) => {
  //     this.updateDataAfterDelete(id);
  //   });
  //   this.message = 'Xóa thành công thông tin dịch vụ';
  // }
  // updateDataAfterDelete(id: number) {
  //   for (let i = 0; i < this.services.length; i++) {
  //     // tslint:disable-next-line:triple-equals
  //     if (this.services[i].id == id) {
  //       this.services.splice(i, 1);
  //       break;
  //     }
  //   }
  // }
  openDialog(id): void {
    this.serviceService.getService(id).subscribe(dataOfService => {
      const dialogRef = this.dialog.open(DeleteServiceComponent, {
        width: '500px',
        height: '200px',
        data: {data1: dataOfService},
        disableClose: true,
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    });
  }
}
