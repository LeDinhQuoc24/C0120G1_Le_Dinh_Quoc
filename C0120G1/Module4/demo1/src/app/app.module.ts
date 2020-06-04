import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddBuildingComponent } from './Component/building/add-building/add-building.component';
import { EditBuildingComponent } from './Component/building/edit-building/edit-building.component';
import { DeleteBuildingComponent } from './Component/building/delete-building/delete-building.component';
import { ListBuildingComponent } from './Component/building/list-building/list-building.component';
import { ViewBuildingComponent } from './Component/building/view-building/view-building.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {NgxPaginationModule} from 'ngx-pagination';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatDialogModule} from '@angular/material';


@NgModule({
  declarations: [
    AppComponent,
    AddBuildingComponent,
    EditBuildingComponent,
    DeleteBuildingComponent,
    ListBuildingComponent,
    ViewBuildingComponent
  ],
  entryComponents: [
    AddBuildingComponent,
    ViewBuildingComponent,
    EditBuildingComponent,
    DeleteBuildingComponent
  ],
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
