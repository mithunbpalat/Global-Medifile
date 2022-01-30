import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HospitalpatientComponent } from './hospitalpatient.component';

describe('HospitalpatientComponent', () => {
  let component: HospitalpatientComponent;
  let fixture: ComponentFixture<HospitalpatientComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HospitalpatientComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HospitalpatientComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
