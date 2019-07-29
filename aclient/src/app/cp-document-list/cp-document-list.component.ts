import { Component, OnInit } from '@angular/core';
import { CpDocumentService } from '../cp-document.service';
import { CpDocument } from '../cp-document';
import {Globals} from '../global'
@Component({
  selector: 'app-cp-document-list',
  templateUrl: './cp-document-list.component.html',
  styleUrls: ['./cp-document-list.component.css']
})
export class CpDocumentListComponent implements OnInit {
  cpDocuments: CpDocument[];
  constructor( private cpDocumentService: CpDocumentService) { }

  ngOnInit() {
    this.cpDocumentService.findAll().subscribe(data =>{
      this.cpDocuments =data;
    });
  }

}
