import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'    // it is equal to provider attribute in app.module.ts file 
})
export class ProductService {

  constructor(public http:HttpClient) { }   // DI for HttpClient

  // loadProductData(){
  //   this.http.get("https://dummyjson.com/products").subscribe({
      
  //     next:(data:any)=> {
  //         console.log(data);
  //     },
  //     error:(error:any)=> {
  //         console.log(error)
  //     },
  //     complete:()=> {
  //         console.log("produt data loaded...")
  //     }

  //   })
  //   console.log("hi")
  // }

  // converting all json data into model class ie array. 
  loadProductData():Observable<Product[]>{
    return this.http.get<Product[]>("https://dummyjson.com/products");
    
  }
  
}
