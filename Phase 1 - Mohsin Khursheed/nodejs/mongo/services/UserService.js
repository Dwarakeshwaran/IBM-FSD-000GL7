const MongoClient = require('mongodb').MongoClient;

class UserService{

    fetchData(callback){
        
        MongoClient.connect('mongodb://localhost:27017',(err,conn)=>{
            conn.db('test').collection('users').find({}).toArray((err,users)=>{
                if(!err){
                    callback(users);
                   
                }
                else{
                    console.log('Error Fetching the details');
                }
                
            })
        })
    }


    //add()
}

module.exports={
    UserService
}
    
