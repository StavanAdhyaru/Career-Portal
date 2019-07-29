import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Last} from './last';
import {Globals} from './global';
@Injectable()
export class LastService {
  private lastUrl: string;
  constructor(private http:HttpClient,private global: Globals) {
   }
  public findAll():Observable<Last[]>{
    return this.http.get<Last[]>(this.global.URL6);
  }
  public save(cpUser : Last){
    return this.http.post<Last>(this.global.URL6, cpUser);
  }
}
