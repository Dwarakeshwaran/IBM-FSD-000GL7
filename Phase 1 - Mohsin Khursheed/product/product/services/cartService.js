const cart = require('../db/cart').cart;
class CartService{
    constructor(){
        this.cart = cart;
    }
    _all(){
        return this.cart;
    }
    _add(cart){
        this.cart.push(cart);
        return this.cart;
    }
}

module.exports.CartService = CartService;