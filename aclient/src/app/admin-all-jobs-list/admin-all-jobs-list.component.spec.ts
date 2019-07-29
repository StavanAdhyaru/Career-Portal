import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminAllJobsListComponent } from './admin-all-jobs-list.component';

describe('AdminAllJobsListComponent', () => {
  let component: AdminAllJobsListComponent;
  let fixture: ComponentFixture<AdminAllJobsListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminAllJobsListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminAllJobsListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
