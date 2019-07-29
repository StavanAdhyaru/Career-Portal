import { Component, OnInit } from '@angular/core';
import {AddUserService} from '../add-user.service';
import { ActivatedRoute, Router } from '@angular/router';
import {CpUsers} from '../CpUsers';
import {CpUserProfile} from '../cp-user-profile';
import {AddUser} from '../add-user';
import {MessageService} from '../services/message.service';
import { CpUsersService } from '../cpUsers.service';
@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent {

  addUser:AddUser;
  cpUsers: CpUsers[];
  confirm_password:string;
  flag:boolean;
  
  constructor(private msgService:MessageService,private addUserService: AddUserService,private route: ActivatedRoute, private router: Router, private cpUsersService: CpUsersService) {
    this.addUser = new AddUser();
    this.cpUsersService.findAll().subscribe(data =>{
      this.cpUsers=data;
    })
   }
  
  onSubmit(){
    if(this.addUser.password===this.addUser.confirmpassword ){
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
    this.router.navigate(['/']);
  }
  usercheck(){
    if(this.flag===false){
      this.msgService.showMsg("Thsi email id is already used.");
    }
    else{
      this.addUserService.save(this.addUser).subscribe(result => this. gotoLogin());
    }
  }

}
