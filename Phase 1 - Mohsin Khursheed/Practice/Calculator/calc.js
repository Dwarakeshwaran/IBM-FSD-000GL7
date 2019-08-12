

const add = ()=>{
    //console.log('Add');
    const val1 = document.getElementById('data').value;
    console.log(val1);
    const url = 'http://localhost:1200/calc/add'
    fetch(url,{
        method:'POST',
        headers:{
            'content-type':'application/json'
        },
        body:JSON.stringify({
            'val1':val1,
            'op':'+'
        })
    })
    
    

    document.getElementById('data').value='';
}