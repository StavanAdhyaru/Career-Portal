import { TestBed } from '@angular/core/testing';

import { CpUserProfileService } from './cp-user-profile.service';

describe('CpUserProfileService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CpUserProfileService = TestBed.get(CpUserProfileService);
    expect(service).toBeTruthy();
  });
});
