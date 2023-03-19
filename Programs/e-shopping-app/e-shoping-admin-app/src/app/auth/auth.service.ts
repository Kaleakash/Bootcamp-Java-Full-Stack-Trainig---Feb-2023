import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { Admin } from '../model/admin';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private loggedIn = new BehaviorSubject<boolean>(false);
  constructor() { }
  
  get isLoggedIn():Observable<boolean>{
    return this.loggedIn.asObservable();
  }
  logout() {
      this.loggedIn.next(false);
  }
  login() {
    this.loggedIn.next(true);
  }
  
  // http.get()
  signIn(admin:Admin):boolean {
    if(admin.emailid=="admin@gmail.com" && admin.password=="admin@123"){
      return true;
    }else {
      return false;
    }
  }

}
