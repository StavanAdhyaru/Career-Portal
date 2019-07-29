import { Component, OnInit, ViewChild } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AppliedJob } from '../applied-job';
import { AppliedJobService } from '../applied-job.service';
import {MatSort, MatTableDataSource,MatPaginator} from '@angular/material';
import {Globals} from '../global'
import {CookieService} from 'ngx-cookie-service';
@Component({
  selector: 'app-applied-job-list',
  templateUrl: './applied-job-list.component.html',
  styleUrls: ['./applied-job-list.component.css']
})
export class AppliedJobListComponent implements OnInit {
  appliedJobs: AppliedJob[];
  displayedColumns: string[] = ['number','title','designation','postDate','view'];
  dataSource;
  id;
  @ViewChild(MatSort, {static: true}) sort: MatSort;
  @ViewChild(MatPaginator, {static:true}
    ) paginator: MatPaginator;
  constructor(private route: ActivatedRoute,private cookie:CookieService, private router: Router,private appliedJobService: AppliedJobService, private globals: Globals) { 
    globals.headerText="Applied jobs";
  }

  ngOnInit() {
    this.id=this.cookie.get('userid');
    this.appliedJobService.findById(this.id).subscribe(data =>{
    this.appliedJobs =data;this.dataSource =new MatTableDataSource(this.appliedJobs);
    this.dataSource.sort = this.sort;
  this.dataSource.paginator = this.paginator;
  });
  
  

  }
  applyFilter(filterValue: string) {
    this.dataSource.filter = filterValue.trim().toLowerCase();

    if (this.dataSource.paginator) {
      this.dataSource.paginator.firstPage();
    }
  }
}
