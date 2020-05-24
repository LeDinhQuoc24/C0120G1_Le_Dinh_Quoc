import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { MenuComponent } from './Component/menu/menu.component';
import { ListCustomerComponent } from './Component/Customer/list-customer/list-customer.component';
import { AddCustomerComponent } from './Component/Customer/add-customer/add-customer.component';
import { EditCustomerComponent } from './Component/Customer/edit-customer/edit-customer.component';
import {CustomerService} from './Service/customer.service';
import {HttpClientModule} from '@angular/common/http';
import { CustomersComponent } from './Component/Customer/customers/customers.component';
import { ServicesComponent } from './Component/Service/services/services.component';
import { AddServiceComponent } from './Component/Service/add-service/add-service.component';
import { EditServiceComponent } from './Component/Service/edit-service/edit-service.component';
import { ListServiceComponent } from './Component/Service/list-service/list-service.component';
import { EmployeesComponent } from './Component/Employee/employees/employees.component';
import { ListEmployeeComponent } from './Component/Employee/list-employee/list-employee.component';
import { AddEmployeeComponent } from './Component/Employee/add-employee/add-employee.component';
import { EditEmployeeComponent } from './Component/Employee/edit-employee/edit-employee.component';


@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    ListCustomerComponent,
    AddCustomerComponent,
    EditCustomerComponent,
    CustomersComponent,
    ServicesComponent,
    AddServiceComponent,
    EditServiceComponent,
    ListServiceComponent,
    EmployeesComponent,
    ListEmployeeComponent,
    AddEmployeeComponent,
    EditEmployeeComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
    CustomerService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
