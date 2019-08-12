import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {
    users:User[]
    
    temp

  constructor() { }

  add(){
    this.users.push({
      id:4,
      name:'Sangamesh',
      age:24
    })
    return this.users;
  }

  swap(){
    
    
    return this.users;
  }
  
  get(){
    return this.users=[
      {
        id:1,
        name:'Dwaki',
        age:21
      },
      {
        id:2,
        name:'Poorvik',
        age:22
      },
      {
        id:3,
        name:'Dhiraj',
        age:23
      }
  ]
  }
  }

interface User{
  id:number
  name:string
  age:number
}