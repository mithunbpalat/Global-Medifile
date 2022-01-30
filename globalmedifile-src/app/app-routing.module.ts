import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { AdminhospitalComponent } from './adminhospital/adminhospital.component';
import { AdminpatientComponent } from './adminpatient/adminpatient.component';
import { DashboardhomeComponent } from './dashboardhome/dashboardhome.component';
import { DoctorComponent } from './doctor/doctor.component';
import { HospitalComponent } from './hospital/hospital.component';
import { HospitalpasswordComponent } from './hospitalpassword/hospitalpassword.component';
import { HospitalpatientComponent } from './hospitalpatient/hospitalpatient.component';
import { RelativeComponent } from './relative/relative.component';

const routes: Routes = [
  {path:"",redirectTo:"home",pathMatch:"full"},
  {path:"home",component:DashboardhomeComponent},
  {path:"admin",component:AdminComponent},
  {path:"adminpatient",component:AdminpatientComponent},
  {path:"adminhospital",component:AdminhospitalComponent},
  {path:"hospital",component:HospitalComponent},
  {path:"hospitalpassword",component:HospitalpasswordComponent},
  {path:"hospitalpatient",component:HospitalpatientComponent},
  {path:"doctor",component:DoctorComponent},
  {path:"relative",component:RelativeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
