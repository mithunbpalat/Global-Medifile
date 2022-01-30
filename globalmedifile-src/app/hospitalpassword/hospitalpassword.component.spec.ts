import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HospitalpasswordComponent } from './hospitalpassword.component';

describe('HospitalpasswordComponent', () => {
  let component: HospitalpasswordComponent;
  let fixture: ComponentFixture<HospitalpasswordComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HospitalpasswordComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HospitalpasswordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
