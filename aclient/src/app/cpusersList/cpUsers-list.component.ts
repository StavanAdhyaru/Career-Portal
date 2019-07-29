import { Component, OnInit, Output, Input, EventEmitter,ViewChild} from '@angular/core';
import {CpUsers} from '../CpUsers';
import {CpUsersService} from '../cpUsers.service';
import {CpUserProfile} from '../cp-user-profile';
import {CpUserProfileService} from '../cp-user-profile.service';
import { ActivatedRoute, Router } from '@angular/router';
import {MatSort, MatTableDataSource,MatPaginator} from '@angular/material';
import {Globals} from '../global';
import { ViewUserDetail} from '../view-user-detail';
import { ViewUserDetailService} from '../view-user-detail.service'

@Component({
  selector: 'app-CpUsers-list',
  templateUrl: './CpUsers-list.component.html',
  styleUrls: ['CpUsers-list.component.css']
})
export class CpUsersListComponent implements OnInit {
  [x: string]: any;
  cpUsers: CpUsers[];
  cpUserProfile : CpUserProfile[];
  displayedColumns: string[] = ['number','Name','Email','Mobile No.','Admin','Active','view'];
  dataSource;
  viewData:ViewUserDetail[];
  viewData1:ViewUserDetail;
  @ViewChild(MatSort, {static: true}) sort: MatSort;
  @ViewChild(MatPaginator, {static:true}) paginator: MatPaginator;
  constructor(private view:ViewUserDetailService,private cpUsersService: CpUsersService,private cpUserProfileService: CpUserProfileService,private globals:Globals) {
    globals.headerText="Users";
   }

  ngOnInit() {
    this.view.findAll().subscribe(data =>{
      this.viewData =data;
      this.dataSource =new MatTableDataSource(this.viewData);
      this.dataSource.paginator = this.paginator;
      
    });
  }
  onSlide(){

  }
  applyFilter(filterValue: string) {
    this.dataSource.filter = filterValue.trim().toLowerCase();

    if (this.dataSource.paginator) {
      this.dataSource.paginator.firstPage();
    }
  }
  isactive(id:BigInteger){
      this.view.findById(id).subscribe(data=>{
        this.viewData1=data;
      })
  }
}
  


