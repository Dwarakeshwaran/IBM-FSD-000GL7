const express = require('express');
const server = express();
const parser = require('body-parser');
const Service = require('./calcServices').calcService;
const cors = require('cors');
const serv = new Service();

server.use(cors());
server.use(parser.json());
server.get('/status',(req,res)=>{
    res.end('I am a Calculator')
});

server.post('/calc/add',(req,res)=>{
    res.setHeader('content-type','application/json');
    //console.log(JSON.stringify(req.body));
    res.end(JSON.stringify({
        'data': serv.setdata(req.body.val1,req.body.op)
    }))
});

server.get('/calc',(req,res)=>{
    const value = serv.val;
    const op = serv.op;

    res.end(JSON.stringify(value));
    console.log(value);
    
})

server.listen(1200,()=>{
    console.log('Server started at port 1200 ');
})