import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { User } from '../model/user';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private loggedIn = new BehaviorSubject<boolean>(false);
  private baseSignUpUrl:string ="http://localhost:8080/phase2-backend-restapi/UsersSignUpController";
  private baseSignInUrl:string ="http://localhost:8080/phase2-backend-restapi/UsersSignInController";
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
  
  // signIn():Observable<User[]> {
  //   return this.http.get<User[]>("http://localhost:3000/users");    
  // }

  signIn(users:any):Observable<string> {
    return this.http.post(this.baseSignInUrl,users,{responseType:'text'});    
  }

  signUp(user:any):Observable<string> {
    return this.http.post(this.baseSignUpUrl,user,{responseType:'text'});
  }
}


