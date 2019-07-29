import { Component, OnInit,Inject } from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material';
@Component({
  selector: 'app-message',
  templateUrl: './message.component.html',
  styleUrls: ['./message.component.css']
})
export class MessageComponent implements OnInit {
  msg:string;
  constructor(@Inject(MAT_DIALOG_DATA) public data:any) {
    this.msg="";
   }

  ngOnInit() {
    this.msg=this.data.msg;
  }

}
