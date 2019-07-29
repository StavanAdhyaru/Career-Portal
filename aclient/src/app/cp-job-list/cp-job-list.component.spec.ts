import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CpJobListComponent } from './cp-job-list.component';

describe('CpJobListComponent', () => {
  let component: CpJobListComponent;
  let fixture: ComponentFixture<CpJobListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CpJobListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CpJobListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
