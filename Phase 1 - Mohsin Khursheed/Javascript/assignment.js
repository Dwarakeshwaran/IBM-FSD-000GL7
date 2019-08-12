
function result() {
    

    let m1 = document.getElementById('mark1').value;
    let m2 = document.getElementById('mark2').value;
    let m3 = document.getElementById('mark3').value;

    let e = parseInt(m1);
    let m = parseInt(m2);
    let s = parseInt(m3);
    

    let marks = [e,m,s];
    let subject = ['English','Maths','Science'];
    let rows='';
        
    for( i in subject){
        rows += `<tr><td>${parseInt(i)+1}</td><td>${subject[i]}</td><td>${marks[i]}</td></tr>`;
    }

    let table;

    table = `<table><tr><th>Sl.No</th><th>Subject</th><th>Marks</th></tr>${rows}</table>`;
    document.getElementById('sub').innerHTML = table;  

    let percent = (e+m+s)/3;
    if(e>=60 && m>=60 && s>=60)
    {
        if(percent>=60 && percent<=79)
        alert(`Congrats!! You have passed with Grade B Percent: ${percent}`);
    }

    if(e>=60 && m>=60 && s>=60)
    {
        if(percent>=80 && percent<=89)
        alert("Congrats!! You have passed with Grade A");
    }    if(e>=60 && m>=60 && s>=60)

    {
        if(percent>=90 && percent<=100)
        alert("Congrats!! You have passed with Distinction");
    }

    else
    {
        alert("You have Failed!! ");
    }

       
    
    
}


