const data = require('../db/items-data').items;

class Service{

    constructor(){
        this.items = data;
    }

    getData(){
        return this.items;
    }

}

module.exports.Service = Service;