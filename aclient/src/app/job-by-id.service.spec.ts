import { TestBed } from '@angular/core/testing';

import { JobByIdService } from './job-by-id.service';

describe('JobByIdService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: JobByIdService = TestBed.get(JobByIdService);
    expect(service).toBeTruthy();
  });
});
