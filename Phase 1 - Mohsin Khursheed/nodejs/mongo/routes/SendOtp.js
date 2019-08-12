const send = () =>{
    //console.log('check');
    const email = document.getElementById('uemail').value;
    //console.log(email);
    fetch('http://localhost:2305/otp/',{
        method : 'POST',
        headers: {
            'content-type': 'application/json'
        },
        body : JSON.stringify({
            email : email
        })
    })
    .then((res)=>{
        console.log(res);
    })
    .catch((err)=>{
        console.log(err);
    })
    fetch('http://localhost:2305/otp/send',{
        method : 'POST',
        headers: {
            'content-type': 'application/json'
        },
        body : JSON.stringify({
            email : email
        })
    })
    .then((res)=>{
        console.log(res);
    })
    .catch((err)=>{
        console.log(err);
    })
}