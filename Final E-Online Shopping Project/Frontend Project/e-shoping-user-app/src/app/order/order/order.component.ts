import { Component, OnInit } from '@angular/core';
import { OrderService } from '../order.service';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit{
  user:any;
  //orders:Array<any>=[];
  orders?:Array<Array<any>>;
  dateInfo:Date=new Date();
    constructor(public os:OrderService){
      
    }
  ngOnInit(): void {
      let obj = sessionStorage.getItem("user");
      console.log(obj);
      if(obj!=null){
        this.user= JSON.parse(obj);
      }
      console.log(this.user.emailid);
      this.os.viewOrdersByUser(this.user.emailid).subscribe({
        next:(result:any)=> {
          console.log(result)
          this.orders=result;
        },
        error:(error:any)=> {
          console.log(error)
        },
        complete:()=> {
          console.log("view orders details");
        }
      })
  }
}
