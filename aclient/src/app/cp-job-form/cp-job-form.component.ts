import { Component } from '@angular/core';
import { CpJob } from '../cp-job';
import { ActivatedRoute, Router } from '@angular/router';
import { CpJobService } from '../cp-job.service';
import {Globals} from '../global';
import {CookieService} from 'ngx-cookie-service';
@Component({
  selector: 'app-cp-job-form',
  templateUrl: './cp-job-form.component.html',
  styleUrls: ['./cp-job-form.component.css']
})
export class CpJobFormComponent  {

  cpJob: CpJob;
  id;
  constructor(private route: ActivatedRoute,private cookie:CookieService ,private router: Router, private cpJobService: CpJobService,private globals:Globals) {
    this.cpJob= new CpJob();
    this.id=this.cookie.get('userid');
    this.cpJob.create_uid=this.id;
    globals.headerText="Add Job";
   }
  onSubmit() {
    this.cpJobService.save(this.cpJob).subscribe(result => this. gotoCpUsersList());
  }
  gotoCpUsersList() {
    this.router.navigate(['/Main/allAdminJobs']);
  }

}
