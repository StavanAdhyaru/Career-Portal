import { Component, OnInit, ViewChild } from '@angular/core';
import { ApplicationTableService} from '../application-table.service';
import {Globals} from '../global';
import { ApplicationTable } from '../application-table';
import {MatSort, MatTableDataSource,MatPaginator} from '@angular/material';
import { ActivatedRoute } from "@angular/router";
import {CpJob} from '../cp-job';
import {CpJobService} from '../cp-job.service';
@Component({
  selector: 'app-application-table',
  templateUrl: './application-table.component.html',
  styleUrls: ['./application-table.component.css']
})
export class ApplicationTableComponent implements OnInit {
  applicationTable:ApplicationTable[];
  dataSource;
  jobid;
  id;
  cpJob:CpJob;
  displayedColumns: string[] = ['number','name','email','mobile','dob','linkdinurl','appliedDate','download'];
  @ViewChild(MatPaginator, {static:true}
    ) paginator: MatPaginator;
  constructor(private globals: Globals,private applicationTableService:ApplicationTableService,private route:ActivatedRoute,private cpJobService: CpJobService) {
    
    this.globals.headerText= "Appliaction Detais";
   }

  ngOnInit() {
    this.jobid = this.route.snapshot.paramMap.get("jobid");
    this.id=this.route.snapshot.paramMap.get("jobid");
    this.applicationTableService.findById(this.jobid).subscribe(data=>{
      this.applicationTable=data;
      this.dataSource =new MatTableDataSource(this.applicationTable);
      this.dataSource.paginator = this.paginator;
  })
  this.cpJobService.findById(this.id).subscribe(data=>{
    this.cpJob=data;
  })
  
}

applyFilter(filterValue: string) {
  this.dataSource.filter = filterValue.trim().toLowerCase();

  if (this.dataSource.paginator) {
    this.dataSource.paginator.firstPage();
  }
}
}