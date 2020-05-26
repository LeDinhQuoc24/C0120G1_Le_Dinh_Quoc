import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {Contract} from '../../../Model/contract.model';
import {ContractService} from '../../../Service/contract.service';

@Component({
  selector: 'app-list-contract',
  templateUrl: './list-contract.component.html',
  styleUrls: ['./list-contract.component.css']
})
export class ListContractComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public contracts: Contract[];
  public totalRec: number;
  public page = 1;
  public searchText;
  message = '';




  constructor(public contractService: ContractService) {
  }

  ngOnInit() {
    this.subscription = this.contractService.getAllContracts().subscribe((data: Contract[]) => {
      this.contracts = data;
      this.totalRec = this.contracts.length;


    });
  }
  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }


  onDeleteContract(id: number) {
    this.subscription = this.contractService.deleteContract(id).subscribe((data: Contract) => {
      this.updateDataAfterDelete(id);
      this.message = 'Xóa thành công thông tin hợp đồng';
    });
  }

  updateDataAfterDelete(id: number) {
    for (let i = 0; i < this.contracts.length; i++) {
      if (this.contracts[i].id === id) {
        this.contracts.splice(i, 1);
        break;
      }
    }
  }
}

