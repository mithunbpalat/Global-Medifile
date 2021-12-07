import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardhomeComponent } from './dashboardhome/dashboardhome.component';
import { AdminComponent } from './admin/admin.component';
import { AdminhospitalComponent } from './adminhospital/adminhospital.component';
import { AdminpatientComponent } from './adminpatient/adminpatient.component';
import { DoctorComponent } from './doctor/doctor.component';
import { HospitalComponent } from './hospital/hospital.component';
import { HospitalpasswordComponent } from './hospitalpassword/hospitalpassword.component';
import { HospitalpatientComponent } from './hospitalpatient/hospitalpatient.component';
import { RelativeComponent } from './relative/relative.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { MedifileService } from './medifile.service';

@NgModule({
  declarations: [
    AppComponent,
    DashboardhomeComponent,
    AdminComponent,
    AdminhospitalComponent,
    AdminpatientComponent,
    DoctorComponent,
    HospitalComponent,
    HospitalpasswordComponent,
    HospitalpatientComponent,
    RelativeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [MedifileService],
  bootstrap: [AppComponent]
})
export class AppModule { }
