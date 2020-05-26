import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material';
import {ContractDetailService} from '../../../Service/contractDetail.service';

@Component({
  selector: 'app-delete-contract-detail',
  templateUrl: './delete-contract-detail.component.html',
  styleUrls: ['./delete-contract-detail.component.css']
})
export class DeleteContractDetailComponent implements OnInit {

  public contractDetailStartDate;
  public contractDetailId;

  constructor(
    public dialogRef: MatDialogRef<DeleteContractDetailComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public contractDetailService: ContractDetailService,
  ) { }

  ngOnInit(): void {
    this.contractDetailStartDate = this.data.data1.startDate;
    this.contractDetailId = this.data.data1.id;

  }

  deleteContractDetail() {
    this.contractDetailService.deleteContractDetail(this.contractDetailId).subscribe(data => {
      this.dialogRef.close();
    });
  }

}

