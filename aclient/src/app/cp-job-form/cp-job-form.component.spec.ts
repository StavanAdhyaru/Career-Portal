import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CpJobFormComponent } from './cp-job-form.component';

describe('CpJobFormComponent', () => {
  let component: CpJobFormComponent;
  let fixture: ComponentFixture<CpJobFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CpJobFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CpJobFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
