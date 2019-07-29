import { Component, OnInit } from '@angular/core';
import {Globals} from '../global';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private globals:Globals) {
    this.globals.headerText="Home";
   }

  ngOnInit() {
  }

}
