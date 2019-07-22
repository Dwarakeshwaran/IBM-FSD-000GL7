const express = require('express');
const server = express();

const parser = require('body-parser');

server.use(parser.json());

server.get('/calc',(req,res)=>{
    res.setHeader('content-type','application/json');

    res.end('ABC');

})

server.get('/calc/ADD/:val1/:val2',(req,res)=>{
    res.end(JSON.stringify({
        'result' : parseInt(req.params.val1) + parseInt(req.params.val2)
    }))
})
server.get('/calc/SUB/:val1/:val2',(req,res)=>{
    res.end(JSON.stringify({
        'result' : parseInt(req.params.val1) - parseInt(req.params.val2)
    }))
})
    
server.get('/calc/DIV/:val1/:val2',(req,res)=>{
    res.end(JSON.stringify({
        'result' : parseInt(req.params.val1) / parseInt(req.params.val2)
    }))
})
    
server.get('/calc/MUL/:val1/:val2',(req,res)=>{
    res.end(JSON.stringify({
        'result' : parseInt(req.params.val1) * parseInt(req.params.val2)
    }))
})
    
    
server.post('/user',(req,res)=>{
    //res.setHeader('content-type','application/json');
    res.end(JSON.stringify(
        {
            'id':req.body.id,
            'name':req.body.name
        }
    ))
});

const PORT = parseInt('1000');

server.listen(PORT,()=>{
    console.log(`Server started at port ${PORT}`);
})