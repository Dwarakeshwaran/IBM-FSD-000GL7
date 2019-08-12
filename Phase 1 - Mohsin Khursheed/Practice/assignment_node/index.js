const express = require('express');
const server = express();
const cors = require('cors');
const Users = require('./fetchdata').UserFetch;
const Projects = require('./fetchdata').ProjectFetch;
const userFetch = new Users();
const projectFetch = new Projects();
 //const projects = require('./data/projects').projects;

 
server.use(cors());
server.get('/status',(req,res)=>{

    res.end(JSON.stringify({

        'users' : userFetch.fetchfdata(),
        'projects': projectFetch.fetchdata()
    }));
})



server.listen(1000,()=>{
    console.log(`Server Started at port ${1000}`);
})