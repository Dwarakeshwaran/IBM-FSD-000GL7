const server = require('express').Router();
const UService = require('../services/userService').UserService;
const userService = new UService();
const setContentHeader = require('../services/utils').setContentHeader;

// get all users
server.get('/',(req,res)=>{
    setContentHeader(res);
    res.end(JSON.stringify({
        product : userService._all()
    }));
});

server.post('/buy',(req,res)=>{
    userService.buy(req.body);
})

module.exports.userRoutes = server;