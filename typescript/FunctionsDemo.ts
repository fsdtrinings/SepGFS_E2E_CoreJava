function doThings(x:number,name?:string,taskName:string = 'Java')
{
    console.log(x+" "+name+" - "+taskName);
    
}

doThings(10,'Spring');


function someTask(data={id:101,name:'Ramesh'})
{
    console.log(data);
    
}
someTask();