import { Component } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

msg:string ="";
  constructor(public loginService:LoginService,
    public router:Router){

  }

loginRef = new FormGroup({
  emailid:new FormControl(),
  password:new FormControl(),
  typeofuser:new FormControl()
});

signIn(): void {
  console.log("event fired")
  let loginData = this.loginRef.value;
  console.log(loginData);
  this.loginService.signIn(loginData).subscribe({
    next:(result:any)=>{
      if(result=="Admin login successfully"){
        this.router.navigate(["adminhome"]);
        //this.msg=result;
      }else if(result=="Customer login successfully"){
        sessionStorage.setItem("emailid",loginData.emailid);
        this.router.navigate(["customerhome"]);
        //this.msg=result;
      }else {
          this.msg=result;
      }

    },
    error:(error:any)=> {
      console.log(error)
    },
    complete:()=> {
      console.log("complete!")
    }

  })
  this.loginRef.reset();

}


}
