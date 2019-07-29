import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CpUsersListComponent } from './cpUsers-list.component';

describe('EmployeeListComponent', () => {
  let component: CpUsersListComponent;
  let fixture: ComponentFixture<CpUsersListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CpUsersListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CpUsersListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
