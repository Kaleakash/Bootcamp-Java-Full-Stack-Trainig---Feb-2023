import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { Child } from './child.component';
import { HeaderComponent } from './header/header.component';

@NgModule({
  declarations: [
    AppComponent,Child, HeaderComponent      // we need to provide all component details. 
  ],
  imports: [
    BrowserModule     // we can import pre defined or user defined module 
  ],
  //providers: [],      // we can provide angular service details. 
  bootstrap: [AppComponent]   // providing parent component details. 
})
export class AppModule { }
