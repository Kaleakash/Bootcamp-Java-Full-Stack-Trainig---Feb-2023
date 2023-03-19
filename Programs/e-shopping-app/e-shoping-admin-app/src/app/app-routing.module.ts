import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactusComponent } from './contactus/contactus.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { SigninComponent } from './signin/signin.component';
// we have to write navigation rules 
// http://localhost:4200/aboutus
const routes: Routes = [
{path:"aboutus",component:AboutusComponent},
{path:"contactus",component:ContactusComponent},
{path:"login",component:SigninComponent},
{path:"home",component:DashboardComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
