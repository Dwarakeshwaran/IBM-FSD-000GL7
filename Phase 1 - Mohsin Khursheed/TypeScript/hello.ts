//inheritance possible in TS
//interface is like giving a structure for class,variable --> Defining the structure
//forEach is not for dynamic binding

//In JS file, it creates a class but when it wants to modify ie., add or delete attributes, it uses prototype object in the JS file.-->creates a locally scoped variable/function

let a:string = 'Hello';
let data1:any = {
    name : 'Dwaki',
    id : 7
}

console.log(a);
interface data{
    name:string,
    id:number,
    role:string
}

let func:data = {
    name:'Dwaki',
    id:7,
    role:'Developer'
}


console.log(data1);