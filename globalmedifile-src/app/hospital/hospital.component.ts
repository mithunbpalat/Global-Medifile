import { Component, OnInit } from '@angular/core';
import { Hospital } from '../ghospital';
import { MedifileService } from '../medifile.service';

@Component({
  selector: 'app-hospital',
  templateUrl: './hospital.component.html',
  styleUrls: ['./hospital.component.css']
})
export class HospitalComponent implements OnInit {

  hospital : any=new Hospital(0,0,"","","");
  test : any=new Hospital(0,0,"","","");
  

  constructor(private service: MedifileService) { }

  ngOnInit(): void {
  }

  public verify(au: string, tu: string,ap: string, tp: string){
    if(tu && tp){
      if(au == tu && ap == tp){
      (<HTMLInputElement>document.getElementById("demo")).disabled=false;
      (<HTMLInputElement>document.getElementById("demo")).innerText="Login";
    }
  }
}
public searchById(a:number){
  let resp=this.service.getHospitalById(a);
  resp.subscribe((data)=>this.hospital=data);
}
}
