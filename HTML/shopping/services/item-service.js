const data = require('../db/items-data').items;

const dataClass = class Service{

    constructor(){
        this.items = data;
    }

    getData(){
        return this.items;
    }

    setData(data){
        this.items.push(data);
        return this.items;  
    }

}

module.exports.dataClass = dataClass;