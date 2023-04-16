package com.main;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.bean.Product;
import com.service.ProductService;
public class App {
	public static void main(String[] args) {
		ProductService ps = new ProductService();
		Scanner sc= new Scanner(System.in);
		int choice;
		String con="";
		int pid;
		String pname;
		float price;
		String result;
		do {
			System.out.println("1:Add Product 2: Number of products 3 : Search product using id 4 : Display all Product 5 : Update Product Price 6 : Delete Product using Pid");
			System.out.println("Plz enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Plz enter the product id");
			     pid = sc.nextInt();
			     System.out.println("enter the product name");
			     pname  = sc.next();
			     System.out.println("enter the price");
			     price = sc.nextFloat();
			     Product p1 = new Product(pid, pname, price);
			     result = ps.storeProduct(p1);
			     System.out.println(result);
			     break;
			case 2:System.out.println("Number of product are "+ps.sizeOfProduct());
			      break;
			case 3:System.out.println("Plz enter the product id to search the product");
			       pid = sc.nextInt();
			       Product p2 = ps.findProduct(pid);
			       if(p2==null) {
			    	   System.out.println("Product not present");
			       }else {
			    	  // System.out.println("Pid is "+p2.getPid()+" Pname is "+p2.getPname()+" Price is "+p2.getPrice());
			    	   System.out.println(p2); 	// toString method of Object class. that class provide output in the form of string packagename.classname@code 
			       }
			       break;
			case 4 : System.out.println("All Product Details");
			         List<Product> listOfProduct    =  ps.findAllProduct();
			         Iterator<Product> li = listOfProduct.iterator();
			         while(li.hasNext()) {
			        	 Product p = li.next();
			        	 System.out.println(p);   // it will call toString methods.
			         }
			         break;
			case 5 :System.out.println("Update product price");
					System.out.println("Enter the product id");
			         pid = sc.nextInt();
			         System.out.println("Enter the product price");
			         price = sc.nextFloat();
			         	Product p3 = new Product();
			         p3.setPid(pid);
			         p3.setPrice(price);
			         result = ps.updateProductPrice(p3);
			         System.out.println(result);
			         break;
			case 6:System.out.println("Enter the product id to delete the product");
			         pid = sc.nextInt();
			         result = ps.deleteProductById(pid);
			         System.out.println(result);
			         break;
			default:System.out.println("wrong choice");
			        break;
			}
			System.out.println("Do you want to continue?");
		
			con = sc.next();
		} while (con.equalsIgnoreCase("y"));
		System.out.println("Thank you!");
	}

}
