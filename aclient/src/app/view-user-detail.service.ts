import { Injectable } from '@angular/core';
import { ViewUserDetail } from './view-user-detail';
import { Observable } from 'rxjs';
import { Globals} from './global';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ViewUserDetailService {
  constructor(private global: Globals, private http:HttpClient ) {}
  public findAll():Observable<ViewUserDetail[]>{
    return this.http.get<ViewUserDetail[]>(this.global.URL13);
  }
  public findById(userid:BigInteger):Observable<ViewUserDetail>{
    return this.http.get<ViewUserDetail>(this.global.URL14+userid);
  }
}
