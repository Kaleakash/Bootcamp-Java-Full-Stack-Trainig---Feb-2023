import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'    // it is equal to provider attribute in app.module.ts file 
})
export class ProductService {

  constructor(public http:HttpClient) { }   // DI for HttpClient

  loadProductData(){
    this.http.get("https://dummyjson.com/products").subscribe({
      
      next:(data:any)=> {
          console.log(data);
      },
      error:(error:any)=> {
          console.log(error)
      },
      complete:()=> {
          console.log("produt data loaded...")
      }

    })
  }
  
}
