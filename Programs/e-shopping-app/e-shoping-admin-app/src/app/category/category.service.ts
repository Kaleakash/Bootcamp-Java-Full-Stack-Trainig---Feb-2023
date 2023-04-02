import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Category } from './category';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  public baseUrl:string ="http://localhost:3000/categories"
  constructor(public httpClient:HttpClient) { }

  loadCategory():Observable<Category[]> {
    return this.httpClient.get<Category[]>(this.baseUrl);
  }

  storeCategory(category:Category):Observable<any> {
    return this.httpClient.post(this.baseUrl,category);
  }
}
