import { Component } from '@angular/core';
import { HostListener} from '@angular/core';
import {Globals }from './global';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  wHeight:number;
  constructor(private global: Globals){
  this.onResize();
  }
  @HostListener('window.resize',['$event'])
  onResize(event?){
    this.wHeight = window.innerHeight;
    this.global.wHeight=this.wHeight;
  }
}
