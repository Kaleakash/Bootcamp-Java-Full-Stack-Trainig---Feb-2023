import { Component } from '@angular/core';

@Component({
  selector: 'abc',             // <app-root></app-root>  <abc></abc>
  templateUrl: './app.component.html',    // html page connection or link 
  styleUrls: ['./app.component.css']    //connectiong external css file 
})

export class AppComponent {
 name:string ="Akash";
 id:number=123;
 designation:string ="Trainer";
 city:string = "Bangalore";
 result:boolean = true;
}
