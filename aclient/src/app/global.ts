import { Injectable } from '@angular/core';
import { CpUsers } from './CpUsers';
@Injectable()
export class Globals {
  headerText: String = "";
  URL: string="http://localhost:8080/CPService.svc/api/users";
  URL1: string = "http://localhost:8080/CPService.svc/api1/userProfile"
  URL2: string="http://localhost:8080/CPService.svc/api2/jobs";
  URL3:string="http://localhost:8080/CPService.svc/api3/documents";
  URL4:string="http://localhost:8080/CPService.svc/api4/jid";
  URL5:string="http://localhost:8080/CPService.svc/api5/at";
  URL6:string="http://localhost:8080/CPService.svc/api6/la";
  URL7:string="http://localhost:8080/CPService.svc/api7/jobApplications";
  URL8:string="http://localhost:8080/CPService.svc/api9/addUser";
  URL9:string="http://localhost:8080/CPService.svc/api9/login";
  URL10:string="http://localhost:8080/CPService.svc/upload";
  URL12:string="http://localhost:8080/CPService.svc/api9/addAdmin";
  URL13:string="http://localhost:8080/CPService.svc/viewUsers/detailUsers";
  URL14:string="http://localhost:8080/CPService.svc/viewUsers/activeId/";
  URL15:string="http://localhost:8080/CPService.svc/u/upload/";
  cpUser: CpUsers;
  wHeight:number;
}