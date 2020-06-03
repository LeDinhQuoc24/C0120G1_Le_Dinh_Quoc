import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BuildingComponent } from './Component/building/building.component';
import { AddBuildingComponent } from './Component/add-building/add-building.component';
import { EditBuildingComponent } from './Component/edit-building/edit-building.component';
import { DeleteBuildingComponent } from './Component/delete-building/delete-building.component';
import { ListBuildingComponent } from './Component/list-building/list-building.component';
import { ViewBuildingComponent } from './Component/view-building/view-building.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {NgxPaginationModule} from 'ngx-pagination';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatDialogModule} from '@angular/material';


@NgModule({
  declarations: [
    AppComponent,
    BuildingComponent,
    AddBuildingComponent,
    EditBuildingComponent,
    DeleteBuildingComponent,
    ListBuildingComponent,
    ViewBuildingComponent
  ],
  // entryComponents: [
  //   DeleteBuildingComponent
  // ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        MatDialogModule,
        HttpClientModule,
        NgxPaginationModule,
        Ng2SearchPipeModule,
        FormsModule,
        BrowserAnimationsModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
