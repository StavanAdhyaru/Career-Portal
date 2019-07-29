import { Injectable } from '@angular/core';
import { CpDocument} from './cp-document';
import {Observable, from} from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Globals} from './global';
@Injectable()
export class CpDocumentService {
  private cpDocumentUrl: string;
  constructor(private http:HttpClient,private global:Globals) {
   }
  public findAll():Observable<CpDocument[]>{
    return this.http.get<CpDocument[]>(this.global.URL3);
  }
  public save(cpDocument : CpDocument){
    return this.http.post<CpDocument>(this.global.URL3, cpDocument);
  }
  public findById(userid:BigInteger):Observable<CpDocument>{
    return this.http.get<CpDocument>(this.global.URL3+"/"+userid);
  }

}

