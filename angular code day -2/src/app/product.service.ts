import { Injectable } from '@angular/core';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  p1:Product = new Product('Dell-123','Laptop',2000,30);
  p2:Product = new Product('Nikon-1','Camera',2000,10);

  p3:Product = new Product('One-plus','Phone',8000,10);
  p4:Product = new Product('HP-123','Laptop',7000,80);
  p5:Product = new Product('Nikon-2','Camera',2000,10);
  p6:Product = new Product('Nikon-3','Camera',2000,10);
  p7:Product = new Product('Mi','Phone',8500,10);
  allProducts:Product[] = [this.p1,this.p2,this.p3,this.p4,this.p5,this.p6,this.p7];
  constructor() { }

  getAllProducts():Product[]
  {
    return this.allProducts;
  }
  filterProductByCategory(searchCategory:string):Product[]
  {
    let outputArr:Product[] = [];
      this.allProducts.forEach(p=>{
        if(p.category == searchCategory)
        {
          outputArr.push(p);
        }
      });

      return outputArr;
  }

}
