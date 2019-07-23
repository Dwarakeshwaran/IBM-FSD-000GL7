const server = require('express').Router();
const Data = require('./data-api').Data;
const dataObj = new Data();

server.post('/cart',(req,res)=>{
    res.setHeader('content-type','application/json');
    console.log(JSON.stringify(req.body));
  
})


module.exports.api = server;