import { Component, OnInit } from '@angular/core';
import { MedicineService } from '../medicine.service';
import { Medicine } from '../medicine';

@Component({
  selector: 'app-viewmedicine',
  templateUrl: './viewmedicine.component.html',
  styleUrls: ['./viewmedicine.component.css']
})
export class ViewmedicineComponent implements OnInit{
  medicine:Array<Medicine>=[];
  constructor(public medicineService:MedicineService){}

  ngOnInit(): void {
      this.medicineService.findAll().subscribe({
        next:(data:any)=> {
          this.medicine=data
        },
        error:(error:any)=> {
          console.log(error)
        },
        complete:()=> {
          console.log("done")
        }
      })
  }
}
