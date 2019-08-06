const express = require('express');
const app = express();
const parser = require('body-parser');
const Service = require('./service').Service;
const serv = new Service();
const cors = require('cors');
const mailer = require('nodemailer');

app.use(cors());
app.use(parser.json());

app.get('/status',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end('Welcome');
})
app.post('/send',(req,res)=>{
    res.setHeader('content-type','application/json');
    let email = [];
    email = serv.getData();
    obj = email[0];

    const em = obj.uemail;

    console.log(em);

    const transporter = mailer.createTransport({
        service : 'Gmail',
        auth :{
            user : 'dwaki98@gmail.com',
            pass : 'malamon007'
        }
    })

    transporter.sendMail({

        from : `${em}`,
        to : `${em}`,
        subject : 'It"s me',
        text : 'Detail gets submitted',
        html : `<h1>HIIII RAJALAKSHMI!!'UHHHH</h1>`
    }, (err,info)=>{
        if(err)
        {
            console.log('error');
            res.redirect('/status');
        }
        else{
            console.log("Messsage sent");
            
        }
    })
})

app.post('/details',(req,res)=>{
    res.setHeader('content-type','application/json');
    
    res.end(JSON.stringify({
        data : serv.setData(req.body)
    }))
})

app.get('/',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        data : serv.getData()
    }))
})

app.listen(2000,()=>{
    console.log("Server started at Port 2000");
})