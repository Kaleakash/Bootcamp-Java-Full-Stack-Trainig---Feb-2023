import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  baseUrl:string ="http://localhost:8080/product";

  constructor(public http:HttpClient) { }

  findAllProdut():Observable<Product[]> {
    return this.http.get<Product[]>(this.baseUrl+"/findAll");
  }

  storeProduct(product:Product):Observable<string> {
    return this.http.post(this.baseUrl+"/store",product,{responseType:'text'});
  }
}
