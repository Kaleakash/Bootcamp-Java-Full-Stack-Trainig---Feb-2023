import { Component } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {

  products:Array<Product>=[];
  constructor(public ps:ProductService){    // DI for ProductService

  }

  loadProductData() : void {
    //this.ps.loadProductData();      // calling service method

    this.ps.loadProductData().subscribe({
      next1:(data:any)=> {
            this.products=data.products
      },
      error:(error:any)=> {

      },
      complete:()=> {
        console.log("Loaded all data")
      }
    })
  //
  // this.ps.loadProductData().subscribe((data:any)=> {
  //     this.products=data.products;
  // },(error:any)=> {

  // }) 
  }

}
