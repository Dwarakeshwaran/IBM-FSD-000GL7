const server = require('express').Router();
const UService = require('../services/user-service').UserService;
const userService = new UService();


// get all users
server.get('/',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        product : userService._all()
    }));
});

server.post('/buy',(req,res)=>{
    res.setHeader('content-type','application/json');
    userService.buy(req.body);
})

module.exports.userRoutes = server;