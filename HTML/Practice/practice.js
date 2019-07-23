const express = require('express');
const server = express();
const parser = require('body-parser');

server.use(parser.json());
server.get('/status',(req,res)=>{
    res.end("Welcome to Express Nodemon version 2");
})

server.listen(1000,()=>{
    console.log("Port is started at 1000");
})

server.post('/post',(req,res)=>{
    res.setHeader('Content-Type','Application/json');
    res.end(JSON.stringify({
        "id" : req.body.id,
        "name":req.body.name
    }))
})