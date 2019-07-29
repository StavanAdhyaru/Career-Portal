import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import {CpUsers} from '../CpUsers';
import {CpUsersService} from '../cpUsers.service'

@Component({
  selector: 'app-cpUsers-form',
  templateUrl: './cpUsers-form.component.html',
  styleUrls: ['./cpUsers-form.component.css']
})
export class CpUsersFormComponent{
  cpUser: CpUsers;
  constructor(private route: ActivatedRoute, private router: Router, private cpUsersService: CpUsersService) {
    this.cpUser= new CpUsers();
   }
  onSubmit() {
    this.cpUsersService.save(this.cpUser).subscribe(result => this. gotoCpUsersList());
  }
  gotoCpUsersList() {
    this.router.navigate(['/Details']);
  }


}
