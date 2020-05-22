import { Component, OnInit, ViewEncapsulation, ContentChildren, QueryList, AfterContentInit } from '@angular/core';
import { ImgSlideComponent } from './img-slide/img-slide.component';

@Component({
  selector: 'app-img-slider',
  templateUrl: './img-slider.component.html',
  styleUrls: ['./img-slider.component.scss'],
  encapsulation: ViewEncapsulation.None
})
export class ImgSliderComponent implements OnInit, AfterContentInit {
  @ContentChildren(ImgSlideComponent) slides: QueryList<ImgSlideComponent>;
  abc;
  activeIndex = 0;
  constructor() { }

  ngOnInit() {
  }

  ngAfterContentInit() {
    console.log(this.slides);
    this.abc = this.slides.first;
  }

  previous() {
    if (this.activeIndex > 0) {
      this.activeIndex--;
    }
    this.abc = this.slides.toArray()[this.activeIndex];
  }
  next() {
    if (this.activeIndex < this.slides.length - 1) {
      this.activeIndex++;
    }
    this.abc = this.slides.toArray()[this.activeIndex];
  }

}
