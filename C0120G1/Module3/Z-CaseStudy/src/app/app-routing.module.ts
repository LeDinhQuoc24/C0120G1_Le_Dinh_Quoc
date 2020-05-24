import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {MenuComponent} from './Component/menu/menu.component';
import {ListCustomerComponent} from './Component/list-customer/list-customer.component';
import {AddCustomerComponent} from './Component/add-customer/add-customer.component';
import {CustomersComponent} from './Component/customers/customers.component';
import {EditCustomerComponent} from './Component/edit-customer/edit-customer.component';


const routes: Routes = [
  {path: '', component: MenuComponent},
  {path: 'home', component: MenuComponent},
  {
    path: 'customers',
    component: CustomersComponent,
    children: [
      {path: '', component: ListCustomerComponent},
      {path: 'addCustomer', component: AddCustomerComponent},
      {path: ':id/edit', component: EditCustomerComponent}
    ]
  },

];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
