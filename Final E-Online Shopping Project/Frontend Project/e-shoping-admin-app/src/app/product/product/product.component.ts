import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';
import { FormBuilder, FormGroup,  } from '@angular/forms';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { Category } from 'src/app/category/category';
import { CategoryService } from 'src/app/category/category.service';
@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit{
  products:Array<Product>=[];
  productForm!:FormGroup;
  categories:Array<Category>=[];
  constructor(public productService:ProductService,public formBuilder:FormBuilder,public model:NgbModal,
    public categoryService:CategoryService){

  }
  ngOnInit(): void {
    this.productForm=this.formBuilder.group({
      title:[""],
      description:[""],
      price:[""],
      discountPercentage:[""],
      rating:[""],
      stock:[""],
      brand:[""],
      category:[""],
      thumbnail:[""]
    });
    this.categoryService.loadCategory().subscribe({
      next:(data:any)=> {
          this.categories=data;
      },
      error:(error:any)=> {
        console.log(error)
      },
      complete:()=> {
        console.log("done")
      }
    })
    this.loadAllProducts();
  }
  loadAllProducts() {
    this.productService.loadAllProductDetails().subscribe({
      next:(result:any)=> {
          this.products=result;
          // for(let i=0;i<this.categories.length;i++){
          //     for(let j=0;j<this.products.length;j++){
          //           if(this.categories[i].cid==this.products[j].cid){
          //             this.products[i].category=this.categories[j].categoryName;
                      
          //           }
          //     }
          // }
      },
      error:(error:any)=> {

      },
      complete:()=> {

      }
    })
  }
  deleteProduct(pid:any){
    //console.log(pid);
    //alert(pid);
    let flag = confirm("Do you want to delete");
    if(flag){
        
      this.productService.deleteProductById(pid).subscribe({
        next:(result:any)=> {
            console.log(result)
        },
        error:(error:any)=> {
            console.log(error)
        },
        complete:()=> {
          this.loadAllProducts();
            console.log("record deteted")
        }
      })

    }else {
      alert("Product id didn't delete")
    }
    
  }

  sortByPrice(){
    alert("Hi")
    //this.products.sort((p1,p2)=>p2.price-p1.price);
  }

  addProductDetails(addProduct:any):void {
      this.model.open(addProduct,{size:"lg"});
  }

  storeProduct() {
    let product = this.productForm.value;
    let productInfo = this.categories.find(c=>c.categoryName==product.category)
    console.log(productInfo);
    product.cid = productInfo?.cid;
    this.productService.storeProduct(product).subscribe({
      next:(data:any)=> {
          alert("Product stored ");
          console.log(data);
      },
      error:(error:any)=> {
          console.log(error)
      },
      complete:()=> {
            this.loadAllProducts();
      }

    });

    this.productForm.reset();
  }
}
