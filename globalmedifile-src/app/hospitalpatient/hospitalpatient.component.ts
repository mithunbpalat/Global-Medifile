import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Patient } from '../gpatient';
import { Hospital } from '../ghospital';
import { Search } from '../gsearch';
import { MedifileService } from '../medifile.service';

@Component({
  selector: 'app-hospitalpatient',
  templateUrl: './hospitalpatient.component.html',
  styleUrls: ['./hospitalpatient.component.css']
})
export class HospitalpatientComponent implements OnInit {

  patient :any=new Patient(0,0,"","","","","","","","");
  search :any=new Search(0);
  patients:any;
  respo: any;
  hospital :any=new Hospital(0,0,"","","");
  
  constructor(private service:MedifileService,private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe(data=>{
      let respo=data.get('tech');
    })
    let response=this.service.getHospitalById(this.respo);
    response.subscribe((data)=>this.hospital=data);
  
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
