import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material';
import {BuildingService} from '../../../Service/building.service';

@Component({
  selector: 'app-delete-building',
  templateUrl: './delete-building.component.html',
  styleUrls: ['./delete-building.component.css']
})
export class DeleteBuildingComponent implements OnInit {
  public buildingName;
  public buildingId;
  constructor(
    public dialogRef: MatDialogRef<DeleteBuildingComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public buildingService: BuildingService,
  ) { }
  ngOnInit(): void {
    this.buildingName = this.data.data1.fullName;
    this.buildingId = this.data.data1.id;
  }
  deleteBuilding() {
    this.buildingService.delete(this.buildingId).subscribe(data => {
      this.dialogRef.close();
    });
  }

}
