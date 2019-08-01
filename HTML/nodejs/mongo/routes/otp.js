const route = require('express').Router();
const Service = require('../services/otpService').otpService;
const serv = new Service();

route.post('/',(req,res)=>{//body-> email
    serv.storeDetails(req.body,((err,data)=>{
        if(err)
        {
            res.status(403).json({
                message : 'Error'
            })
        }
        else
        {
            res.status(200).json({
                message : `stored the mail id in the Database successfully`
            })
        }
    }))
})

route.post('/send',((req,res)=>{/*body-> email */
    serv.isValid(req.body,(bool)=>{
        if(bool)
        {
            serv.sendOtp(req.body,((err,data,otp)=>{
                if(err)
                {
                    res.status(403).json({
                        message : 'Invalid email ID'
                    })
                }
                else
                {
                    res.status(200).json({
                        message : 'email sent successfully'
                    })
                    serv.updateOtp(otp, req.body);
                    setTimeout(()=>{
                        //console.log('Tadaaa!!!')
                        serv.removeOtp(req.body);
                    },30000);
                }
            }))
        }
    })
}))


route.post('/validate',(req,res)=>{
    serv.fetchOtp(req.body,(err,data)=>{
        if(err)
        {
            res.status(401).json({
                message : 'Error'
            })
        }
        else
        {
            console.log(req.body.otp);
            console.log(data[0].otp);
            if(req.body.otp == data[0].otp)
            {
                
                res.status(200).json({
                    message : 'OTP verified successfully'
                })
                
            }
            else
            {
                res.status(200).json({
                    message : 'Cannot able to validate! Enter the correct OTP'
                })
            }
            
        }
    })



})

module.exports = {
    otpRoutes : route
}
