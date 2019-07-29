import { TestBed } from '@angular/core/testing';

import { CpJobService } from './cp-job.service';

describe('CpJobService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CpJobService = TestBed.get(CpJobService);
    expect(service).toBeTruthy();
  });
});
