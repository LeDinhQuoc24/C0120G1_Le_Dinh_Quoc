import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { MenuComponent } from './Component/menu/menu.component';
import { ListServiceComponent } from './Service/list-service/list-service.component';
import { ListCustomerComponent } from './Component/list-customer/list-customer.component';
import { AddCustomerComponent } from './Component/add-customer/add-customer.component';
import { EditCustomerComponent } from './Component/edit-customer/edit-customer.component';
import {CustomerService} from './Service/customer.service';
import {HttpClientModule} from '@angular/common/http';
import { CustomersComponent } from './Component/customers/customers.component';


@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    ListServiceComponent,

    ListCustomerComponent,
    AddCustomerComponent,
    EditCustomerComponent,
    CustomersComponent,

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
