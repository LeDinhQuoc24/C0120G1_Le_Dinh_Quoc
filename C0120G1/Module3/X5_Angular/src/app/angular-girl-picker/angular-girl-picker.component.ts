import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-angular-girl-picker',
  templateUrl: './angular-girl-picker.component.html',
  styleUrls: ['./angular-girl-picker.component.css']
})
export class AngularGirlPickerComponent implements OnInit {
  girlName = 'HuaLuuLiem';
  girlImage = 'assets/x1.png';
  constructor() { }
  updateName(name) {
    this.girlName = name;
  }
  updateImage(image) {
    this.girlImage = image;
  }
  onSelectChange(value) {
    this.girlImage = value;
  }

  ngOnInit() {
  }

}
