
const saveDetails = () =>{

    //console.log("save called");
    const trainer = new Timetable();

    trainer.input(
        document.getElementById('t_name').value,
        document.getElementById('t_room').value,
        document.getElementById('t_skills').value,
        document.getElementById('t_time').value,
    )

    trainer.store(trainer);

    //const getValues = trainer.retrieve();

    //console.log(getValues);



}

const checkDetails = () =>{
    const trainer = new Timetable();

    trainer.input(
        document.getElementById('t_name').value,
        document.getElementById('t_room').value,
        document.getElementById('t_skills').value,
        document.getElementById('t_time').value,
    )

    //console.log(trainer);
    const getValues = trainer;
    
    const storageValues = [];
    Object.keys(localStorage).forEach((keys)=>{
        storageValues.push(JSON.parse(localStorage.getItem(keys)));
        //if(keys.t_room == getValues.t_room)
    })

    // console.log(storageValues[0].t_name);
    let flag1 = 0;
    let flag2 = 0;
    let checkNames = [];
    let checkRoom = [];
    let checkSkills = [];
    let checkTime = [];

    for(let i = 0; i<storageValues.length;i++)
    {
        checkNames[i] = storageValues[i].t_name;
        checkRoom[i] = storageValues[i].t_room;
        checkSkills[i] = storageValues[i].t_skills;
        checkTime[i] = storageValues[i].t_time;
    }
    

    // console.log(checkRoom);
    for(let j = 0 ; j<storageValues.length ; j++)
    {
        if(getValues.t_name == checkNames[j])
        flag1 = 1;
        if(getValues.t_room == checkRoom[j] || getValues.t_skills == checkSkills[j] || getValues.t_time == checkTime[j])
        flag2 = 1;
    }

    //console.log(flag1);
    //console.log(flag2);
    if(flag1 == 1)
    alert("Trainer exists already");
    else if(flag2 == 1)
    alert("Slot is already taken");
    else
    alert("You are good to go!! Please Click Submit");  
    


}

const displayDetails = () =>{
    const trainer = new Timetable();

    let details = trainer.retrieve();

    trainer.DisplayDetails(details);


}

const deleteDetails = () =>{

    const trainer = new Timetable();
    
    let name = document.getElementById('t_name').value;

    //console.log(name);

    trainer.delete(name);
}


//CLASS STARTS HERE
class Timetable{
    input(t_name,t_room,t_skills,t_time){
        this.t_name = t_name
        this.t_room = t_room
        this.t_skills = t_skills
        this.t_time = t_time
    }

    store(obj){

        localStorage.setItem(obj.t_name, JSON.stringify(obj));
        
    
    }
    
    retrieve(){
        const trainer = [];
    
        Object.keys(localStorage).forEach((keys)=>{
            trainer.push(JSON.parse(localStorage.getItem(keys)));
    
        })
    
        return trainer;
    
    }

    delete(obj){
        localStorage.removeItem(obj);   
    }

    DisplayDetails(obj){

        let table = '';

        table = `
        <table border='1px'>
        <tr>
        <th>SUBJECTS</th>
        ${this.generateRow0(obj)}
        </tr>
        <tr>
        <th> TRAINER NAME</th>
        ${this.generateRow1(obj)}
        </tr>
        <tr>
        <th> TIMESLOT</th>
        ${this.generateRow2(obj)}
        </tr>
        <tr>
        <th> CLASS NAME</th>
        ${this.generateRow3(obj)}
        </tr>`

        document.getElementById('show').innerHTML = table;

    }
    generateRow0(obj){

        let row0 = '';

            for(let i = 0; i<localStorage.length; i++)
            row0 +=`<th>${obj[i].t_skills}</th>`;
            

        return row0;
        
    }

    generateRow1(obj){

        let row1 = '';

            for(let i = 0; i<localStorage.length; i++)
            row1 +=`<td>${obj[i].t_name}</td>`;
            

        return row1;
        
    }
    generateRow2(obj){

        let row2 = '';

            for(let i = 0; i<localStorage.length; i++)
            row2 +=`<td>${obj[i].t_time}</td>`;
            

        return row2;
        
    }
    generateRow3(obj){

        let row3 = '';

            for(let i = 0; i<localStorage.length; i++)
            row3 +=`<td>${obj[i].t_room}</td>`;
            

        return row3;
        
    }
    
    
}


const clr = () =>{
    document.getElementById('t_name').value = '';
    document.getElementById('t_room').selectedIndex = "0";
    document.getElementById('t_skills').selectedIndex = "0";
    document.getElementById('t_time').selectedIndex = "0";
}