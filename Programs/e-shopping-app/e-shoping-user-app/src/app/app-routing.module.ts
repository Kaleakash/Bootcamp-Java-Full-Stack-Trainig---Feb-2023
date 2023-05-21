import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { AuthGuard } from './auth/auth.guard';
import { ContactusComponent } from './contactus/contactus.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LogoutComponent } from './logout/logout.component';
import { ProductComponent } from './product/product/product.component';
import { SigninComponent } from './signin/signin.component';
import { SignupComponent } from './signup/signup.component';
import { CartComponent } from './cart/cart.component';
import { OrderComponent } from './order/order/order.component';
// we have to write navigation rules 
// http://localhost:4200/aboutus
const routes: Routes = [
{path:"aboutus",component:AboutusComponent},
{path:"contactus",component:ContactusComponent},
{path:"login",component:SigninComponent},
{path:"signup",component:SignupComponent},

{path:"home",component:DashboardComponent,canActivate:[AuthGuard],children:[
  {path:"product",component:ProductComponent},  
  {path:"viewCart",component:CartComponent},
  {path:"viewOrders",component:OrderComponent},
  {path:"logout",component:LogoutComponent}
]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
