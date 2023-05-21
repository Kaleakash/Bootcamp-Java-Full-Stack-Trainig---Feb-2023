import { Component, OnInit } from '@angular/core';
import { CartService } from './cart.service';
import { Cart } from './cart';
import { Order } from '../order/order';
import { OrderService } from '../order/order.service';
import { AccountService } from '../account.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit{

  cartInfo:Array<Cart>=[];
  user:any;
  constructor(public cartService:CartService,public orderService:OrderService,
    public accountService:AccountService){

  }
  bankBalance:any;
  ngOnInit(): void {
    let obj = sessionStorage.getItem("user");
    if(obj!= null){
        this.user = JSON.parse(obj);
    }
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
      this.accountService.findBalane(this.user.emailid).subscribe({
        next:(result:any)=> {
          this.bankBalance=eval(result);
        },
        error:(error:any)=> {

        },
        complete:()=> {
          console.log("balance retreive")
        }
      })
  }
  cartFlag:boolean = true;
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
  paymentFlag:boolean = false;
  processedForPayment(){
    console.log(this.user);
    
    let orderDetails= new Order();
    orderDetails.orderDate=new Date().toISOString().substring(0,10);
    console.log(orderDetails.orderDate);
    orderDetails.products=[...this.cartInfo];  // array value set using spread operator we are copying cartInfo value into orderDetails 
    orderDetails.totalItems=this.cartInfo.length;
    orderDetails.shipmentCharges=100;
    orderDetails.totalAmount=this.totalPrice;
    orderDetails.email=this.user.emailid;
    console.log(orderDetails);
    this.orderService.orderPlaced(orderDetails).subscribe({
      next:(result:any)=> {
            console.log(result);
      },
      error:(error:any)=> {
          console.log(error)
      },
      complete:()=> {
          console.log("order placed successfully")
      }
    })   
    this.cartInfo.splice(0,this.cartInfo.length); 
    this.totalPrice=0;
  }
  b1:string ="Procced for payment";  
  flag:boolean = false;
  doPayment(){
    this.cartFlag=false;
    this.paymentFlag=true;
    if(this.bankBalance>=this.totalPrice){
      this.b1="Proceced for payment"
      this.flag = false;
    }else {
      this.b1="InSufficient Amount"
      this.flag=true;
    }
  }  
}
