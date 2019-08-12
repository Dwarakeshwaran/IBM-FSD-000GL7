const route = require('express').Router();
const UService = require('../services/UserService').UserService;
const serv = new UService();

route.get('/status',(req,res)=>{
    res.status(200).json({
        message : 'Service Started'
    })
})

route.get('/',(req,res)=>{
    serv.fetchData((users)=>{
        res.status(200).json({
           data : users
            
        })
    })
    
})

module.exports = {
    userRoute : route
}