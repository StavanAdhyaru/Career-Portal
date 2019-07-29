import { Component, OnInit } from '@angular/core';
import {CpUsers} from '../CpUsers';
import {CpUsersService} from '../cpUsers.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-forgot-password',
  templateUrl: './forgot-password.component.html',
  styleUrls: ['./forgot-password.component.css']
})
export class ForgotPasswordComponent implements OnInit {
  cpUser:CpUsers
  constructor(private cpUsersService:CpUsersService,private router:Router) { }

  ngOnInit() {
  }
  onSubmit(id:BigInteger) {
    this.cpUsersService.update(id,this.cpUser).subscribe(result => this.router.navigate(['/']));
  }
}
