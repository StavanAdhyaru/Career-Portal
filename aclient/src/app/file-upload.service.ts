import { Injectable } from '@angular/core';
import { Globals} from './global';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { AngularWaitBarrier } from 'blocking-proxy/built/lib/angular_wait_barrier';
import {Observable} from 'rxjs';
import {CookieService} from 'ngx-cookie-service';
import {FileClass} from './file-class';
@Injectable()
export class FileUploadService {

  constructor(private global: Globals,private http:HttpClient,private cookie: CookieService) {
   }

  public save(fileclass:FileClass){
    return this.http.post<FileClass>("http://localhost:9090/u/upload/2",fileclass);
}
}
