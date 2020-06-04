import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListBuildingComponent} from './Component/building/list-building/list-building.component';



const routes: Routes = [
  {
    path: 'buildings',
    component: ListBuildingComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
