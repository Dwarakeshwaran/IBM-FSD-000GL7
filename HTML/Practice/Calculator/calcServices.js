const data=[];

class calcService{
    constructor(){
        this.data = data;
    }

    getdata(){
        return this.data;
    }

    setdata(value,operator){
this.val = value;
        this.op = operator;
        

        this.data.push({
            'value':this.val,
            'operator':this.op
        });

        return this.data;
        
    }
}

module.exports.calcService = calcService;