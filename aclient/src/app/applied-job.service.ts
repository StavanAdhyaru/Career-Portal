import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { AppliedJob } from './applied-job';
import {Globals} from './global';
@Injectable()
export class AppliedJobService {

  private AppliedJobUrl: string;
  constructor(private http:HttpClient, private global: Globals) {}
  public findAll():Observable<AppliedJob[]>{
    return this.http.get<AppliedJob[]>(this.global.URL4);
  }
  public save(appliedJob : AppliedJob){
    return this.http.post<AppliedJob>(this.global.URL4, appliedJob);
  }
  public findById(userid:BigInteger):Observable<any>{
    return this.http.get(this.global.URL4+"/"+userid);
  }
}
