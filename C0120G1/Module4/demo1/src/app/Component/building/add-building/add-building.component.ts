import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {BuildingService} from '../../../Service/building.service';
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
      abbreviationName: ['', [Validators.required, Validators.minLength(2), Validators.maxLength(25)]],
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

    this.subscription = this.buildingService.save(this.addBuildingForm.value).subscribe(data => {
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
