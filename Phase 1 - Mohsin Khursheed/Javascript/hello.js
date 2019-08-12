var uId = 10;
console.log(`uId is ${uId}`);

let a = 10;
let b = 20;

document.write(`SUM is ~ ${(a + b)} `);

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
    user1, user2
];

console.log(users[1].name);

//Program to find whether the student has failed or passed.
let english = 100;
let maths = 60;
let science = 60;

var percent = (english + maths + science) / 3;

document.write(percent);
if (english >= 60 && maths >= 60 && science >= 60) {
    console.log('Passed');

    if (percent >= 70 && percent <= 79)
        console.log('Grade B');
    if (percent >= 80 && percent <= 89)
        console.log('Grade A');
    if (percent >= 90 && percent <= 100)
        console.log('Distinction');
}
else {
    console.log('Failed');
}
//end of the program

//push and pop functions

var evenNums = [2, 4, 6, 8];
evenNums.push(10);
document.write(`<br />`);
document.write(evenNums);
evenNums.pop();
document.write('<br />');
document.write(evenNums);

//concat functon

var oddNums = [1, 3, 5, 7];
oddNums = oddNums.concat(evenNums);
console.log(oddNums);


//Fibonacci series

let num1 = 0;
let num2 = 1;

let upto = 5;
console.log('Fibonacci Series');
console.log(num1);
console.log(num2);
for(i = 0; i <=upto-2 ; i++)
{
    num3 = num1+num2;
    num1=num2;
    num2=num3;
    console.log(num3);
}
//End

//for in loop and for of loop
console.log('For In Loop');

let messages = ['Hi','How','Are','You'];
//for in ->gives the index
for(let m in messages){
    console.log(messages[m]);
}

//for of -> gives the actual value of the index
console.log('For In Loop');
for(m of messages){
    console.log(m);
}

vals = {
    one : 'One Value',
    two : 'Two Value'

};

console.log(Object.keys(vals));


//Events

function clickMe(){
    const name = document.getElementById('name');
    alert(`Hello ${name.value}`);
    name.value = 'IBM';

/*let rows;

for(let m in messages){
    rows = rows+`<tr><th>${m+1}</th><th>${messages[m]}</th></tr>`;
}
let _table =`<table><tr><th>S.No</th><th>Message</th></tr>${rows}</table>`;
document.getElementById('msgs').innerHTML =_table;
}*/

//dynamically creating tables

let row;
let mark;
const subjects = ['English','Maths','Science'];
for(let s in subjects){
    mark = `<input type="text" id="marks" name="marks">`;
    row += `<tr><th>${s}</th><th>${subjects[s]}</th><td>${mark}</td></tr>`;

}

   
    }

    let table = `<table><tr><th>S.No</th><th>Subject</th><th>Marks</th></tr>${row}</table>`;
    document.getElementById('sub').innerHTML = table;
}