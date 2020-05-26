import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {ContractDetail} from '../../../Model/contractDetail.model';
import {ContractDetailService} from '../../../Service/contractDetail.service';
import {MatDialog} from '@angular/material';
import {DeleteContractDetailComponent} from '../delete-contract-detail/delete-contract-detail.component';
import {Contract} from '../../../Model/contract.model';



@Component({
  selector: 'app-list-contract-detail',
  templateUrl: './list-contract-detail.component.html',
  styleUrls: ['./list-contract-detail.component.css']
})
export class ListContractDetailComponent implements OnInit, OnDestroy {

  public subscription: Subscription;
  public contractDetails: ContractDetail[];
  public totalRec: number;
  public page = 1;
  public searchText;
  message = '';


  constructor(
    public contractDetailService: ContractDetailService,
    public dialog: MatDialog
  ) {
  }

  ngOnInit() {
    this.subscription = this.contractDetailService.getAllContractDetails().subscribe((data: ContractDetail[]) => {
      this.contractDetails = data;
      this.totalRec = this.contractDetails.length;


    });
  }
  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }
  openDialog(id): void {
    this.contractDetailService.getContractDetail(id).subscribe(dataOfContractDetail => {
      const dialogRef = this.dialog.open(DeleteContractDetailComponent, {
        width: '500px',
        height: '200px',
        data: {data1: dataOfContractDetail},
        disableClose: true,
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    });
  }
}
