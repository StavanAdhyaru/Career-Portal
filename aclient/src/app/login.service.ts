import { Injectable } from '@angular/core';
import { CpUsers } from './CpUsers';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Globals} from './global';
@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private loginUrl : string;
  constructor(private http:HttpClient,private global: Globals) {
   }
   public save(cpUser : CpUsers){
    return this.http.post<CpUsers>(this.global.URL9, cpUser);
  }

}
