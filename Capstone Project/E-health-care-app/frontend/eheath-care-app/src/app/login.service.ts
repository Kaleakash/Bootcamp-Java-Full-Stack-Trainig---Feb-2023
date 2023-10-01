import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Login } from './login';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  baseUrl:string="http://54.145.239.183:9090/login";

  constructor(public http:HttpClient) { }

  signIn(login:any):Observable<string> {
  return this.http.post(this.baseUrl+"/signIn",login,{responseType:'text'});
  }

  signUp(login:any):Observable<string> {
  return this.http.post(this.baseUrl+"/signUp",login,{responseType:'text'});
  }


}
