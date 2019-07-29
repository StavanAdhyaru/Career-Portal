import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MyJobDetailComponent } from './my-job-detail.component';

describe('MyJobDetailComponent', () => {
  let component: MyJobDetailComponent;
  let fixture: ComponentFixture<MyJobDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MyJobDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MyJobDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
