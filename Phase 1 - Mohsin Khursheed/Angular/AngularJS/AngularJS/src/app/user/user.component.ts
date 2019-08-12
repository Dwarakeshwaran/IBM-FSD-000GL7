import { Component, OnInit, Input } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  users:User[];
  uCount = 4;
  active = 3;
  inactive = 1;
  index;
  constructor(private uService : UserService) { }
  add(){
    this.users = this.uService.add();
    this.active +=1;
    
   
  }
  
  delete(){
    //this.users = this.uService.swap();
    
    
    this.users.pop();


   
    //this.users;
    this.active -=1;
    
  }
   
  
  ngOnInit() {

    this.users = this.uService.get();
  }

}
interface User{
  id:number
  name:String
  age:number
}