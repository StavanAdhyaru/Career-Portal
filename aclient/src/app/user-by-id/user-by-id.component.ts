import { Component, OnInit } from '@angular/core';
import { CpUserProfileService} from '../cp-user-profile.service';
import {CpUserProfile} from '../cp-user-profile';
import { ActivatedRoute } from "@angular/router";
import {Globals} from '../global';

@Component({
  selector: 'app-user-by-id',
  templateUrl: './user-by-id.component.html',
  styleUrls: ['./user-by-id.component.css']
})
export class UserByIdComponent implements OnInit {
  cpUserProfile:CpUserProfile;  
  id;

  constructor(private cpUsersSevice: CpUserProfileService,private route: ActivatedRoute,private globals: Globals){ 
    globals.headerText="User Detail";
  }

  ngOnInit() {
    this.id = this.route.snapshot.paramMap.get("id");
    this.cpUsersSevice.findById(this.id).subscribe(data=>{
        this.cpUserProfile=data;
    })
  }

}
