import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CpUserProfileListComponent } from './cp-user-profile-list.component';

describe('CpUserProfileListComponent', () => {
  let component: CpUserProfileListComponent;
  let fixture: ComponentFixture<CpUserProfileListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CpUserProfileListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CpUserProfileListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
