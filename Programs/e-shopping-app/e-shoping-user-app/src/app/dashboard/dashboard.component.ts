import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth/auth.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  user:any="";
  constructor(public authService:AuthService){

  }
  ngOnInit(): void {
    this.authService.login();
    let obj = sessionStorage.getItem("user");
    if(obj!=null){
        let data = JSON.parse(obj);
        this.user = data
    }
  }
}
