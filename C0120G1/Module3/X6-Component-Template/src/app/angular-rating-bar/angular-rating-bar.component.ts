import {Component, Input, OnChanges, OnInit} from '@angular/core';

@Component({
  selector: 'app-angular-rating-bar',
  templateUrl: './angular-rating-bar.component.html',
  styleUrls: ['./angular-rating-bar.component.css']
})
export class AngularRatingBarComponent implements OnInit {
  @Input() backgroundColor = '#d9d9d9';
  @Input() progressColor = 'red';
  constructor() { }

  ngOnInit() {
  }

}
