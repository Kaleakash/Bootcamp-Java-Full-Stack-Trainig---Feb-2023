import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { Cart } from './cart';

@Injectable({
  providedIn: 'root'
})
export class CartService {
  private cartData = new BehaviorSubject<Cart[]>([]);
  constructor() { }

  get getCart(){
    return this.cartData.asObservable();
  }
  addDataInCart(product:any) {
    let result:any;
    this.getCart.subscribe({
      next:(data:any)=> {
        console.log(data);
          result  = data.find((c:any)=>c.title==product.title);
          console.log(result);
          if(result==undefined){
            data.push(product);
            alert("Item added in cart");
          }
      },
      error:(error:any)=> {

      },
      complete:()=> {
        
      }
    })

  }
  removeDataFromCart(product:any,index:any){
    console.log(product);
    this.getCart.subscribe({
      next:(data:any)=> {
            data.splice(index,1); 
            alert("Item remove from cart")      
      },
      error:(error:any)=> {

      },
      complete:()=> {

      }
    })

  }
}
