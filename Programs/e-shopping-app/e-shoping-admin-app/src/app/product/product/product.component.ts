import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit{
  products:Array<Product>=[];
  constructor(public productService:ProductService){

  }
  ngOnInit(): void {
    this.loadAllProducts();
  }
  loadAllProducts() {
    this.productService.loadAllProductDetails().subscribe({
      next:(result:any)=> {
          this.products=result;
      },
      error:(error:any)=> {

      },
      complete:()=> {

      }
    })
  }
  deleteProduct(pid:any){
    //console.log(pid);
    //alert(pid);
    this.productService.deleteProductById(pid).subscribe({
      next:(result:any)=> {
          console.log(result)
      },
      error:(error:any)=> {
          console.log(error)
      },
      complete:()=> {
        this.loadAllProducts();
          console.log("record deteted")
      }
    })
  }

}
