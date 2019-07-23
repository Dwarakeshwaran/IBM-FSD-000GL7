const express = require('express');
const server = express();
const Service = require('./services/item-service').Service;
const parser = require('body-parser');
const cors = require('cors');


const api = require('./api').api;
//const urlParser = parser.json({ extended: true });


const iservice = new Service();

server.use(cors());
server.use(parser.json())

server.get('/status',(req,res)=>{
    res.end("Welcome to ABC Shopping");
})

server.get('/items',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        items : iservice.getData()
    }))
})

server.use('/cart',api);



server.listen(1000,()=>{
    console.log("Server started at port 1000");
})