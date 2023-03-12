import { Component } from '@angular/core';
import {FormGroup,FormControl,Validators} from '@angular/forms';
import { MyService } from '../custom.service';
import { LoginService } from '../login.service';
@Component({
  selector: 'app-mdf-login-page',
  templateUrl: './mdf-login-page.component.html',
  styleUrls: ['./mdf-login-page.component.css']
})
export class MdfLoginPageComponent {

  constructor(public ls:LoginService){}     // pull the object using DI concept. 
  loginRef = new FormGroup({
    email:new FormControl("",[Validators.required,Validators.pattern("\[a-z,0-9]+@[a-z,0-9]+.com")]),
    password:new FormControl("",[Validators.required,Validators.minLength(3)])
  });

  msg:string="";
  signIn(){
    let login = this.loginRef.value;
    //console.log(login);
    // if(login.email=="raj@gmail.com" && login.password=="123"){
    //     this.msg="Successfully login"
    // }else {
    //     this.msg="Failure try once again"
    // }
    // let cs = new MyService();
    // if(cs.checkUser(login)){
    //   this.msg="successfully login"
    // }else {
    //   this.msg = "failure try once again"
    // }

    
    if(this.ls.checkUser(login)){
      this.msg="successfully login"
    }else {
      this.msg = "failure try once again"
    }
    this.loginRef.reset();
  }
}
