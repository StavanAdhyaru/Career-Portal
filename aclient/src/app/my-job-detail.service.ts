import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { AppliedJob } from './applied-job';
import {Globals} from './global';
@Injectable({
  providedIn: 'root'
})
export class MyJobDetailService {
  AppliedJobUrl  : string;
  constructor(private http:HttpClient,private global: Globals) {
   }
  public findById(userid:BigInteger,jobid:BigInteger):Observable<AppliedJob>{
    return this.http.get<AppliedJob>(this.global.URL4+"/"+userid+"/"+jobid);
  }
}
