import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ApplicationTable } from './application-table';
import {Globals} from './global';

@Injectable()
export class ApplicationTableService {
  private ApplicationTableUrl: string;
  constructor(private http:HttpClient,private global:Globals) {
    this.ApplicationTableUrl='http://localhost:9090/api5/at';
   }
   public findAll():Observable<ApplicationTable[]>{
    return this.http.get<ApplicationTable[]>(this.global.URL5);
  }
  public save(applicationTable : ApplicationTable){
    return this.http.post<ApplicationTable>(this.global.URL5, applicationTable);
  }
  public findById(jobid:BigInteger):Observable<any>{
    return this.http.get(this.global.URL5 +"/"+jobid);
  }
}
