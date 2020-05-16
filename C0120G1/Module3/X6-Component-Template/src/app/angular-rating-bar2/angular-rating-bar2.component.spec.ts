import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularRatingBar2Component } from './angular-rating-bar2.component';

describe('AngularRatingBar2Component', () => {
  let component: AngularRatingBar2Component;
  let fixture: ComponentFixture<AngularRatingBar2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularRatingBar2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularRatingBar2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
