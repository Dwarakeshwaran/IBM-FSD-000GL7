const product = require('../db/users').product;
const email = require('../services/emailservice').Email;
class UserService{
    constructor(){
        this.product = product;
    }
    _all(){
        return this.product;
    }

    buy(data){
        let userObj ={
            subject : "User Registration",
            body : `<div>Dear <b>${data.name}</b></div>
                    <div>Thank you for ordering</div>`,
            from : null,
            to : data.email
        }
        emailService.emailWithAttachment(userObj);
    }
    
}


    

module.exports.UserService = UserService;