import { Component, OnInit,ViewChild } from '@angular/core';
import {Globals} from '../global';
import {LastService} from '../last.service';
import {Last} from '../last';
import {MatSort, MatTableDataSource,MatPaginator} from '@angular/material';
@Component({
  selector: 'app-last',
  templateUrl: './last.component.html',
  styleUrls: ['./last.component.css']
})
export class LastComponent implements OnInit {
  last:Last[];
  dataSource;
  displayedColumns: string[] = ['number','title','applications','view'];
  @ViewChild(MatSort, {static: true}) sort: MatSort;
  @ViewChild(MatPaginator, {static:true}) paginator: MatPaginator;
  constructor(private globals:Globals,private lastService:LastService) { 
    globals.headerText="Applications";
  }

  ngOnInit() {
    this.lastService.findAll().subscribe(data=>{
      this.last=data;
      this.dataSource =new MatTableDataSource(this.last);
      this.dataSource.sort = this.sort;
      this.dataSource.paginator = this.paginator;
    })
  }
     
  applyFilter(filterValue: string) {
    this.dataSource.filter = filterValue.trim().toLowerCase();

    if (this.dataSource.paginator) {
      this.dataSource.paginator.firstPage();
    }
  }

}
