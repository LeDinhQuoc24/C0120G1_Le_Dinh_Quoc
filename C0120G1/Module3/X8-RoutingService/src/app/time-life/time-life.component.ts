import { Component, OnInit } from '@angular/core';
import {DateUtilService} from "../date-util.service";


@Component({
  selector: 'app-time-life',
  templateUrl: './time-life.component.html',
  styleUrls: ['./time-life.component.css']
})
export class TimeLifeComponent implements OnInit {

  output = '';
  constructor(private dateUtilService: DateUtilService) { }

  ngOnInit() {
  }

  onChange(value) {
    this.output = this.dateUtilService.getDiffToNow(value);
  }

}
