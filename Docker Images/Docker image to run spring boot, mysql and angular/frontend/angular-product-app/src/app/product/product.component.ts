import { Component,OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';
import {FormGroup,FormControl} from '@angular/forms';
@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit{

  productRef = new FormGroup({
    pname:new FormControl(),
    price:new FormControl()
  })
  products:Array<Product>=[];
  constructor(public ps:ProductService){

  }
  ngOnInit() {
      this.loadProduct();
    
  }
  loadProduct() {
    this.ps.findAllProdut().subscribe({
      next:(result:any)=> {
          this.products=result;
      },
      error:(error:any)=> {
        console.log(error)
      },
      complete:()=>console.log("done!")
    })
  }
  storeProduct(){
    let product = this.productRef.value;

    this.ps.storeProduct(product).subscribe({
      next:(result:any)=>console.log(result),
      error:(error:any)=>console.log(error),
      complete:()=>{
          this.loadProduct();
      }
    })
    this.productRef.reset();
  }
}
