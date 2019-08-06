const dta = require('./db').datas;

class Service{
    constructor(){
        this.data = dta;
    }
    getData(){
        return this.data;
    }
    setData(obj){
        this.data.push(obj);
        return this.data;
    }
}

module.exports.Service = Service;



