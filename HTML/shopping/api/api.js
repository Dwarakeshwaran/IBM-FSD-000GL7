const server = require('express').Router();
const Data = require('../services/item-service').dataClass;
const dataObj = new Data();

server.get('/',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        cart : dataObj.getData()
    }));
}); 

server.post('/add',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        cart : dataObj.setData(req.body)
    }));
});


module.exports.api = server;