import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CpUserProfileService } from '../cp-user-profile.service';
import { CpUserProfile } from '../cp-user-profile';

@Component({
  selector: 'app-cp-user-profile-form',
  templateUrl: './cp-user-profile-form.component.html',
  styleUrls: ['./cp-user-profile-form.component.css']
})
export class CpUserProfileFormComponent  {
  cpUserProfile:CpUserProfile;
  constructor(private route: ActivatedRoute, private router: Router, private cpUserProfileService:CpUserProfileService) { 
    this.cpUserProfile= new CpUserProfile();
  }

  onSubmit() {
    this.cpUserProfileService.save(this.cpUserProfile).subscribe(result => this. gotoCpUserProfileList());
  }
  gotoCpUserProfileList() {
    this.router.navigate(['/profileDetail']);
  }

}
