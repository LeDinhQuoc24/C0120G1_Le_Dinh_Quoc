import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { NameCardComponent } from './name-card/name-card.component';
import { ProgressBarComponent } from './progress-bar/progress-bar.component';
import { AngularRatingBarComponent } from './angular-rating-bar/angular-rating-bar.component';
import {FormsModule} from '@angular/forms';
import { AngularCountdownComponent } from './angular-countdown/angular-countdown.component';
import { AngularRatingBar2Component } from './angular-rating-bar2/angular-rating-bar2.component';



@NgModule({
  declarations: [
    AppComponent,
    NameCardComponent,
    ProgressBarComponent,
    AngularRatingBarComponent,
    AngularCountdownComponent,
    AngularRatingBar2Component,
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
