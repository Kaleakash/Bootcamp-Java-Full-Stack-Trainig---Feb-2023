import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  public baseUrl:string ="http://localhost:3000/users";
  constructor(public httpClient:HttpClient) { }

  loadUserDetails():Observable<User[]> {
    return this.httpClient.get<User[]>(this.baseUrl);
  }
}
