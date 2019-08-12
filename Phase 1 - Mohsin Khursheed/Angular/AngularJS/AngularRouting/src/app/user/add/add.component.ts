import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router'

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {
  

  user:User;
  id;
  name;
  email;
  constructor(private route:ActivatedRoute) { }
  show()
  {
    this.id = this.route.snapshot.paramMap.get('id');
    this.name = this.route.snapshot.params.name;
    this.email = this.route.snapshot.params.email;
    console.log(this.id);

  }

  ngOnInit() {
   
  }

  add(data)
  {
    //console.log('Check');
    this.user.id = data.id;
    this.user.name = data.name;
    this.user.email = data.email;

    
  }

  
}

interface User{
  id : number
  name : string
  email : string

}
