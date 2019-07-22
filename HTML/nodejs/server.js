const http = require('http');

const server = http.createServer((request,response)=>{
    if(request.url === '/')
    {
        response.end(()=>{
            JSON.stringify(
                {
                    'name':Dwaki,
                    'password':123
                }
            )
        });
    }
})
// const port = parseInt(process.argv[2] || '1000')
// server.listen(port,()=>{
//     console.log(`Server started at port ${port}`);
// });