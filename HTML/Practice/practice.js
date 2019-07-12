const add = () =>{
    const emp = new EmployeeDetails();

    emp.setup(
        document.getElementById('eid').value,
        document.getElementById('ename').value,
        document.getElementById('esalary').value
    )

    emp._add();
}







class EmployeeDetails{
    setup(id,name,salary){

        this.id = id
        this.name = name
        this.salary = salary

    }

    _add(){

        localStorage.setItem(this.id,JSON.stringify({
            eID : this.id,
            eName : this.name,
            eSalary : this.salary
        }))

        
    }
}