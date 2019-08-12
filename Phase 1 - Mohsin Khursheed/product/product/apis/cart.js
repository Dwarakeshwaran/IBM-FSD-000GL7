const server = require('express').Router();
const Cart = require('../services/cartService').CartService;
const cart = new Cart();
const setContentHeader = require('../services/utils').setContentHeader;

server.get('/',(req,res)=>{
    setContentHeader(res);
    res.end(JSON.stringify({
        cart : cart._all()
    }));
});

server.post('/add',(req,res)=>{
    setContentHeader(res);
    res.end(JSON.stringify({
        cart : cart._add(req.body)
    }));
});

module.exports.cartRoutes = server;