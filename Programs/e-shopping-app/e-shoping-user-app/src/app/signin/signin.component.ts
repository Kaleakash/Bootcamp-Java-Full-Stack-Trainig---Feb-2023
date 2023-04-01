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
    let user = this.loginRef.value;
    
    this.authService.signIn().subscribe({
      next:(data:any)=> {
          let result = data.find((u:any)=>u.emailid==user.emailid && u.password==user.password);
          //console.log(result);
          if(result!=undefined){
            alert("successfully login!")
      sessionStorage.setItem("user",JSON.stringify(result));   // stroring in session storage and converting in string. 
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
          console.log("login done!")
      }
    })
    this.loginRef.reset();
  }

}
