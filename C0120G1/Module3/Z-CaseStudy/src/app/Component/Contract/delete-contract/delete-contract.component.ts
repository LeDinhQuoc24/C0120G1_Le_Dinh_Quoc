import {Component, Inject, OnInit} from '@angular/core';
// @ts-ignore
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material';
import {ContractService} from '../../../Service/contract.service';


@Component({
  selector: 'app-delete-contract',
  templateUrl: './delete-contract.component.html',
  styleUrls: ['./delete-contract.component.css']
})
export class DeleteContractComponent implements OnInit {

  public contractName;
  public contractId;

  constructor(
    public dialogRef: MatDialogRef<DeleteContractComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public contractService: ContractService,
  ) { }

  ngOnInit(): void {
    this.contractName = this.data.data1.name;
    this.contractId = this.data.data1.id;

  }

  deleteContract() {
    this.contractService.deleteContract(this.contractId).subscribe(data => {
      this.dialogRef.close();
    });
  }

}

