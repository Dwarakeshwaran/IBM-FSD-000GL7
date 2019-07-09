const add = ()=>{
    let n = document.getElementById('name').value;
    let e = document.getElementById('email').value;
    let o = document.getElementById('org').value;


    let arr = [];
   
    
    arr.push({
        name: n,
        email: e,
        org: o
    });

    let row = '';

    localStorage.setItem("arr",JSON.stringify(arr));

    Object.keys(localStorage).forEach((keys)=>{

        info = JSON.parse(localStorage.getItem(keys));

        console.log(Object.values(info)[0]);

        row += `<tr>
                <td>${info}<td>

                </tr> `
        

    });

    console.log(info);

    table = `<table>
        <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Organisation</th>
        ${row}
        </thead>`

    document.getElementById('display').innerHTML = table;

}