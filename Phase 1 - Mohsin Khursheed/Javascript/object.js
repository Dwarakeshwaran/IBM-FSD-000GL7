class Employee {
    getdata() {

        let name = document.getElementById('name').value;
        let email = document.getElementById('email').value;
        let org = document.getElementById('org').value;

        let info = [];
        info = {
            'name': name,
            'email': email,
            'org': org
        };
        console.log(info);
        return info;
    }


    setdata(data) {
        let rows = '';
        localStorage.setItem(data.email, JSON.stringify(data));
        Object.keys(localStorage).forEach((key) => {
            data = JSON.parse(localStorage.getItem(key));
            console.log(data);
            rows += `<tr>
            <td>${data.name}</td>
            <td>${data.email}</td>
            <td>${data.org}</td>
            </tr>`
        })

        return rows;
        
      
     }

     display(data) {
        let table = '';

        table = `<table>
        <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Organisation</th>
        </tr>
        ${data}
        </thead>`;

        document.getElementById('display').innerHTML = table;

    }



}

function add() {

    const obj = new Employee();

    obj.display(obj.setdata(obj.getdata()));
    // var get = obj.getdata();

    // var set = obj.setdata(get);

    // var show = display(set);

}




