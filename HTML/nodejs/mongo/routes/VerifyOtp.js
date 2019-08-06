const verify = ()=>{
    //console.log('Check2');

    const otp = document.getElementById('uotp').value;

    fetch('http://localhost:2305/otp/validate',{
        method : 'POST',
        headers : {
            'content-type':'application/json'
        },
        body : JSON.stringify({
            otp : otp
        })
    })
    .then(res=>{
        console.log(res);
    })
    .catch(err=>{
        console.log(err);
    })
}