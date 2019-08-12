const server = require('express').Router();
const Data = require('../services/item-service').CartService;
const dataObj = new Data();


server.post('/add',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        cart : dataObj.setData(req.body)
    }));
});

server.get('/',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        cart : dataObj.getData()
    }));
}); 



module.exports.api = server;