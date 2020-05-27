import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ContractDetailService} from '../../../Service/contractDetail.service';
import {ActivatedRoute, Params, Router} from '@angular/router';
import {Contract} from '../../../Model/contract.model';
import {ContractService} from '../../../Service/contract.service';
import {ContractDetail} from '../../../Model/contractDetail.model';

@Component({
  selector: 'app-edit-contract-detail',
  templateUrl: './edit-contract-detail.component.html',
  styleUrls: ['./edit-contract-detail.component.css']
})
export class EditContractDetailComponent implements OnInit, OnDestroy {

  public subscription: Subscription;
  public subscriptionParams: Subscription;
  addContractDetailForm: FormGroup;
  public id: number;
  public contracts: Contract[];
  message = '';

  constructor(
    public contractDetailService: ContractDetailService,
    public routerService: Router,
    public activatedRouteService: ActivatedRoute,
    private fb: FormBuilder,
    public contractService: ContractService
  ) {
  }

  ngOnInit() {
    this.contractService.getAllContracts().subscribe(data =>
      this.contracts = data);
    this.addContractDetailForm = this.fb.group({
      idContract: ['', [Validators.required]],
      nameServiceBonus: ['', [Validators.required]],
      quantity: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
    });
    this.loadData();
  }

  loadData() {
    this.subscriptionParams = this.activatedRouteService.params.subscribe((data: Params) => {
      this.id = data.id;
      this.subscription = this.contractDetailService.getContractDetail(this.id).subscribe((contractDetail: ContractDetail) => {
        this.addContractDetailForm.patchValue(contractDetail);
      });
    });
  }
  onEditContractDetail() {
    // tslint:disable-next-line:max-line-length
    this.subscription = this.contractDetailService.updateContractDetail(this.addContractDetailForm.value, this.id).subscribe((data: ContractDetail) => {
      this.routerService.navigate(['contractDetails']);
    });
    this.message = 'Chỉnh sửa thành công thông tin khách hàng';
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
    if (this.subscriptionParams) {
      this.subscriptionParams.unsubscribe();
    }
  }

}

