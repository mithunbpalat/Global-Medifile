import { Component, OnInit } from '@angular/core';
import { Doctor } from '../gdoctor';
import { Search } from '../gsearch';
import { MedifileService } from '../medifile.service';

@Component({
  selector: 'app-doctor',
  templateUrl: './doctor.component.html',
  styleUrls: ['./doctor.component.css']
})
export class DoctorComponent implements OnInit {

  doctor :any=new Doctor(0,0,"","","","","");
  search :any=new Search(0);
  doctors:any;
  constructor(private service:MedifileService) { }

  ngOnInit(): void {
    let resp=this.service.getDoctors();
    resp.subscribe((data)=>this.doctors=data);
  }

  public doctorNow(){
    let resp = this.service.postDoctor(this.doctor);
    resp.subscribe((data)=>this.doctors=data);
  }
  public updateDoctorNow(){
    let resp = this.service.updateDoctor(this.doctor);
    resp.subscribe((data)=>this.doctors=data);
  }
  public delDoctor(doctorid:number){
    let resp=this.service.deleteDoctor(doctorid);
    resp.subscribe((data)=>this.doctors=data);
  }
  public searchById(a:number){
    let resp=this.service.getDoctorById(a);
    resp.subscribe((data)=>this.doctor=data);
  }
}
