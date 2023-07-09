import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Category } from './category';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  //public baseUrl:string ="http://localhost:3000/categories"
 // public baseUrl:string ="http://localhost:8080/phase2-backend-restapi/CategoryController"
 public baseUrl:string ="http://localhost:8181/phase3/admin/category"
  constructor(public httpClient:HttpClient) { }

  // doGet 
  loadCategory():Observable<Category[]> {
    return this.httpClient.get<Category[]>(this.baseUrl+"/findAll");
  }

  //doPost 
  storeCategory(category:Category):Observable<any> {
    return this.httpClient.post(this.baseUrl+"/store",category);
  }

  //doDelete 
  deleteCategory(cid:any):Observable<string> {
    return this.httpClient.delete(this.baseUrl+"/deleteCategory?cid="+cid,{responseType:'text'});
  }
// post method 
  searchCategory(categoryNameValue:any):Observable<Category[]> {
    return this.httpClient.post<Category[]>(this.baseUrl+"/search",{categoryName:categoryNameValue});
  }

  updateCategory(category:any){
    return this.httpClient.put(this.baseUrl+"/update",category,{responseType:'text'});

  }
}



