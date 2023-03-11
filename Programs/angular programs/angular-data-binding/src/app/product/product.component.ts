import { Component } from '@angular/core';
import { Product } from '../product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {
  products:Array<Product>=[];   // we created array of products. 
  
  // product = new Product(100,"TV",45000);

  // constructor(){
  //       let p1 = new Product(101,"Computer",65000);
  //       let p2 = new Product(102,"Mobile",35000);
  //         let p3 = new Product(103,"Pen Drive",15000);
  //   this.products.push(p1);     // in array 1st product added 
  //   this.products.push(p2);     // in array 2nd product added 
  //   this.products.push(p3);     // in array 3rd product added. 
  // }

  product:Product={pid:100,pname:"TV","price":45000};

  constructor(){
        let p1:Product = {pid:101,pname:"Computer","price":65000};
        let p2:Product = {pid:102,pname:"Mobile","price":35000};
          let p3:Product = {pid:103,pname:"Pen Drive","price":1500};
    this.products.push(p1);     // in array 1st product added 
    this.products.push(p2);     // in array 2nd product added 
    this.products.push(p3);     // in array 3rd product added. 
  }
}


