import { Injectable } from '@angular/core';
import {CpUsers} from './CpUsers';
import {Observable} from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Globals} from './global';
@Injectable()
export class CpUsersService {
  private cpUsersUrl: string;
  constructor(private http:HttpClient,private global: Globals) {
    this.cpUsersUrl = 'http://localhost:9090/api/users';
   }
   public findAll():Observable<CpUsers[]>{
     return this.http.get<CpUsers[]>(this.global.URL);
   }
   public save(cpUser : CpUsers){
     return this.http.post<CpUsers>(this.global.URL, cpUser);
   }
   public findById(id:BigInteger):Observable<any>{
    return this.http.get(this.global.URL+"/"+id);
  }
  public update(id:BigInteger,cpUser: CpUsers):Observable<any>{
    return this.http.put<CpUsers>(this.cpUsersUrl+"/"+id,cpUser);
  }
}
