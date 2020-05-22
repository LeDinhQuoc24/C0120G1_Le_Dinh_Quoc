import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {MenuComponent} from './Menu/menu/menu.component';
import {ListServiceComponent} from './Service/list-service/list-service.component';


const routes: Routes = [
  {path: '', component: MenuComponent},
  {path: 'home', component: MenuComponent},
  {path: 'service/list', component: ListServiceComponent}
  // {
  //   path: 'service',
  //   component: ServiceComponent,
  //   children: [
  //     {
  //       path: 'add',
  //       component: AddComponent
  //     },
  //     {
  //       path: 'edit',
  //       component: EditComponent
  //     },
  //     {
  //       path: 'remove',
  //       component: RemoveComponent
  //     },
  //   ]
  // }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
