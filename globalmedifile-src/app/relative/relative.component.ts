import { Component, OnInit } from '@angular/core';
import { Patient } from '../gpatient';
import { Search } from '../gsearch';
import { MedifileService } from '../medifile.service';

@Component({
  selector: 'app-relative',
  templateUrl: './relative.component.html',
  styleUrls: ['./relative.component.css']
})
export class RelativeComponent implements OnInit {

  patient :any=new Patient(0,0,"","","","","","","","");
  search :any=new Search(0);
  patients:any;
  constructor(private service:MedifileService) { }

  ngOnInit(): void {
    let resp=this.service.getPatients();
    resp.subscribe((data)=>this.patients=data);
  }

  public searchById(a:number){
    let resp=this.service.getPatientById(a);
    resp.subscribe((data)=>this.patient=data);
  }
}
