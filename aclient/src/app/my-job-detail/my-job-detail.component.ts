import { Component, OnInit } from '@angular/core';
import {Globals} from '../global';
import { ActivatedRoute } from "@angular/router";
import { MyJobDetailService} from '../my-job-detail.service';
import { AppliedJob} from '../applied-job';
 import  {CookieService} from 'ngx-cookie-service';
import { CpJobApplicationService } from '../cp-job-application.service';
import { MessageService } from '../services/message.service';
@Component({
  selector: 'app-my-job-detail',
  templateUrl: './my-job-detail.component.html',
  styleUrls: ['./my-job-detail.component.css']
})
export class MyJobDetailComponent implements OnInit {
  appliedJob : AppliedJob;
  userid;
  jobid;
  constructor(private msgService: MessageService,private cookie:CookieService,private globals: Globals, private route: ActivatedRoute,private myJobDetailService: MyJobDetailService,private cpJobApplicationService:CpJobApplicationService) { 
    globals.headerText="Applied Job"
  }

  ngOnInit() {
    this.userid = this.cookie.get('userid');
    this.jobid = this.route.snapshot.paramMap.get("jobid");
    this.myJobDetailService.findById(this.userid,this.jobid).subscribe(data=>{
      this.appliedJob=data;});
     }
     onSubmit() {
      this.cpJobApplicationService.update(this.appliedJob.id,this.appliedJob).subscribe(result => {
        this.msgPrint()
      })
    }
    msgPrint(){
      this.msgService.showMsg("New cover-later Saved");
    }

}
