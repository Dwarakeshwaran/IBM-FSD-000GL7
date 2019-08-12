const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');
const userRoutes = require('./apis/users').userRoutes;
const cartRoutes = require('./apis/cart').cartRoutes;
const setContentHeader = require('./services/utils').setContentHeader;
// apply json parser
server.use(parser.json());
// apply cors
server.use(cors());

server.get('/status',(req,res)=>{
    setContentHeader(res);
    res.end(JSON.stringify({
        message: "Server is RUNNING successfully"
    }));
});



// add routes to server
server.use('/product',userRoutes);

server.use('/cart',cartRoutes);

// PORT Binding
server.listen(1200,()=>{
    console.log('Server started at 1200');
});
