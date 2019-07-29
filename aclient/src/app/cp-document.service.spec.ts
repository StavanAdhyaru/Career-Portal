import { TestBed } from '@angular/core/testing';

import { CpDocumentService } from './cp-document.service';

describe('CpDocumentService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CpDocumentService = TestBed.get(CpDocumentService);
    expect(service).toBeTruthy();
  });
});
