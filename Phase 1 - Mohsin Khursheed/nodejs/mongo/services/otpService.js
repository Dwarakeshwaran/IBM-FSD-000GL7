const client = require('mongodb').MongoClient;
const mail = require('nodemailer');

class otpService{
    constructor(){
        this.flag = 0;
    }

    getDetails(details,callback){
        client.
        connect('mongodb://locahost:27017',(err,conn)=>{
            conn.db('busDetails').collection('details').find({},(err,data)=>{
                callback(err,data);
            })
        })
    }

    storeDetails(uDetails,callback){
        client.
        connect('mongodb://localhost:27017',(err,conn)=>{
            conn.db('test').collection('mail').insert({email: uDetails.email},(err,data)=>{
                callback(err,data);
            })
        })

    }

    sendOtp(emailid,callback){

        const otp = this.generateOTP();
        const transporter = mail.createTransport({
            service : 'gmail.com',
            auth:{
                user : 'dwaki98@gmail.com',
                pass : 'malamon007'
            }
        }     
        )

        transporter.sendMail({
            from : 'dwaki98@gmail.com',
            to : emailid.email,
            subject : 'OTP',
            html : `<h1>${otp}</h1>`
        },(err,res)=>{
            if(err)
            {
                console.log('Error')
            }
            else
            {
                console.log('Success');
            }
            callback(err,res,otp)
        })

        
    }

    isValid(id,callback){
        
        client.
        connect('mongodb://localhost:27017',(err,conn)=>{
            conn.db('test').collection('mail').find({email : id.email}).toArray((err,data)=>{
                //console.log(data);
                if(data[0] == null){
                    callback(false);
                }
                else{
                    callback(true);
                }
            })
        })
       
    }

    updateOtp(pass,emailid){
        client.connect('mongodb://localhost:27017',(err,conn)=>{
            conn.db('test').collection('mail')
            .update({email : emailid.email},{$set:{otp : pass}})
        })
    }

    fetchOtp(pass,callback){
        console.log(this.flag);
        if(this.flag==0){
            console.log('OTP Alive');
            client.connect('mongodb://localhost:27017',(err,conn)=>{
                conn.db('test').collection('mail').find({otp : `${pass.otp}`}).toArray((err,data)=>{
                    callback(err,data);
                })
            })
        }
       else{
           console.log('OTP Expired');
           client.connect('mongodb://localhost:27017',(err,conn)=>{
                conn.db('test').collection('mail').find({otp : null}).toArray((err,data)=>{
                    callback(err,data);
                })
            })
       }
    }

    removeOtp(info){
        client.connect('mongodb://localhost:27017',(err,conn)=>{
            conn.db('test').collection('mail')
            .update({email : info.email},{$set:{otp : null}})
            
        })
    }

    generateOTP() { 
        const digits = '0123456789'; 
        let OTP = ''; 
        for (let loop = 0; loop < 4; loop++) { 
            OTP += digits[Math.floor(Math.random()*10)]; 
        } 
        return OTP; 
    } 
      
}

module.exports = {
    otpService
}