//typesafety! Happens on compilation time
function message(msg) {
    return msg;
}
var m = message(10);
console.log(m);
function numbers(n1, n2) {
    console.log(typeof (n1));
    console.log(typeof (n2));
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
var Vehicles = /** @class */ (function () {
    function Vehicles(name, cc) {
        this.name = name;
        this.cc = cc;
        //this.topspeed = topspeed
    }
    Vehicles.prototype.getSpecs = function () {
        console.log(this.cc);
    };
    return Vehicles;
}());
var obj = new Vehicles('Honda', { cc: 220 });
obj.getSpecs();
