const add = ()=>{
    let name = document.getElementById('name').value;
    let email = document.getElementById('email').value;
    let org = document.getElementById('org').value;

   
    let info = [];
    info = {
        'name': name,
        'email': email,
        'org': org
    };

    table = `<table>
    <tr>
    <th>Name</th>
    <th>Email</th>
    <th>Organisation</th>
    </tr>`;

let row = '';
    localStorage.setItem(info,JSON.stringify(info));
    

    Object.keys(localStorage).forEach((key)=>{

        info = JSON.parse(localStorage.getItem(key));
        
       
        //console.log(info.email);
        //console.log(info.name);
        table +=`<tr>
            <td>${info.name}</td>
            <td>${info.email}</td>
            <td>${info.org}</td>
        </tr>`;
        

    });

   
        table += `</thead>`;

    document.getElementById('display').innerHTML = table;

    }

    
    const remove = ()=>{
        let r_email = document.getElementById('remove_email').value;
 
         if(localStorage.getItem(remove_email)!= undefined){
             Object.keys(localStorage).forEach((key)=>{
 
                 if(key == r_email){
                    alert('already exits');
                 }
 
             });
             
             }
         }