import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {MenuComponent} from './Component/menu/menu.component';
import {ListCustomerComponent} from './Component/Customer/list-customer/list-customer.component';
import {AddCustomerComponent} from './Component/Customer/add-customer/add-customer.component';
import {CustomersComponent} from './Component/Customer/customers/customers.component';
import {EditCustomerComponent} from './Component/Customer/edit-customer/edit-customer.component';
import {ServicesComponent} from './Component/Service/services/services.component';
import {ListServiceComponent} from './Component/Service/list-service/list-service.component';
import {AddServiceComponent} from './Component/Service/add-service/add-service.component';
import {EditServiceComponent} from './Component/Service/edit-service/edit-service.component';
import {EmployeesComponent} from './Component/Employee/employees/employees.component';
import {ListEmployeeComponent} from './Component/Employee/list-employee/list-employee.component';
import {AddEmployeeComponent} from './Component/Employee/add-employee/add-employee.component';
import {EditEmployeeComponent} from './Component/Employee/edit-employee/edit-employee.component';
import {ContractsComponent} from './Component/Contract/contracts/contracts.component';
import {ListContractComponent} from './Component/Contract/list-contract/list-contract.component';
import {AddContractComponent} from './Component/Contract/add-contract/add-contract.component';
import {EditContractComponent} from './Component/Contract/edit-contract/edit-contract.component';
import {ListContractDetailComponent} from './Component/ContractDetail/list-contract-detail/list-contract-detail.component';
import {AddContractDetailComponent} from './Component/ContractDetail/add-contract-detail/add-contract-detail.component';
import {EditContractDetailComponent} from './Component/ContractDetail/edit-contract-detail/edit-contract-detail.component';


const routes: Routes = [
  {path: '', component: MenuComponent},
  {path: 'home', component: MenuComponent},
  {
    path: 'customers',
    component: CustomersComponent,
    children: [
      {path: '', component: ListCustomerComponent},
      {path: 'add', component: AddCustomerComponent},
      {path: ':id/edit', component: EditCustomerComponent}
    ]
  },
  {
    path: 'services',
    component: ServicesComponent,
    children: [
      {path: '', component: ListServiceComponent},
      {path: 'add', component: AddServiceComponent},
      {path: ':id/edit', component: EditServiceComponent}
    ]
  },
  {
    path: 'employees',
    component: EmployeesComponent,
    children: [
      {path: '', component: ListEmployeeComponent},
      {path: 'add', component: AddEmployeeComponent},
      {path: ':id/edit', component: EditEmployeeComponent}
    ]
  },
  {
    path: 'contracts',
    component: ContractsComponent,
    children: [
      {path: '', component: ListContractComponent},
      {path: 'add', component: AddContractComponent},
      {path: ':id/edit', component: EditContractComponent}
    ]
  },
  {
    path: 'contractDetails',
    component: ContractsComponent,
    children: [
      {path: '', component: ListContractDetailComponent},
      {path: 'add', component: AddContractDetailComponent},
      {path: ':id/edit', component: EditContractDetailComponent}
    ]
  },
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
