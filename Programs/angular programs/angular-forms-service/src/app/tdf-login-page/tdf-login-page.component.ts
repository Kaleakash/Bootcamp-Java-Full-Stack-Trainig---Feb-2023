import { Component } from '@angular/core';
import {NgForm} from '@angular/forms';
@Component({
  selector: 'app-tdf-login-page',
  templateUrl: './tdf-login-page.component.html',
  styleUrls: ['./tdf-login-page.component.css']
})
export class TdfLoginPageComponent {

  msg:string="";
  signIn(loginRef:NgForm){
    let login = loginRef.value;
    //console.log(login);
    if(login.email=="raj@gmail.com" && login.password=="123"){
       // alert("Successfully login")
       this.msg="successfully login"
    }else {
       // alert("failure try once again");
       this.msg = "failure try once again"
    }
    loginRef.reset();
  }
}

