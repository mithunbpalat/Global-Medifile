import { TestBed } from '@angular/core/testing';

import { MedifileService } from './medifile.service';

describe('MedifileService', () => {
  let service: MedifileService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MedifileService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
