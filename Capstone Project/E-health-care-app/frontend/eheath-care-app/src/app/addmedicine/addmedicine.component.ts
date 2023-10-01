import { Component } from '@angular/core';
import { MedicineService } from '../medicine.service';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-addmedicine',
  templateUrl: './addmedicine.component.html',
  styleUrls: ['./addmedicine.component.css']
})
export class AddmedicineComponent {

  medicineRef = new FormGroup({
    mname:new FormControl(),
    price:new FormControl(),
    qty:new FormControl(),
    imageurl:new FormControl(),
    description:new FormControl(),
  })
  msg:string ="";
  constructor(public medicineService:MedicineService){}

  storeMedicine(){
    let medicine= this.medicineRef.value;
    this.medicineService.storeMedicine(medicine).subscribe({
      next:(result:any)=> {
          this.msg=result;
      },
      error:(error:any)=> {
        this.msg = error;
        console.log(error)
      },
      complete:()=> {
        console.log("done!")
      }
    })

    this.medicineRef.reset();

  }

}
