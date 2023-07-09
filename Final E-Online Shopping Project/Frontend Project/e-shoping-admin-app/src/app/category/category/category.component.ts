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
      cid:[""],
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
          console.log(this.categories)
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

  deleteCategory(cid:any){
    //console.log(cid);
    this.categoryService.deleteCategory(cid).subscribe({
      next:(result:any)=> {
        console.log(result);
      },
      error:(error:any)=> {

      },
      complete:()=> {
        this.loadCategories();
      }
    });

  }

  searchCategory(categoryNameValue:any){
    this.categoryService.searchCategory(categoryNameValue).subscribe({
      next:(data:any)=> {
        console.log(data);
        this.categories=data;
    },
    error:(error:any)=> {
        console.log(error)
    },
    complete:()=> {
        console.log("done!")
    }

    })
      //console.log(this.categories.filter(c=>c.categoryName==categoryNameValue));
      //this.categories = this.categories.filter(c=>c.categoryName==categoryNameValue);
      // let result:any[]  = this.categories.find(c=>c.categoryName==categoryNameValue);
      // if(result!=undefined){
      //   this.categories= result;
      // }
    
  }

  updateCategory(category:any,updateCategoryModal:any){
    console.log(category);
    this.categoryForm.patchValue({
      cid:category.cid,
      categoryName:category.categoryName,
      categoryDescription:category.categoryDescription,
      categoryImageUrl:category.categoryImageUrl      
    })    
    this.modal.open(updateCategoryModal,{size:'md'});
  }
  updateCategoryFromDb(){
    console.log(this.categoryForm.value);
    this.categoryService.updateCategory(this.categoryForm.value).subscribe({
      next:(data:any)=> {
          alert(data)
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





