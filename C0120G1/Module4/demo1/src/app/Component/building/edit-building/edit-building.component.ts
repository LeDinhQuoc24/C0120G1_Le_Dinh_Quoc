import {Component, Inject, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {FormBuilder, FormGroup} from '@angular/forms';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material';
import {BuildingService} from '../../../Service/building.service';
import {ActivatedRoute, Params, Router} from '@angular/router';
import {BuildingModel} from '../../../Model/building.model';

@Component({
  selector: 'app-edit-building',
  templateUrl: './edit-building.component.html',
  styleUrls: ['./edit-building.component.css']
})
export class EditBuildingComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  editBuildingForm: FormGroup;
  message = '';
  public id: number;
  constructor(
    public dialogRef: MatDialogRef<EditBuildingComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public buildingService: BuildingService,
    public routerService: Router,
    private fb: FormBuilder,
  ) {
  }
  ngOnInit() {
    this.editBuildingForm = this.fb.group({
      abbreviationName: [''],
      fullName: [''],
      taxCode: [''],
      phone: [''],
      email: [''],
      fax: [''],
      address: [''],
      management: [''],
      manager: [''],
      accountNumber: [''],
      recipientName: [''],
      bank: [''],
      logo: ['']
    });
    this.loadData();
  }
  loadData() {
    this.id = this.data.data1.id;
    this.editBuildingForm.patchValue(this.data.data1);
  }
  onEditBuilding() {
    this.subscription = this.buildingService.update(this.editBuildingForm.value, this.id).subscribe(data => {
      this.routerService.navigate(['buildings']);
      this.message = 'Chỉnh sửa thành công thông tin tòa nhà';
    });
    this.dialogRef.close();
  }
  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }
}
