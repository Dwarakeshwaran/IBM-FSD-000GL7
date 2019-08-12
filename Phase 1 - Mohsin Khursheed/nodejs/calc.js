class Calculator{
    
    _add(a,b){
        return a+b;
    }
    _sub(a,b){
        return a-b;
    }
    _mul(a,b){
        return a*b;
    }
    _div(a,b){
        return a/b;
    }
}

const obj = new Calculator();

let first = parseInt(process.argv[2]);
let operator = process.argv[3];
let next = parseInt(process.argv[4]);



switch(operator)
{
    case '+':
        console.log(obj._add(first, next));
        break;
    case '-':
        console.log(obj._sub(first, next));
        break;
    case '*':
        console.log(obj._mul(first, next));
        break;
    case '/':
        console.log(obj._div(first, next));
        break;
    default:
        console.log("error");
        break;
}


