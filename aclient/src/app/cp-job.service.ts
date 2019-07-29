import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {CpJob} from './cp-job';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Globals} from './global';
@Injectable()
export class CpJobService {
 private cpJobUrl: string;
  constructor(private http:HttpClient,private global:Globals) { 
    this.cpJobUrl= 'http://localhost:9090/api2/jobs';
  }
  public findAll():Observable<CpJob[]>{
    return this.http.get<CpJob[]>(this.global.URL2);
  }
  public save(cpJob : CpJob){
    return this.http.post<CpJob>(this.global.URL2, cpJob);
  }
  public findById(id:BigInteger):Observable<any>{
    return this.http.get(this.global.URL2+"/"+id);
  }
  public update(id:BigInteger,cpJob: CpJob):Observable<any>{
    return this.http.put<CpJob>(this.global.URL2+"/"+id,cpJob) ;
  }
}
