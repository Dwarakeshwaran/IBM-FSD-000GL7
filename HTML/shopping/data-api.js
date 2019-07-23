

class Data{
    data(obj){
        this.object = obj;
    }

    get(){
        return this.object;
    }

    build(obj){
        table = `<table>`

        table += `
                <tr>
                <td>${obj.price}</td>
                </tr>`
        table+=`</table>`
    }
}

module.exports.Data = Data;



