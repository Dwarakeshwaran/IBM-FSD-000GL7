const product = require('../db/items-data').items;
const Email = require('./email-service').Email;
const nodemailer = require('nodemailer');
const email = new Email();
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
        //emailService.emailWithAttachment(userObj);
    }
    
}


    

module.exports.UserService = UserService;