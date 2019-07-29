import { Component, OnInit } from '@angular/core';
import {Globals} from '../global';
import { CpJob} from '../cp-job';
import { CpJobService} from '../cp-job.service';
import { ActivatedRoute ,Router} from "@angular/router";
@Component({
  selector: 'app-admin-job-detail',
  templateUrl: './admin-job-detail.component.html',
  styleUrls: ['./admin-job-detail.component.css']
})
export class AdminJobDetailComponent implements OnInit {
  cpJob:CpJob;
  id;
  constructor(private globals:Globals,private cpJobService:CpJobService, private route: ActivatedRoute,private router: Router) {
    globals.headerText="Job Detail";
   }

  ngOnInit() {
    this.id = this.route.snapshot.paramMap.get("id");
    this.cpJobService.findById(this.id).subscribe(data=>{
      this.cpJob=data;
    })
  }
  onSubmit(id:BigInteger) {
    this.cpJobService.update(id,this.cpJob).subscribe(result => this.router.navigate(['/Main/allAdminJobs']));
  }

}
