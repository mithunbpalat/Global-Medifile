import { Component, OnInit } from '@angular/core';
import { Patient } from '../gpatient';
import { Search } from '../gsearch';
import { MedifileService } from '../medifile.service';

@Component({
  selector: 'app-adminpatient',
  templateUrl: './adminpatient.component.html',
  styleUrls: ['./adminpatient.component.css']
})
export class AdminpatientComponent implements OnInit {

  patient :any=new Patient(0,0,"","","","","","","","");
  search :any=new Search(0);
  patients:any;
  constructor(private service:MedifileService) { }

  ngOnInit(): void {
    let resp=this.service.getPatients();
    resp.subscribe((data)=>this.patients=data);
  }

  public patientNow(){
    let resp = this.service.postPatient(this.patient);
    resp.subscribe((data)=>this.patients=data);
  }
  public updatePatientNow(){
    let resp = this.service.updatePatient(this.patient);
    resp.subscribe((data)=>this.patients=data);
  }
  public delPatient(gin:number){
    let resp=this.service.deletePatient(gin);
    resp.subscribe((data)=>this.patients=data);
  }
  public searchById(a:number){
    let resp=this.service.getPatientById(a);
    resp.subscribe((data)=>this.patient=data);
  }
}
