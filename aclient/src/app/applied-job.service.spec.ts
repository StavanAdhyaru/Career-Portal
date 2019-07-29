import { TestBed } from '@angular/core/testing';

import { AppliedJobService } from './applied-job.service';

describe('AppliedJobService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AppliedJobService = TestBed.get(AppliedJobService);
    expect(service).toBeTruthy();
  });
});
