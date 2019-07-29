import { TestBed } from '@angular/core/testing';

import { CpUsersService } from './cpUsers.service';

describe('EmployeeService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CpUsersService = TestBed.get(CpUsersService);
    expect(service).toBeTruthy();
  });
});
