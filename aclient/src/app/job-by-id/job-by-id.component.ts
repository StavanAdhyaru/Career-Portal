import { Component, OnInit } from '@angular/core';
import {CpJobListComponent} from '../cp-job-list/cp-job-list.component';
import {CpJob} from '../cp-job';
import {JobByIdService} from '../job-by-id.service';
import { ActivatedRoute, Router } from "@angular/router";
import {Globals} from '../global'
import {CpJobApplicationService} from '../cp-job-application.service';
import {CpJobApplication} from '../cp-job-application';
import { parse } from 'querystring';
import { CookieService} from 'ngx-cookie-service';

@Component({
  selector: 'app-job-by-id',
  templateUrl: './job-by-id.component.html',
  styleUrls: ['./job-by-id.component.css']
})
export class JobByIdComponent implements OnInit {
  cpJobs:CpJob;
  cpJobApplication:CpJobApplication;
  id;
  userid;
  constructor(private jobByIdService:JobByIdService,private cookie: CookieService, private route: ActivatedRoute, private globals: Globals,private cpJobApplicationService:CpJobApplicationService,private router: Router) { 
    globals.headerText="Job Details";
    this.cpJobApplication= new CpJobApplication();
  }

  ngOnInit() {
    this.id = this.route.snapshot.paramMap.get("id");

    this.jobByIdService.findById(this.id).subscribe(data=>{
      this.cpJobs=data;
    })
  }
  onSubmit() {
    this.cpJobApplication.jobid = this.cpJobs.id;
    this.userid=this.cookie.get('userid');
    this.cpJobApplication.userid = this.userid;
    this.cpJobApplicationService.save(this.cpJobApplication).subscribe(result => this.router.navigate(['/Main/jobDetail']));
  }

}
