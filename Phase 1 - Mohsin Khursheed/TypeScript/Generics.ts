//typesafety! Happens on compilation time

 function message<T>(msg:T){
    return msg;
}    
const m = message<number>(10);
console.log(m);

interface numbers<T,U>{
    num1 : T
    num2 : U
}

function numbers<T,U>(n1:T,n2:U){
    console.log(typeof(n1));
    console.log(typeof(n2));

}
//console.log(numbers<number,string>(100,'Boy'));//compile Time


interface iVehicles{
    name:string
}

interface iSpecs {
    cc:number
    //topspeed:number
}

// const details = {
//         vehicles:{
//             name: 'Honda'
//         },
//         specs:{
//             cc:220,
//             topspeed:300
//         }
// }




// let details = vdetails<iSpecs>({
//     name: 'Honda',
//     cc: 220,
//     topspeed:300
// })

class Vehicles< Y extends string, X extends iSpecs> {
    name:Y;
    cc:X;
    topspeed:X;
    constructor(name:Y,cc:X){
        this.name = name
        this.cc = cc
        //this.topspeed = topspeed
    }
    
    getSpecs(){
        console.log(this.cc);
        
    }


}

const obj = new Vehicles<string,iSpecs>('Honda',{cc:220});
obj.getSpecs();