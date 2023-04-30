import { Component, OnInit } from '@angular/core';
import { Category } from '../category';
import { CategoryService } from '../category.service';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { FormBuilder, FormGroup } from '@angular/forms';
@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit{

  categories:Array<Category>=[];
  categoryForm!:FormGroup;
  constructor(public categoryService:CategoryService,public modal:NgbModal,public formBuilder:FormBuilder){

  }

  ngOnInit(): void {
    this.categoryForm=this.formBuilder.group({
      categoryName:[""],
      categoryDescription:[""],
      categoryImageUrl:[""]
    });

    this.loadCategories();
  }
  loadCategories() {
    this.categoryService.loadCategory().subscribe({
      next:(data:any)=> {
          this.categories=data;
      },
      error:(error:any)=> {
          console.log(error);
      },
      complete:()=> {
          console.log("category data loaded successfully");
      }
    })
  }
  addCategoriesDetails(addCategory:any){
        this.modal.open(addCategory,{size:'md'});
  }

  storeCategory(){
    let category = this.categoryForm.value;
    console.log(category);
    this.categoryService.storeCategory(category).subscribe({
      next:(data:any)=> {
          console.log(data);
          this.loadCategories();
          alert("category details stored succssessfully")
      },
      error:(error:any)=> {
          console.log(error)
      },
      complete:()=> {
          this.loadCategories();
          console.log("done!")
      }
    })
    this.categoryForm.reset();
  }
}
