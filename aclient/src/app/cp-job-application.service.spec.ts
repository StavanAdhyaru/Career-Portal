import { TestBed } from '@angular/core/testing';

import { CpJobApplicationService } from './cp-job-application.service';

describe('CpJobApplicationService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CpJobApplicationService = TestBed.get(CpJobApplicationService);
    expect(service).toBeTruthy();
  });
});
