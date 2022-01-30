import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminhospitalComponent } from './adminhospital.component';

describe('AdminhospitalComponent', () => {
  let component: AdminhospitalComponent;
  let fixture: ComponentFixture<AdminhospitalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminhospitalComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminhospitalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
