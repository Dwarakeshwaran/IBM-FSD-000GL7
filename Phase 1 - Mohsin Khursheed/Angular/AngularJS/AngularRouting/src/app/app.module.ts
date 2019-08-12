import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddComponent } from './user/add/add.component';
import { DeleteComponent } from './user/delete/delete.component';
import { DisplayComponent } from './user/display/display.component';
import { ModifyComponent } from './user/modify/modify.component';
import { UserModule } from './user/user.module';
import { UserRoutingModule } from './user/user-roting.module';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    AddComponent,
    DeleteComponent,
    DisplayComponent,
    ModifyComponent,
    
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    UserModule,
    UserRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
