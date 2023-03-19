import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import { Product } from './product';
@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private baseUrl:string ="http://localhost:3000/products";

  constructor(public httpClient:HttpClient) { }  // DI for HttpClient 


  loadAllProductDetails():Observable<Product[]>{
    return this.httpClient.get<Product[]>(this.baseUrl);  
  }

}
