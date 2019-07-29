import { Component, OnInit } from '@angular/core';

import {CpUsersService } from '../cpUsers.service';
import { ActivatedRoute, Router } from '@angular/router';
import { AddUser } from '../add-user';
import { AddUserService } from '../add-user.service';
import {CpUsers} from '../CpUsers';
import { MessageService } from '../services/message.service';
import { CookieService} from 'ngx-cookie-service';
@Component({
  selector: 'app-new-admin',
  templateUrl: './new-admin.component.html',
  styleUrls: ['./new-admin.component.css']
})
export class NewAdminComponent {
  addUser:AddUser;
  confirm_password:string;
  cpUsers:CpUsers[];
  flag:boolean;
  id;
  constructor(private addUserService:AddUserService,private cookie: CookieService,private cpUsersService:CpUsersService,private route: ActivatedRoute, private router: Router,private msgService:MessageService) { 
    this.addUser=new AddUser();
    this.id=this.cookie.get('userid');
    this.addUser.create_uid=this.id;
    this.cpUsersService.findAll().subscribe(data =>{
      this.cpUsers=data;}
    )
  }


  onSubmit(){
    if(this.addUser.password===this.confirm_password ){
      this.cpUsers.forEach(element => {
        if(element.username===this.addUser.username){
          this.flag=false;
        }
      });  
      this.usercheck();
    }
    else{
      this.msgService.showMsg("password mismatch with confirm password");
    }
  }
  gotoLogin(){
    this.router.navigate(['/Main/Details']);
  }
  usercheck(){
    if(this.flag===false){
      this.msgService.showMsg("Thsi email id is already used.");
    }
    else{
      this.addUserService.saveAdmin(this.addUser).subscribe(result => this. gotoLogin());
    }
  }

}
