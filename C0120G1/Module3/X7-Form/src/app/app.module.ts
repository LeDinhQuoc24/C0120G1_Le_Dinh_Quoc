// @ts-ignore
import { BrowserModule } from '@angular/platform-browser';
// @ts-ignore
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
<<<<<<< HEAD
=======
// @ts-ignore
>>>>>>> ecee2cb22daede0be07142c6cbaff6317f72d71d
import {ReactiveFormsModule} from '@angular/forms';


// @ts-ignore
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
