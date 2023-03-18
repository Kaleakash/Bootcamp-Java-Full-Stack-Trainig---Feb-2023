import { Injectable } from '@angular/core';
import { Admin } from '../model/admin';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor() { }
  
  signIn(admin:Admin):boolean {
    if(admin.emailid=="admin@gmail.com" && admin.password=="admin@123"){
      return true;
    }else {
      return false;
    }
  }

}
