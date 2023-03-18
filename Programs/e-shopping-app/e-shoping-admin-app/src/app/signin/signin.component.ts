import { Component,OnInit } from '@angular/core';
import { FormGroup ,FormBuilder} from '@angular/forms';
import { AuthService } from '../auth/auth.service';
@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css']
})
export class SigninComponent implements OnInit{

  loginRef!:FormGroup;

  constructor(public formBuilder:FormBuilder,public authService:AuthService){}   // di for formbuild 
 
  ngOnInit(): void {
    this.loginRef=this.formBuilder.group({
      emailid:[],
      password:[]
    });

  }

  signIn(){
    let admin = this.loginRef.value;
    if(this.authService.signIn(admin)){
        alert("Successfully login")
    }else {
        alert("failure try once again")
    }
    this.loginRef.reset();
  }

}
