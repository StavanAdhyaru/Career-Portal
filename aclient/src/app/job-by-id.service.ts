import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {CpJob} from './cp-job';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Globals} from './global';
@Injectable({
  providedIn: 'root'
})
export class JobByIdService {
  jobByIdUrl  : string;
  constructor(private http:HttpClient,private global:Globals) {
   }
  public findById(id:BigInteger):Observable<CpJob>{
    return this.http.get<CpJob>(this.global.URL2+"/"+id);
  }
}
