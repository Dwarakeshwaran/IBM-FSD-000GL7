var uId = 10;
console.log(`uId is ${uId}`);

let a = 10;
let b = 20;

document.write(`SUM is ~ ${(a+b)} `);

let user1 = {
    id: 1,
    name: 'raj',
    phone: 123
};

let user2 = {
    id: 2,
    name: 'ram',
    phone: 456
}

let users = [
    user1,user2
];

console.log(users[1].name);

//Program to find whether the student has failed or passed.
let english = 100;
let maths   = 60;
let science = 60;

var percent = (english+maths+science)/3;

document.write(percent);
if(english >= 60 && maths >= 60 && science >= 60 ){
    console.log('Passed');

    if(percent >= 70 && percent<= 79)
    console.log('Grade B');
    if(percent >= 80 && percent<= 89)
    console.log('Grade A');
    if(percent >= 90 && percent<= 100)
    console.log('Distinction');
}
else{
    console.log('Failed');
}
//end of the program


