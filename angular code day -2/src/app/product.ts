export class Product {

    productName:string;
    category:string;
    cost:number;
    stockValue:number;

    constructor(
        productName:string,
        category:string,
        cost:number,
        stockValue:number
    ){
        this.productName = productName;
        this.category = category;
        this.cost = cost;
        this.stockValue = stockValue;
    }

}
