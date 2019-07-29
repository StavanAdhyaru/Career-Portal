import { Injectable } from '@angular/core';
import {MessageComponent} from '../dialog/message/message.component';
import {MatDialog} from '@angular/material';
@Injectable({
  providedIn: 'root'
})
export class MessageService {

  constructor(public matDialog:MatDialog) { }
  showMsg(msg){
    const dialogRef = this.matDialog.open(MessageComponent,{
      data:{
        msg:msg
      }
    })
  }
}
