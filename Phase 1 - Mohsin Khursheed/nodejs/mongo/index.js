const express = require('express');
const parser = require('body-parser');
const cors = require('cors');
const server = express();
const PORT = 2305;

//const users = require('./routes/users').userRoute;

const otp = require('./routes/otp').otpRoutes;
server.use(cors());
server.use(parser.json());

//server.use('/users',users);
server.use('/database',otp);

server.get('/status',(req,res)=>{
    res.status(200).json({
        message:'Started Successfully'
    })
})

server.listen(PORT,()=>{
    console.log(`Server started at port ${PORT}`);
})