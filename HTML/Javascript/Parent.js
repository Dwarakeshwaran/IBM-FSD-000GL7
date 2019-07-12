

const append = (num) =>
{

   get = document.getElementById("display").value;

   get = get + num;//appending the clicked button's value in the get(input field) 

   document.getElementById("display").value= get;

}



const result = () =>{

    let val1;
    let val2;
    val1 = document.getElementById("display").value;

    val2 = eval(val1);
    

   
    document.getElementById("display").value=val2;
    

}

// const clr = () =>{
//     document.getElementById("display").value= '';
// }
