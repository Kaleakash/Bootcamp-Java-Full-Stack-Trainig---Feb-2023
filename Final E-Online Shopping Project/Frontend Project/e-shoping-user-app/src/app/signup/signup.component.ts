import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { AuthService } from '../auth/auth.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit{
  userRef!:FormGroup;
  constructor(public formBuilder:FormBuilder,public authService:AuthService){

  }
  ngOnInit(): void {
   
    this.userRef=this.formBuilder.group({
      username:[],
      fullName:[],
        street:[],
        city:[],
        state:[],
        country:[],
        pincode:[],
      emailid:[],
      password:[],
      img:[],
      contact:[]

    });

  }

  signUp(): void {
    let user = this.userRef.value;
    
    console.log(user);
    this.authService.signUp(user).subscribe({
      next:(result:any)=> {
          console.log(result);
          alert(result);
      },
      error:(error:any)=> {
          console.log(error);
      },
      complete:()=> {
        console.log("account created")
      }
    })
    this.userRef.reset();
  }
}
