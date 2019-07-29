import { Component } from '@angular/core';
import { BreakpointObserver, Breakpoints } from '@angular/cdk/layout';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import {Globals} from '../global';
import {CpUsers} from '../CpUsers';
import { ActivatedRoute, Router } from "@angular/router";
import {CookieService} from 'ngx-cookie-service';
import {CpUserProfileService} from '../cp-user-profile.service';
import { CpUserProfile } from '../cp-user-profile';
@Component({
  selector: 'main-nav',
  templateUrl: './main-nav.component.html',
  styleUrls: ['./main-nav.component.css']
})
export class MainNavComponent {

  isHandset$: Observable<boolean> = this.breakpointObserver.observe(Breakpoints.Handset)
    .pipe(
      map(result => result.matches)
    );
      cpUser:CpUsers;
      profile:CpUserProfile;
      id;
      admin;
  constructor(private cpUserProfileService:CpUserProfileService,private breakpointObserver: BreakpointObserver,public global: Globals,private router: Router,private cookieService:CookieService) {
  this.cpUser = new CpUsers();
  }
  ngOnInit() {
    if(this.cookieService.check('userid') && this.cookieService.check('username') && this.cookieService.check('isadmin')){
      this.id=this.cookieService.get('userid');   
      this.cpUser.id=this.id;
      this.admin=this.cookieService.get('isadmin') === "true" ?true:false;
      this.cpUser.isadmin=this.admin;
      this.cpUser.username=this.cookieService.get('username');
      this.cpUserProfileService.findById(this.cpUser.id).subscribe(data=>{
          this.profile=data;
      })
    }
    /*if(this.global.cpUser===undefined)
    {
      this.router.navigate(['/']);
    }*/
    else{
      //this.cpUser=this.global.cpUser;
      this.router.navigate(['/']);
    }
    }
    onClick(){
      this.cookieService.delete('userid');
      this.cookieService.delete('isadmin');
      this.cookieService.delete('username');
    }

  }



