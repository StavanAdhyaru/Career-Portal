import { Injectable } from '@angular/core';
import {CpUserProfile} from './cp-user-profile'
import {Observable} from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Globals} from './global';
@Injectable()
export class CpUserProfileService {
  private cpUserProfileUrl: string;
  constructor(private http:HttpClient,private global:Globals ) {
   }
   public findAll():Observable<CpUserProfile[]>{
    return this.http.get<CpUserProfile[]>(this.global.URL1);
  }
  public save(cpUserProfile : CpUserProfile){
    return this.http.post<CpUserProfile>(this.global.URL1, cpUserProfile);
  }
  public findById(userid:BigInteger):Observable<CpUserProfile>{
    return this.http.get<CpUserProfile>(this.global.URL1+"/"+userid);
  }

  public update(id:BigInteger,cpUserProfile: CpUserProfile):Observable<any>{
    return this.http.put<CpUserProfile>(this.global.URL1+"/"+id,cpUserProfile);
  }
}
