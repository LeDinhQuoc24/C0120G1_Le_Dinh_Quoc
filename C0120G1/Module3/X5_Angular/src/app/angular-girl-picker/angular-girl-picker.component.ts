import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-angular-girl-picker',
  templateUrl: './angular-girl-picker.component.html',
  styleUrls: ['./angular-girl-picker.component.css']
})
export class AngularGirlPickerComponent implements OnInit {
  girlName = 'Hứa Lưu Liễm';
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
    switch (value) {
      case 'assets/x1.png':
        this.girlName = 'Hứa Lưu Liễm';
        break;
      case 'assets/x2.png':
        this.girlName = 'Hạ Vi Lương';
        break;
      case 'assets/x3.png':
        this.girlName = 'Diệp Hoàng Trúc Mai';
        break;
      case 'assets/x4.png':
        this.girlName = 'Văn Nhân Mục Nguyệt';
        break;
    }

  }
  ngOnInit() {
  }

}
