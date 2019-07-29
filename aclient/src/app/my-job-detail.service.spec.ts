import { TestBed } from '@angular/core/testing';

import { MyJobDetailService } from './my-job-detail.service';

describe('MyJobDetailService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: MyJobDetailService = TestBed.get(MyJobDetailService);
    expect(service).toBeTruthy();
  });
});
