import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material';
import {ServiceService} from '../../../Service/service.service';

@Component({
  selector: 'app-delete-service',
  templateUrl: './delete-service.component.html',
  styleUrls: ['./delete-service.component.css']
})
export class DeleteServiceComponent implements OnInit {

  public serviceName;
  public serviceId;

  constructor(
    public dialogRef: MatDialogRef<DeleteServiceComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public serviceService: ServiceService,
  ) { }

  ngOnInit(): void {
    this.serviceName = this.data.data1.name;
    this.serviceId = this.data.data1.id;

  }

  deleteService() {
    this.serviceService.deleteService(this.serviceId).subscribe(data => {
      this.dialogRef.close();
    });
  }

}
