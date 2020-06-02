import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {BuildingComponent} from './Component/building/building.component';
import {ListBuildingComponent} from './Component/list-building/list-building.component';
import {AddBuildingComponent} from './Component/add-building/add-building.component';
import {EditBuildingComponent} from './Component/edit-building/edit-building.component';


const routes: Routes = [
  {
    path: 'building',
    component: BuildingComponent,
    children: [
      {path: '', component: ListBuildingComponent},
      {path: 'add', component: AddBuildingComponent},
      {path: ':id/edit', component: EditBuildingComponent}
    ]
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
