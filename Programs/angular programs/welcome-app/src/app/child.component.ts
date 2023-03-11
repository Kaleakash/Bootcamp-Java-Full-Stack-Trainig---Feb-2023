import { Component } from "@angular/core";


@Component({
    selector:"my-tag",
    templateUrl:"./child.component.html"
})
export class Child {
    msg:string ="This is child component";
}
