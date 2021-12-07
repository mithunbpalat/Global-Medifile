import { Component, OnInit } from '@angular/core';
import { Hospital } from '../ghospital';
import { Search } from '../gsearch';
import { MedifileService } from '../medifile.service';

@Component({
  selector: 'app-adminhospital',
  templateUrl: './adminhospital.component.html',
  styleUrls: ['./adminhospital.component.css']
})
export class AdminhospitalComponent implements OnInit {

  hospital :any=new Hospital(0,0,"","","");
  search :any=new Search(0);
  hospitals:any;
  constructor(private service:MedifileService) {}
  ngOnInit(): void {
    let resp=this.service.getHospitals();
    resp.subscribe((data)=>this.hospitals=data);
  }

  public hospitalNow(){
    let resp = this.service.postHospital(this.hospital);
    resp.subscribe((data)=>this.hospitals=data);
  }
  public updateHospitalNow(){
    let resp = this.service.updateHospital(this.hospital);
    resp.subscribe((data)=>this.hospitals=data);
  }
  public delHospital(ghi:number){
    let resp=this.service.deleteHospital(ghi);
    resp.subscribe((data)=>this.hospitals=data);
  }
  public searchById(a:number){
    let resp=this.service.getHospitalById(a);
    resp.subscribe((data)=>this.hospital=data);
  }
}
