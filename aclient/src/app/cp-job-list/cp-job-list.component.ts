import { Component, OnInit, EventEmitter, ViewChild } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CpJob } from '../cp-job';
import {CpJobService} from '../cp-job.service';
import {JobByIdService} from '../job-by-id.service';
import { MatSort } from '@angular/material/sort';
import {MatTableDataSource} from '@angular/material/table';
import { MatPaginator } from '@angular/material';
import {Globals} from '../global'
import { DatePipe } from '@angular/common';
import { FormGroup, FormControl } from '@angular/forms';
import { Subscriber } from 'rxjs';
@Component({
  selector: 'app-cp-job-list',
  templateUrl: './cp-job-list.component.html',
  styleUrls: ['./cp-job-list.component.css']
})
export class CpJobListComponent implements OnInit {
  cpJobs: CpJob[];
  cpJob: CpJob[];
  id: CpJob["id"];
  pipe: DatePipe;
  filterForm = new FormGroup({
    fromDate: new FormControl(),
    toDate: new FormControl(),
});
get fromDate() { return this.filterForm.get('fromDate'); }
get toDate() { return this.filterForm.get('toDate'); }

  displayedColumns: string[] = ['number','title','designation','postDate','Action'];
  datasource;  
  @ViewChild(MatSort, {static: true}) sort: MatSort;
  @ViewChild (MatPaginator, {static:true}) paginator: MatPaginator;
   constructor(private route: ActivatedRoute, private router: Router,private cpJobService: CpJobService,private jobByIdService: JobByIdService, private globals: Globals) {
     globals.headerText="Jobs";
   
    }
  
   ngOnInit() {
     this.cpJobService.findAll().subscribe(data =>{
       this.cpJobs =data; console.log(data); this.datasource= new MatTableDataSource(this.cpJobs);
       this.datasource.sort = this.sort;
       this.datasource.paginator = this.paginator;
});
      
    
  }
  onSubmit(){
    this.pipe = new DatePipe('en');
    console.log(this.datasource.filterPredicate);
       
    const defaultPredicate=this.datasource.filterPredicate;
    this.datasource.filterPredicate = (data, filter) =>{
      const formatted=this.pipe.transform(data.created,'MM/dd/yyyy');
      return formatted.indexOf(filter) >= 0 || defaultPredicate(data,filter) ;
}
  }
  getDateRange(value) {
    // getting date from calendar
    const fromDate = value.fromDate
    const toDate = value.toDate
    console.log(fromDate, toDate);
    this.onSubmit();
  }
  
  applyFilter(filterValue: string) {
    this.datasource.filter = filterValue.trim().toLowerCase();

  }
   /*private find(id:BigInteger){
     this.jobByIdService.findById(id).subscribe(data =>{
        this.cpJob =data;
     this.router.navigate(['/jobId'])} )
   
     
   }*/
}
//,