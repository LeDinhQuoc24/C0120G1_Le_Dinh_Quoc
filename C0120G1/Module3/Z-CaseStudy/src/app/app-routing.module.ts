import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {MenuComponent} from './Component/menu/menu.component';
import {ListServiceComponent} from './Service/list-service/list-service.component';
import {ListCustomerComponent} from './Component/list-customer/list-customer.component';
import {AddCustomerComponent} from './Component/add-customer/add-customer.component';
import {CustomersComponent} from './Component/customers/customers.component';


const routes: Routes = [
  {path: '', component: MenuComponent},
  {path: 'home', component: MenuComponent},
  {path: 'service/list', component: ListServiceComponent},
  {
    path: 'customers',
    component: CustomersComponent,
    children: [
      {path: '', component: ListCustomerComponent},
      {path: 'listCustomer', component: ListCustomerComponent},
      {path: 'addCustomer', component: AddCustomerComponent}
    ]
  },
  // {path: 'addCustomer', component: AddCustomerComponent},

];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
