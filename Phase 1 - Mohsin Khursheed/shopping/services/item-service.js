const data = require('../db/items-data').items;
const datac = require('../db/cart-data').cart;

const dataClass = class Service{

    constructor(){
        this.items = data;
    }

    getData(){
        return this.items;
    }



}

class CartService{
    constructor(){
        this.cart = datac;
    }
    getData(){
        return this.cart;
    }
    setData(cart){
        this.cart.push(cart);
        return this.cart;
    }
}

module.exports.CartService = CartService;

module.exports.dataClass = dataClass;