import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TimeLifeComponent } from './time-life.component';

describe('TimeLifeComponent', () => {
  let component: TimeLifeComponent;
  let fixture: ComponentFixture<TimeLifeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TimeLifeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TimeLifeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
