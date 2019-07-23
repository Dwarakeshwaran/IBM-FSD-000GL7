const search_item= ()=>{
    let iname = document.getElementById('iname').value;
    let table = '';
    const url = 'http://localhost:1000/items';
    fetch(url,{
        method : 'GET'
    })
    .then(res => res.json())
    .then((data)=>{
        //document.write(data.items[0].id);

        table = `
                <table>
                <tr>
                <th>Id</th>
                <th>Product</th>
                <th>Price</th>
                </tr>
                `
        data.items.forEach((item) => {
            if(iname == item.name){
                table += `
                        <tr>
                        <td>${item.id}</td>
                        <td>${item.name}</td>
                        <td>${item.price}</td>
                        <td><input type='button' value='Add to Cart' onclick = 'addCart(${JSON.stringify(item.name)},${item.price})'></td>
                        </tr>`
            }
            
        });

        table += `</table>`

        document.getElementById('display_items').innerHTML = table;

    })
}

const addCart = (cname, cprice) => {
    const obj = {
        "name": cname,
        "price": cprice
    }
    const url = 'http://localhost:1000/cart';

    console.log(obj);
    fetch(url, {

        headers: {
            'content-type': 'application/json'
        },
        method: 'POST',
        body: JSON.stringify(obj)
    })
    .then((res)=>{
        console.log(res);
    })
    .catch(error=>{
        console.log(error);
    });


}