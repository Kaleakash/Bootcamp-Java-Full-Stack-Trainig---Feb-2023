import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';
import { CartService } from 'src/app/cart/cart.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit{
  products:Array<Product>=[];
  searchData:any="";
  constructor(public productService:ProductService,public cartService:CartService){

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
    let flag = confirm("Do you want to delete");
    if(flag){
        
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

    }else {
      alert("Product id didn't delete")
    }
    
  }

  sortByPrice(){
    alert("Hi")
    this.products.sort((p1,p2)=>p2.price-p1.price);
  }

  addToCart(product:any){
      //console.log(product);
      product.qty=1;
      this.cartService.addDataInCart(product);
  }
  wishListProduct:Array<Product>=[];
  addToWishlist(product:any){
    let obj = localStorage.getItem("wishlistproducts");
    if(obj==null){
      this.wishListProduct.push(product);
      localStorage.setItem("wishlistproducts",JSON.stringify(this.wishListProduct));
      
    }else {
      let tempInfo = localStorage.getItem("wishlistproducts");
      if(tempInfo!=undefined){
        let wishListProduct= JSON.parse(tempInfo);
        wishListProduct.push(product);
        localStorage.setItem("wishlistproducts",JSON.stringify(wishListProduct));
      }
      
    }
    let data = localStorage.getItem("wishlistproducts");
    if(data!=undefined){
      console.log(JSON.parse(data).length);
    }
    
  }
}
