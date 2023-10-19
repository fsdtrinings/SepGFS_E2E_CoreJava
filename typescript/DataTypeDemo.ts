export{}
let x:number = 10;
let y:Number = 30;

//x = y; // error
y = x;
let p = 0;

let result:number = x/p;
console.log(result); // NaN

//---------------------------

let z:any = 10;
z = "hello";
console.log(z);

let data:string = z;
console.log(data);

// ------------------------------------

for(let i:number = 0;i<10;i++)
{
    console.log(i);
    
}



