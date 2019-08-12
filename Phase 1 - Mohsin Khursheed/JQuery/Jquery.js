$(document).ready(() => {

    $('#top-menu').menu({});
    //$('#acc').accordion();

    console.log("Check");
    $('#login').hide();
    $('#register').hide();
    $('#search').hide();

    $('#tab1').click(() => {
        $('#login').hide();
        $('#search').hide();
        $('#register').fadeIn();
    });

    $('#tab2').click(() => {
        $('#register').hide();
        $('#search').hide();
        $('#login').fadeIn();
    });
    $('#tab3').click(() => {
        $('#register').hide();
        $('#login').hide();
        $('#search').fadeIn();
    });




    $('#save').click(() => {

        $('#register').show();
        let id = $('#uid').val();
        let name = $('#uname').val();
        let password = $('#pass').val();
        let email = $('#email').val();
        let phone = $('#phone').val();
        // console.log(`ID : ${id}`);
        // console.log(`Name : ${name}`);
        // console.log(`Password : ${password}`);
        // console.log(`Email : ${email}`);
        // console.log(`Phone : ${phone}`);

        let info;
        info = {
            'id':id,
            'name':name,
            'password':password,
            'email':email,
            'phone':phone
        }

        localStorage.setItem(info.id,JSON.stringify(info))

        Object.keys(localStorage).forEach((key)=>{
            info = (JSON.parse(localStorage.getItem(key)))

        })
        console.log(info);
        
    })

    $('#loginBtn').click(() => {

        let info ='';
        let lname = $('#lname').val();
        let lpass = $('#lpass').val();
        Object.keys(localStorage).forEach((keys) => {
            info = (JSON.parse(localStorage.getItem(keys)));
        })
        console.log(info.id);
        if(info.name == lname && info.password == lpass)
        alert("Logged Successfully");
        else
        alert("Invalid Username or Password");


    })

    $('#save').click(() => {
        $('#frm-reg').validate({

            rules: {
                id: "required",
                name: "required",
                pass: "required",
                email: "required",
                phone: "required"

            },

            // messages: {
            //     id: "Fill the Id Field"
            // }
        })

    })

    
    $('#findId').click(()=>{

        //console.log("check");
        let searchId = $('#sid').val();
        let info = '';
        Object.keys(localStorage).forEach((keys) => {
            info = (JSON.parse(localStorage.getItem(keys)));
        })
        //console.log(info);
        $('info').filter().each((i,e) =>{
            console.log(e);
        })
    })




})
