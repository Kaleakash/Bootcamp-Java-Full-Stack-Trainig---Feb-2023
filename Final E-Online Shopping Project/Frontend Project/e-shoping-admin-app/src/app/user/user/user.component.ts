import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { User } from '../user';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit{

  users:Array<User>=[];
  constructor(public userService:UserService){

  }
  ngOnInit(): void {
      this.userService.loadUserDetails().subscribe({
        next:(data:any)=> {
          this.users=data;
        }
      })
  }
}
