import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { AuthGuard } from './auth/auth.guard';
import { ContactusComponent } from './contactus/contactus.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LogoutComponent } from './logout/logout.component';
import { ProductComponent } from './product/product/product.component';
import { SigninComponent } from './signin/signin.component';
import { CategoryComponent } from './category/category/category.component';
// we have to write navigation rules 
// http://localhost:4200/aboutus
const routes: Routes = [
{path:"aboutus",component:AboutusComponent},
{path:"contactus",component:ContactusComponent},
{path:"login",component:SigninComponent},


{path:"home",component:DashboardComponent,canActivate:[AuthGuard],children:[
  {path:"product",component:ProductComponent},  
  {path:"category",component:CategoryComponent},
  {path:"logout",component:LogoutComponent}
]}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
