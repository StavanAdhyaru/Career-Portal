import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CpUserProfileFormComponent } from './cp-user-profile-form.component';

describe('CpUserProfileFormComponent', () => {
  let component: CpUserProfileFormComponent;
  let fixture: ComponentFixture<CpUserProfileFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CpUserProfileFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CpUserProfileFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
