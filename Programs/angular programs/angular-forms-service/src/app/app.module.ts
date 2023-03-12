import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TdfLoginPageComponent } from './tdf-login-page/tdf-login-page.component';
import { MdfLoginPageComponent } from './mdf-login-page/mdf-login-page.component';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { LoginService } from './login.service';

@NgModule({
  declarations: [
    AppComponent,
        TdfLoginPageComponent,
    MdfLoginPageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,
    ReactiveFormsModule
  ],
  providers: [LoginService],    // provide service class details 
  bootstrap: [AppComponent]
})
export class AppModule { }
