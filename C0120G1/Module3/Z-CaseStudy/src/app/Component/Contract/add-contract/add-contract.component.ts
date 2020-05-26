import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ContractService} from '../../../Service/contract.service';
import {Router} from '@angular/router';
import {Customer} from '../../../Model/customer.model';
import {Employee} from '../../../Model/employee.model';
import {Service} from '../../../Model/service.model';
import {CustomerService} from '../../../Service/customer.service';
import {EmployeeService} from '../../../Service/employee.service';
import {ServiceService} from '../../../Service/service.service';

@Component({
  selector: 'app-add-contract',
  templateUrl: './add-contract.component.html',
  styleUrls: ['./add-contract.component.css']
})
export class AddContractComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  addContractForm: FormGroup;
  public customers: Customer[] ;
  public employees: Employee[] ;
  public services: Service[];
  message = '';

  constructor(
    public contractService: ContractService,
    public routerService: Router,
    private fb: FormBuilder,
    public customerService: CustomerService,
    public employeeService: EmployeeService,
    public serviceService: ServiceService
  ) {}
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
  }

  onAddContract() {
    this.subscription = this.contractService.addContract(this.addContractForm.value).subscribe(data => {
      if (data && data.id) {
        this.routerService.navigate(['contracts']);
      }
      this.message = 'Thêm mới thành công thông tin hợp đồng';
    });
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }

}

