import { Injectable } from '@angular/core';
import { Order } from './order';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  //public baseUrl:string="http://localhost:3000/orders";
  public baseUrl:string="http://localhost:8080/phase2-backend-restapi/OrdersController";
  constructor(public httpClient:HttpClient) { }

  orderPlaced(order:Order):Observable<any> {
    return this.httpClient.post(this.baseUrl,order);
  }

  viewOrdersByUser(email:any):Observable<any> {
    return this.httpClient.get(this.baseUrl+"?email="+email);
  }
}
