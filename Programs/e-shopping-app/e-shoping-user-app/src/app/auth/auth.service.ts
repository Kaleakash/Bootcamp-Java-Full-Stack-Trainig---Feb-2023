import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { User } from '../model/user';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private loggedIn = new BehaviorSubject<boolean>(false);
  constructor(public http:HttpClient) { }  
  get isLoggedIn():Observable<boolean>{
    return this.loggedIn.asObservable();
  }
  logout() {
      this.loggedIn.next(false);
  }
  login() {
    this.loggedIn.next(true);
  }
  signIn():Observable<User[]> {
    return this.http.get<User[]>("http://localhost:3000/users");    
  }

  signUp(user:any):Observable<any> {
    return this.http.post("http://localhost:3000/users",user);
  }
}


