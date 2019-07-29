import { Component, OnInit, Inject } from '@angular/core';
import {Globals} from '../global'
import {LoginService} from '../login.service';
import {CpUsers} from '../CpUsers';
import { ActivatedRoute, Router } from '@angular/router';
import {CookieService} from 'ngx-cookie-service';
import { HostListener} from '@angular/core';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { MessageService} from '../services/message.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent{
  cpUser: CpUsers;
  id;
  wHeight:number;
  name;
  admin;
  alert:String="Invalid credential";
  constructor(private msgService : MessageService,private globals: Globals,private loginService:LoginService,private route: ActivatedRoute, private router: Router,private cookieService:CookieService,public dialog: MatDialog) { 
    globals.headerText="Login page";
    this.cpUser= new CpUsers();
    this.onResize();
  }
  onSubmit() {
    this.loginService.save(this.cpUser).subscribe(data=>{
      if(data){
        this.cpUser=data;
        this.globals.cpUser=this.cpUser;
        this.id=this.globals.cpUser.id;
        this.name=data.username;
        this.admin=data.isadmin;
        this.cookieService.set('userid',this.id);
        this.cookieService.set('username',this.name);
        this.cookieService.set('isadmin',this.admin);
        this.router.navigate(['/Main/home']);
      }
      else{
        this.msgService.showMsg("Invalid Credential");
      }
      
    });
  }
  @HostListener('window.resize',['$event'])
  onResize(event?){
    this.wHeight = window.innerHeight;
  }

}
export class LoginComponentDialog {

  constructor(
    public dialogRef: MatDialogRef<LoginComponentDialog>) {}

  onNoClick(): void {
    this.dialogRef.close();
  }

}