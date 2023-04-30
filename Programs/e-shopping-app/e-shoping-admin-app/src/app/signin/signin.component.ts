import { Component,OnInit } from '@angular/core';
import { FormGroup ,FormBuilder} from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from '../auth/auth.service';
@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css']
})
export class SigninComponent implements OnInit{
  loginRef!:FormGroup;
  msg:string="";
  constructor(public formBuilder:FormBuilder,public authService:AuthService
    , public router:Router){}   // di for formbuild 
 
  ngOnInit(): void {
    this.loginRef=this.formBuilder.group({
      emailid:[],
      password:[]
    });

  }
  signIn(){
    let admin = this.loginRef.value;
    // if(this.authService.signIn(admin)=="success"){
    //     alert("Successfully login")
    //     sessionStorage.setItem("admin",admin.emailid);
    //     this.router.navigate(["home"]);
    // }else {
    //     alert("failure try once again");
    //     this.msg = "Invalid emailid or password";
    // }
    this.authService.signIn(admin).subscribe({
      next:(result:any)=> {
          if(result=="success"){
            alert("Successfully login")
            sessionStorage.setItem("admin",admin.emailid);
            this.router.navigate(["home"]);
          }else {
            alert("failure try once again");
            this.msg = "Invalid emailid or password";
          }
      },
      error:(error:any)=> {
          console.log(error)
      },
      complete:()=> {
          console.log("admin SignIn Done!")
      }
    })
    this.loginRef.reset();
  }

}
