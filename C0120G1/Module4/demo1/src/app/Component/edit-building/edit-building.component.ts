import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {FormBuilder, FormGroup} from '@angular/forms';
import {MatDialogRef} from '@angular/material';
import {BuildingService} from '../../Service/building.service';
import {ActivatedRoute, Params, Router} from '@angular/router';
import {BuildingModel} from '../../Model/building.model';

@Component({
  selector: 'app-edit-building',
  templateUrl: './edit-building.component.html',
  styleUrls: ['./edit-building.component.css']
})
export class EditBuildingComponent implements OnInit, OnDestroy {

  public subscription: Subscription;
  public subscriptionParams: Subscription;
  editBuildingForm: FormGroup;
  message = '';
  public id: number;

  constructor(
    public dialogRef: MatDialogRef<EditBuildingComponent>,
    public buildingService: BuildingService,
    public routerService: Router,
    public activatedRouteService: ActivatedRoute,
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
  this.subscriptionParams = this.activatedRouteService.params.subscribe((data: Params) => {
    this.id = data.id;
    this.subscription = this.buildingService.findOne(this.id).subscribe((building: BuildingModel) => {
      this.editBuildingForm.patchValue(building);
    });
  });
}

onEditBuilding() {

  this.subscription = this.buildingService.save(this.editBuildingForm.value).subscribe(data => {
    // if (data && data.id) {
    this.routerService.navigate(['buildings']);

    // }
    this.message = 'Thêm mới thành công thông tin tòa nhà';

  });
  this.dialogRef.close();
}

ngOnDestroy() {
  if (this.subscription) {
    this.subscription.unsubscribe();
  }
}

}
