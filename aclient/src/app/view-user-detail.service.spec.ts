import { TestBed } from '@angular/core/testing';

import { ViewUserDetailService } from './view-user-detail.service';

describe('ViewUserDetaiService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ViewUserDetailService = TestBed.get(ViewUserDetailService);
    expect(service).toBeTruthy();
  });
});
