import { Injectable } from '@angular/core';
import { AddUser} from './add-user';
import { HttpClient } from '@angular/common/http';
import {Globals} from './global';
@Injectable({
  providedIn: 'root'
})
export class AddUserService {
  addUserUrl:string;
  constructor(private http:HttpClient,private global:Globals) {
   }
  public save(addUser : AddUser){
    return this.http.post<AddUser>(this.global.URL8, addUser);
  }
  public saveAdmin(addUser:AddUser){
    return this.http.post<AddUser>(this.global.URL12,addUser);
  }
}
