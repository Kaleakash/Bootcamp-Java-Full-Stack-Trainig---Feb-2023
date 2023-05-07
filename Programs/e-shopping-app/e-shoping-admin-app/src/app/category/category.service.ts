import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Category } from './category';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  //public baseUrl:string ="http://localhost:3000/categories"
  public baseUrl:string ="http://localhost:8080/phase2-backend-restapi/CategoryController"
  constructor(public httpClient:HttpClient) { }

  // doGet 
  loadCategory():Observable<Category[]> {
    return this.httpClient.get<Category[]>(this.baseUrl);
  }

  //doPost 
  storeCategory(category:Category):Observable<any> {
    return this.httpClient.post(this.baseUrl,category);
  }

  //doDelete 
  deleteCategory(cid:any):Observable<string> {
    return this.httpClient.delete(this.baseUrl+"?cid="+cid,{responseType:'text'});
  }
}
