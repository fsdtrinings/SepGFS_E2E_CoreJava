
let obj1 = {};
let obj2 = {id:101,name:"Ramesh"};

// let obj3:obj2 = {id:104,name:"Ramesh"}; // error , Obj2 is not the Type
console.log(obj2.id);
console.log(obj2.name);

interface Data  // interface is the type
{
    id:number;
    name:string;
}
/*
type MyValue = {
    id:number;
    name:string;
}
*/



let d1 : Data = {id:102,name:'Suresh'};
let d2 : Data = {id:103,name:'Mahesh'};

console.log(d1);
console.log(d2);

