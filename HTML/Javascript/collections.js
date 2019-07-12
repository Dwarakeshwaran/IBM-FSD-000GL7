const emps = [
    {
        name:'jadhav',
        salary:2000,
    
    },
    
    {
        name:'ram',
        salary:3000
    
    },
    {
        name:'raj',
        salary:5000
    
    }

];


// let sum = 0;

// const salary = emps.reduce((emp1,emp2)=>{
    
//     sum =  emp1 + emp2.salary;
    
// },0);


// console.log(sum);



const salary1 = emps.reduce((emp1,emp2)=>{
    
    return  emp1 + emp2.salary;
    
},0);


console.log(salary1);

let group = emps.reduce((first,rem)=>{
    let key = rem['name']; 
    if(!first[key]){
        first[key]=[];
    }
    first[key].push(rem);
    return first;
},{});

console.log(group);
