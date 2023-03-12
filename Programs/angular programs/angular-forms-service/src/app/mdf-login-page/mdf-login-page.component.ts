import { Component } from '@angular/core';
import {FormGroup,FormControl,Validators} from '@angular/forms';
@Component({
  selector: 'app-mdf-login-page',
  templateUrl: './mdf-login-page.component.html',
  styleUrls: ['./mdf-login-page.component.css']
})
export class MdfLoginPageComponent {

  loginRef = new FormGroup({
    email:new FormControl("",[Validators.required,Validators.pattern("\[a-z,0-9]+@[a-z,0-9]+.com")]),
    password:new FormControl("",[Validators.required,Validators.minLength(3)])
  });

  msg:string="";
  signIn(){
    let login = this.loginRef.value;
    //console.log(login);
    if(login.email=="raj@gmail.com" && login.password=="123"){
        this.msg="Successfully login"
    }else {
        this.msg="Failure try once again"
    }
    this.loginRef.reset();
  }
}
