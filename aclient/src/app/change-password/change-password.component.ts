import { Component, OnInit } from '@angular/core';
import { CpUsers } from '../CpUsers';
import { CpUsersService } from '../cpUsers.service';
import { CookieService } from 'ngx-cookie-service';
import { MessageService } from '../services/message.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-change-password',
  templateUrl: './change-password.component.html',
  styleUrls: ['./change-password.component.css']
})
export class ChangePasswordComponent implements OnInit {
  cpUser: CpUsers;
  newPassword: string;
  oldPassword: String;
  confirmPassword;
  userid;
  constructor(private msgService: MessageService, private cookie: CookieService, private service: CpUsersService, private router: Router) { }

  ngOnInit() {
    this.userid = this.cookie.get('userid');
    this.service.findById(this.userid).subscribe(data => {
      this.cpUser = data;
    })
  }
  onSubmit() {
    this.userid = this.cookie.get('userid');
    if (this.newPassword != this.confirmPassword) {
      this.msgService.showMsg("new Password and confirm-Password mismatch");
    }
    else {
      if (this.cpUser.password === this.oldPassword) {
        this.cpUser.password = this.newPassword;
        this.changePassword();
      }

      else {
        this.msgService.showMsg("Your Password is incorect");
      }
    }
  }

  changePassword(){
    this.service.update(this.userid, this.cpUser);
     this.router.navigate(['/']);
        this.msgService.showMsg("Password changed Successfully");
  }

}
