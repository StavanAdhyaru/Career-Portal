import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CpDocumentListComponent } from './cp-document-list.component';

describe('CpDocumentListComponent', () => {
  let component: CpDocumentListComponent;
  let fixture: ComponentFixture<CpDocumentListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CpDocumentListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CpDocumentListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
