import { TestBed } from '@angular/core/testing';

import { ApplicationTableService } from './application-table.service';

describe('AppliationTableService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ApplicationTableService = TestBed.get(ApplicationTableService);
    expect(service).toBeTruthy();
  });
});
