import { Component, OnInit } from '@angular/core';
import { CartService } from './cart.service';
import { Cart } from './cart';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit{

  cartInfo:Array<Cart>=[];
  constructor(public cartService:CartService){

  }
  ngOnInit(): void {
      this.cartService.getCart.subscribe({

        next:(data:any)=> {
            this.cartInfo=data;
            this.calculate();
        },
        error:(error:any)=> {

        },
        complete:()=> {
            
        }

      })
  }

  totalPrice:number =0;
  increment(cart:any,i:number){
    //console.log(cart+" "+i)
    this.cartInfo[i].qty=eval(cart.qty)+1;
    this.calculate();
  }
  remove(cart:any,i:number){
    //console.log(cart+" "+i)
    this.cartService.removeDataFromCart(cart,i);
    this.calculate();
  }
  decrement(cart:any,i:number){
    //console.log(cart+" "+i)
    this.cartInfo[i].qty=eval(cart.qty)-1;
    this.calculate();
  }

  calculate():void {
      this.totalPrice= this.cartInfo.reduce((previousValue:any,currentValue:any)=> {
        console.log(previousValue+" "+currentValue.qty+" "+currentValue.price);
        return previousValue+currentValue.qty *currentValue.price;       
      },0)
  }
}
