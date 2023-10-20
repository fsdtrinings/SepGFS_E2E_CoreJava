import { Component } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.css']
})
export class TAskComponent {

  __productService:ProductService
  allProducts:Product[] = [];
  totalSum:number = 0;
  constructor(___productService:ProductService)
  {
    this.__productService = ___productService;
    this.allProducts = ___productService.getAllProducts();
  }

  passToCart(p:Product)
  {
    console.log("Pass to cart method called :-"+p.productName);
    
  }


  calculateSum(cost:number)
  {
    this.totalSum+=cost;
    
  }



  filterByCategory(userInput:string)
  {
    console.log("Inside filter by category "+userInput);
    
    this.allProducts = this.__productService.filterProductByCategory(userInput)
  }

}//end class
