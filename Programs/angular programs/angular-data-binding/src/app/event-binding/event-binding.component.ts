import { Component } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent {
  //n?:number;
  //msg:string=""; 
  //msg?:string;      // optional variable
 
  msg:string ="Hi";
  result?:any;
  fun() {
    this.msg = "Hello";
    //alert("Event fired...");
  }

  sendData(nameRef:any){
    let name = nameRef.value;
    alert("Your name is "+name);
  }
  add(n1:any,n2:any){
    let add = eval(n1.value)+eval(n2.value);
    this.result= "addition of two number is "+add;
    n1.value="";
    n2.value="";
  }
}
