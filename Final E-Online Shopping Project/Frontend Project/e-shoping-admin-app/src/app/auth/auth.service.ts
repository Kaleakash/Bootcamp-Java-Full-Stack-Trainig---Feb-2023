import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { Admin } from '../model/admin';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private loggedIn = new BehaviorSubject<boolean>(false);
  constructor(public http:HttpClient) { }  // DI for HttpClient 
  
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
  // signIn(admin:Admin):boolean {
  //   if(admin.emailid=="admin@gmail.com" && admin.password=="admin@123"){
  //     return true;
  //   }else {
  //     return false;
  //   }
  // }

  // signIn(admin:Admin):boolean {
  //   this.http.post("http://localhost:8080/phase2-backend-restapi/AdminController",admin,{responseType:'text'}).subscribe({
  //     next:(result:any)=> {
  //       console.log(result)
  //     },
  //     error:(error:any)=> {
  //       console.log(error)
  //     },
  //     complete:()=> {
  //       console.log("done!")
  //     }
  //   })

  //   return false;
  // }

  signIn(admin:Admin):Observable<String> {
    //return this.http.post("http://localhost:8080/phase2-backend-restapi/AdminController",admin,{responseType:'text'})
    return this.http.post("http://localhost:8181/phase3/admin/signIn",admin,{responseType:'text'})
  }

}
