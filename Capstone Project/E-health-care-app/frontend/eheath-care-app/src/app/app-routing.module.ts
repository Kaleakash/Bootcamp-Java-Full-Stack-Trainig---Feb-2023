import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { CustomerdashboardComponent } from './customerdashboard/customerdashboard.component';
import { SignupComponent } from './signup/signup.component';

const routes: Routes = [
  {path:"",component:LoginComponent},
  {path:"SignUp",component:SignupComponent},
  {path:"adminhome",component:AdmindashboardComponent,children:[
    {path:"addMedicine"}
  
  ]},
  {path:"customerhome",component:CustomerdashboardComponent,children:[
    {path:"viewMedicine"}
  ]},

  {path:"login",component:LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
