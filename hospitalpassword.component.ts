import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Hospital } from '../ghospital';
import { Search } from '../gsearch';
import { MedifileService } from '../medifile.service';

@Component({
  selector: 'app-hospitalpassword',
  templateUrl: './hospitalpassword.component.html',
  styleUrls: ['./hospitalpassword.component.css']
})
export class HospitalpasswordComponent implements OnInit {


  hospital :any=new Hospital(0,0,"","","");
  search :any=new Search(0);
  hospitals:any;
  resp: any;
  constructor(private service:MedifileService,private route:ActivatedRoute) {}
  ngOnInit(): void {
    /*this.route.paramMap.subscribe(data=>{
      let resp=data.get('tech');
    })*/
    let response=this.service.getHospitals();
    response.subscribe((data)=>this.hospitals=data);
  }

  public updateHospitalNow(){
    let resp = this.service.updateHospital(this.hospital);
    resp.subscribe((data)=>this.hospitals=data);
  }
  public searchById(a:number){
    let resp=this.service.getHospitalById(a);
    resp.subscribe((data)=>this.hospital=data);
  }
}
