const route = require('express').Router();
const Service = require('../services/otpService').otpService;
const serv = new Service();

route.post('/data',(res,req)=>{
    res.setHeader('content-type','application/json');
    serv.getDetails(req.body,((err,data)=>{
        if(err)
        {
            res.status(403).json({
                message : 'Error'
            })
        }
        else
        {
            res.status(200).json({
                message : data
            })
        }

    }))
})

route.post('/',(req,res)=>{//body-> email
    res.setHeader('content-type','application/json');
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
    res.setHeader('content-type','application/json');
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
                        let flag = 0;
                        //console.log('Tadaaa!!!')
                        serv.removeOtp(req.body);
                        serv.flag=1;
                    },30000);
                }
            }))
        }
    })  
}))


route.post('/validate',(req,res)=>{
    res.setHeader('content-type','application/json');
    serv.fetchOtp(req.body,(err,data)=>{
        if(err)
        {
            res.status(401).json({
                message : 'Error'
            })
        }
        else if(data!=null)
        {
            console.log(req.body.otp);
            console.log(data[0].otp);
            if(req.body.otp == data[0].otp)
            {
                
                res.status(200).json({
                    message : 'OTP verified successfully'
                })
                //res.redirect('../ConfirmPassword.html')
                console.log('OTP Verified Successfully');
                
            }
        }
        else
            {
                res.status(200).json({
                    message : 'Cannot able to validate! Enter the correct OTP'
                })
            }
    })



})

module.exports = {
    otpRoutes : route
}
