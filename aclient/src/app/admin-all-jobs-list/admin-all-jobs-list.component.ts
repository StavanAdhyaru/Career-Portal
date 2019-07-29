import { Component, OnInit, ViewChild } from '@angular/core';
import {CpJob} from '../cp-job';
import {CpJobService} from '../cp-job.service';
import { MatSort } from '@angular/material/sort';
import {MatTableDataSource} from '@angular/material/table';
import { MatPaginator } from '@angular/material';
import {Globals} from '../global';
@Component({
  selector: 'app-admin-all-jobs-list',
  templateUrl: './admin-all-jobs-list.component.html',
  styleUrls: ['./admin-all-jobs-list.component.css']
})
export class AdminAllJobsListComponent implements OnInit {
  cpJob:CpJob[];
  datasource;
  displayedColumns: string[] = ['number','title','designation','postDate','view'];
  @ViewChild(MatSort, {static: true}) sort: MatSort;
  @ViewChild (MatPaginator, {static:true}) paginator: MatPaginator;
  constructor(private cpJobService:CpJobService,private globals: Globals) {
    globals.headerText="Jobs";
   }

  ngOnInit() {
    this.cpJobService.findAll().subscribe(data=>{
      this.cpJob=data;
      this.datasource= new MatTableDataSource(this.cpJob);
      this.datasource.paginator = this.paginator;
    })
  }
  applyFilter(filterValue: string) {
    this.datasource.filter = filterValue.trim().toLowerCase();

    if (this.datasource.paginator) {
      this.datasource.paginator.firstPage();
    }
  }

}
