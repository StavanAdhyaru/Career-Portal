import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import {FileUploader} from 'ng2-file-upload';
@Component({
  selector: 'app-file-upload',
  templateUrl: './file-upload.component.html',
  styleUrls: ['./file-upload.component.css']
})
export class FileUploadComponent implements OnInit {
  @ViewChild('fileInput',{static: true}) fileInput: ElementRef;
  uploader: FileUploader;
  isDropOver: boolean;
  constructor() { }

 
 
  ngOnInit(): void {
    const headers = [{name: 'Accept', value: 'application/json'}];
    this.uploader = new FileUploader({url: 'http://localhost:9090/api11/upload', autoUpload: true });
 
    this.uploader.onCompleteAll = () => alert('File uploaded');
  }
 
  fileOverAnother(e: any): void {
    this.isDropOver = e;
  }
 
  fileClicked() {
    this.fileInput.nativeElement.click();
  }

}
