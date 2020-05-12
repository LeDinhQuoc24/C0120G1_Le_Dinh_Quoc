import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularGirlPickerComponent } from './angular-girl-picker.component';

describe('AngularGirlPickerComponent', () => {
  let component: AngularGirlPickerComponent;
  let fixture: ComponentFixture<AngularGirlPickerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularGirlPickerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularGirlPickerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
