import { Component } from '@angular/core';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';
import {FormGroup,FormControl} from '@angular/forms'
@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {
  msg:string ="";
  constructor(public loginService:LoginService,
    public router:Router){

  }

loginRef = new FormGroup({
  emailid:new FormControl(),
  password:new FormControl(),
  typeofuser:new FormControl()
});

signUp(): void {
  console.log("event fired")
  let loginData = this.loginRef.value;
  console.log(loginData);
  this.loginService.signUp(loginData).subscribe({
    next:(result:any)=>{
      this.msg=result;
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
