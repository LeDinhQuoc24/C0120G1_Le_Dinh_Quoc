import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {BuildingService} from '../../Service/building.service';
import {Router} from '@angular/router';
import {MatDialogRef} from '@angular/material';

@Component({
  selector: 'app-add-building',
  templateUrl: './add-building.component.html',
  styleUrls: ['./add-building.component.css']
})
export class AddBuildingComponent implements OnInit, OnDestroy {

  public subscription: Subscription;
  addBuildingForm: FormGroup;
  message = '';

  constructor(
    public dialogRef: MatDialogRef<AddBuildingComponent>,
    public buildingService: BuildingService,
    public routerService: Router,
    private fb: FormBuilder
  ) {
  }

  ngOnInit() {
    this.addBuildingForm = this.fb.group({
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
  }

  onAddBuilding() {
    console.log('afsdfs');
    this.subscription = this.buildingService.save(this.addBuildingForm.value).subscribe(data => {
      // if (data && data.id) {
      this.routerService.navigate(['buildings']);
      console.log('if1');
      // }
      this.message = 'Thêm mới thành công thông tin tòa nhà';
      console.log('if2');
    });
    this.dialogRef.close();
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }

}
