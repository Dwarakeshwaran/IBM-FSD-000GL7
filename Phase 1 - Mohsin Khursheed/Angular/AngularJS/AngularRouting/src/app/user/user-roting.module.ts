import {  NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddComponent } from './add/add.component';
import { DeleteComponent } from './delete/delete.component';
import { DisplayComponent } from './display/display.component';
import { ModifyComponent } from './modify/modify.component';

const routes: Routes = [
  {
    path : 'user',
    children : [
      {
        path : 'add',
        component : AddComponent
      },
      {
        path : 'delete',
        component : DeleteComponent
      },
      {
        path : 'display',
        component : DisplayComponent
      },
      {
        path :'modify',
        component : ModifyComponent
      },
      {
          path : '',
          component : DisplayComponent
      }
    ]
  }
];

@NgModule({
    imports : [RouterModule.forRoot(routes)],
    exports : [RouterModule]
})

export class UserRoutingModule{}
