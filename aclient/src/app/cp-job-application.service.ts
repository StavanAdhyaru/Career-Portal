import { Injectable } from '@angular/core';
import { CpJobApplication} from './cp-job-application';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Globals} from './global';
import { Observable } from 'rxjs';
@Injectable()
export class CpJobApplicationService {
  cpJobApplication: CpJobApplication;
  cpJobApplicationUrl: string;
  constructor(private http:HttpClient, private global:Globals) { }
   
  public save(cpJobApplication : CpJobApplication){
    return this.http.post<CpJobApplication>(this.global.URL7, cpJobApplication);
  }
  public update(id:BigInteger,cpJobApplication: CpJobApplication):Observable<any>{
    return this.http.put<CpJobApplication>(this.global.URL7+"/"+id,cpJobApplication);
  }
}
