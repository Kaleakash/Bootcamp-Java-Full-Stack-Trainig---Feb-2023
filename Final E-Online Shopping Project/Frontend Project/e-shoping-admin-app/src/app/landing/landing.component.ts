import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth/auth.service';

@Component({
  selector: 'app-landing',
  templateUrl: './landing.component.html',
  styleUrls: ['./landing.component.css']
})
export class LandingComponent implements OnInit{

  flag!:boolean;
  constructor(public authService:AuthService){

  }
  ngOnInit(): void {
    this.authService.isLoggedIn.subscribe({
      next:(result:any)=> {
        this.flag=result;
      }
    })
  }
}
