import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {ContractDetailService} from '../../../Service/contractDetail.service';
import {Contract} from '../../../Model/contract.model';
import {ContractService} from '../../../Service/contract.service';

@Component({
  selector: 'app-add-contract-detail',
  templateUrl: './add-contract-detail.component.html',
  styleUrls: ['./add-contract-detail.component.css']
})
export class AddContractDetailComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  addContractDetailForm: FormGroup;
  public contracts: Contract[];
  message = '';

  constructor(
    public contractDetailService: ContractDetailService,
    public routerService: Router,
    private fb: FormBuilder,
    public contractService: ContractService
  ) {
  }
  ngOnInit() {
    this.contractService.getAllContracts().subscribe(data =>
      this.contracts = data);
    this.addContractDetailForm = this.fb.group({
      startDate: ['', [Validators.required]],
      nameServiceBonus: ['', [Validators.required]],
      quantity: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
    });
  }

  onAddContractDetail() {
    console.log(this.addContractDetailForm);
    this.subscription = this.contractDetailService.addContractDetail(this.addContractDetailForm.value).subscribe(data => {
      if (data && data.id) {
        this.routerService.navigate(['contractDetails']);
      }
      this.message = 'Thêm mới thành công thông tin hợp đồng chi tiết';
    });
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }

}
