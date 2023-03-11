import { Component } from '@angular/core';

@Component({
  selector: 'app-string-interpolation',
  templateUrl: './string-interpolation.component.html',
  styleUrls: ['./string-interpolation.component.css']
})
export class StringInterpolationComponent {
  fname:string ="Raj Deep";

  sayHello(name:string):string {
    // coding ...
    return "Welcome to angular project "+name;
  }

  addNumber(a:number,b:number):number{
    // coding....
    return a+b;
  }
}
