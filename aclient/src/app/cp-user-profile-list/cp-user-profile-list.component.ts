import { Component, OnInit } from '@angular/core';
import {CpUserProfile} from '../cp-user-profile';
import { ActivatedRoute, Router } from '@angular/router';
import {CpUserProfileService} from '../cp-user-profile.service';
import {Globals} from '../global';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { MatDatepicker } from '@angular/material';
import {FileUploadService} from '../file-upload.service';
import {FileClass} from '../file-class';
import {FormBuilder, FormGroup,} from '@angular/forms';
import {CookieService} from 'ngx-cookie-service';
import {MessageService} from '../services/message.service';
@Component({
  selector: 'app-cp-user-profile-list',
  templateUrl: './cp-user-profile-list.component.html',
  styleUrls: ['./cp-user-profile-list.component.css']
})
export class CpUserProfileListComponent implements OnInit {
  cpUserProfiles: CpUserProfile;
  id;
  fileClass:FileClass;
  fileToUpload : File = null;
  url:string;
  constructor(private cookie: CookieService,private msgService: MessageService,private formBuilder:FormBuilder,private http:HttpClient,private cpUserProfileService: CpUserProfileService,private globals: Globals,private route: ActivatedRoute, private router: Router,private fileService:FileUploadService) {
    globals.headerText="User info";
    this.fileClass = new FileClass();
   }

  ngOnInit() {
    this.id = this.route.snapshot.paramMap.get("id");
    this.cpUserProfileService.findById(this.id).subscribe(data =>{
      this.cpUserProfiles = data;
    });
  }
  onSubmit(id:BigInteger) {
    this.cpUserProfileService.update(id,this.cpUserProfiles).subscribe(result => this.router.navigate(['/Main/home']));
    this.msgService.showMsg("saved");
  }
  handleFileInput(file:File){
    this.fileToUpload=file[0];
    
  }
  onUpload(){
    var formData: FormData = new FormData();
    formData.append("file",this.fileToUpload);
    var headers = new HttpHeaders();
    headers.append('Content-Type', 'application/multipart/form-data');
    // headers.append("content","formData");
  
    this.http.post(this.globals.URL15+"/"+this.cookie.get('userid'),formData,{ headers: headers }).subscribe(data => this.msgService.showMsg("File Upload Successfully"));
      
  }
}