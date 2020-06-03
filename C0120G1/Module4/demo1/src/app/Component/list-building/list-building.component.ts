import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {BuildingModel} from '../../Model/building.model';
import {BuildingService} from '../../Service/building.service';
import {DeleteBuildingComponent} from '../delete-building/delete-building.component';
import {MatDialog} from '@angular/material';
import {AddBuildingComponent} from '../add-building/add-building.component';

@Component({
  selector: 'app-list-building',
  templateUrl: './list-building.component.html',
  styleUrls: ['./list-building.component.css']
})
export class ListBuildingComponent implements OnInit, OnDestroy {

  public subscription: Subscription;
  public buildings: BuildingModel[];
  public totalRec: number;
  public page = 1;
  public searchText;
  message = '';

  constructor(
    public buildingService: BuildingService,
    public dialog: MatDialog
  ) {
  }

  ngOnInit() {
    this.subscription = this.buildingService.findAll().subscribe((data: BuildingModel[]) => {
      this.buildings = data;
      this.totalRec = this.buildings.length;
    });
  }
  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }
  openDialogAddNew(): void {
      const dialogRef = this.dialog.open(AddBuildingComponent, {
        width: '1200px',
        height: '840px',
        disableClose: true,
      });

      dialogRef.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
  }


  openDialog(id): void {
    this.buildingService.findOne(id).subscribe(dataOfBuilding => {
      const dialogRef = this.dialog.open(DeleteBuildingComponent, {
        width: '500px',
        height: '240px',
        data: {data1: dataOfBuilding},
        disableClose: true,
      });
      dialogRef.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
    });
  }
}
