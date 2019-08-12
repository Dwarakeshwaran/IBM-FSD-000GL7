const movies = [
    {
        name : 'AO',
        director : 'Selvaragavan',
        genre : 'Adventure',
        composer : 'GVP'
    },

    {
        name : 'Tamil MA',
        director : 'Ram',
        genre : 'Thriller',
        composer : 'YSR'
    },

    {
        name : 'Aadukalam',
        director : 'Vetrimaaran',
        genre : 'Drama',
        composer : 'GVP'
    },

    {
        name : 'Raasukutti',
        director : 'Bhaagyaraj',
        genre : 'Drama',
        composer : 'Ilayaraja'
    },

    {
        name : 'Pisaasu',
        director : 'Myskkin',
        genre : 'Thriller',
        composer : 'Ilayaraaja'
    }
];

movies.forEach((m)=>
console.log(m)

);

function display(){
    
    
    let rows ='';
    movies.forEach((m)=>

        rows += `<tr>
                <td>${m.name}</td>
                <td>${m.director}</td>
                <td>${m.genre}</td>
                <td>${m.composer}</td>
                </tr>`

    );


    table = `<table>
            <tr>
            <th>Movie Name</th>
            <th>Director</th>
            <th>Genre</th>
            <th>Composer</th>
            </tr>
            ${rows}
            </table>`;

    document.getElementById('movie_table').innerHTML = table;
}


