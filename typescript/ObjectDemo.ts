class Employee{

    name : string;
    id : number;
    salary : number;

    constructor(name:string,id:number,salary:number)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    calculateTax():number
    {
        let tax:number;
        if(this.salary<10000)
        {
            tax = this.salary*0.10;
        }
        else tax = this.salary*0.20;

        return tax;
    }
}

let emp1 =  new Employee('ramesh',101,17000);
let tax = emp1.calculateTax();
console.log(tax);