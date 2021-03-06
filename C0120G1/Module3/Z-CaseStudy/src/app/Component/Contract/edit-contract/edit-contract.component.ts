import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ContractService} from '../../../Service/contract.service';
import {ActivatedRoute, Params, Router} from '@angular/router';
import {Contract} from '../../../Model/contract.model';
import {Employee} from '../../../Model/employee.model';
import {Service} from '../../../Model/service.model';
import {CustomerService} from '../../../Service/customer.service';
import {EmployeeService} from '../../../Service/employee.service';
import {ServiceService} from '../../../Service/service.service';
import {Customer} from '../../../Model/customer.model';

@Component({
  selector: 'app-edit-contract',
  templateUrl: './edit-contract.component.html',
  styleUrls: ['./edit-contract.component.css']
})
export class EditContractComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public subscriptionParams: Subscription;
  addContractForm: FormGroup;
  public customers: Customer[] ;
  public employees: Employee[] ;
  public services: Service[];
  message = '';
  public id: number;

  constructor(
    public contractService: ContractService,
    public routerService: Router,
    private fb: FormBuilder,
    public customerService: CustomerService,
    public employeeService: EmployeeService,
    public serviceService: ServiceService,
    public activatedRouteService: ActivatedRoute,

  ) {
  }

  ngOnInit() {
    this.customerService.getAllCustomers().subscribe(data =>
      this.customers = data);
    this.employeeService.getAllEmployees().subscribe(data =>
      this.employees = data);
    this.serviceService.getAllServices().subscribe(data =>
      this.services = data);
    this.addContractForm = this.fb.group({
      codeCustomer: ['', [Validators.required]],
      codeEmployee: ['', [Validators.required]],
      codeService: ['', [Validators.required]],
      startDate: ['', [Validators.required]],
      endDate: ['', [Validators.required]],
      deposit: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      total: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
    });
    this.loadData();
  }

  loadData() {
    this.subscriptionParams = this.activatedRouteService.params.subscribe((data: Params) => {
      this.id = data.id;
      this.subscription = this.contractService.getContract(this.id).subscribe((contract: Contract) => {
        this.addContractForm.patchValue(contract);
      });
    });
  }

  onEditContract() {
    this.subscription = this.contractService.updateContract(this.addContractForm.value, this.id).subscribe((data: Contract) => {
      this.routerService.navigate(['contracts']);
    });
    this.message = 'Chỉnh sửa thành công thông tin hợp đồng';
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

