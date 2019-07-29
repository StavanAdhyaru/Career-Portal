import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CpUsersFormComponent } from './cpUsers-form.component';

describe('EmployeeFormComponent', () => {
  let component: CpUsersFormComponent;
  let fixture: ComponentFixture<CpUsersFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CpUsersFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CpUsersFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
