import { Injectable } from '@angular/core';
import {CanActivate, Router} from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {
    constructor(public router:Router){      // DI for router 

    }
  canActivate(): boolean{
 //   console.log("I came here")
    let obj = sessionStorage.getItem("admin");
    if(obj==null){
      this.router.navigate(["login"]);
      return false;
    }else {
        return true;
    }
    
  }
}
