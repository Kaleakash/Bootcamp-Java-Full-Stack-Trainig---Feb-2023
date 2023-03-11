import { Component } from '@angular/core';

@Component({
  selector: 'app-structure-directive',
  templateUrl: './structure-directive.component.html',
  styleUrls: ['./structure-directive.component.css']
})
export class StructureDirectiveComponent {
  f1:boolean = true;
  f2:boolean = false;
  f3:boolean = false;
  
  flag:boolean = false;
  b1:string ="show image";

  fun() {
    this.f3=true;
  }

  toggle() {
      // if(this.flag){
      //   this.b1 = "show image";
      //   this.flag=false;
      // }else {
      //     this.b1 = "hide image";
      //     this.flag=true;
      // }

      this.flag = this.flag?false:true;
      this.b1 = this.b1=="show image"?"hide image":"show image";
  }

  names:Array<string>=["John","Steven","Lex","Neena"];
  

}
