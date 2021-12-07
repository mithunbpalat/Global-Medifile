import { Component, OnInit } from '@angular/core';
import { Admin } from '../gadmin';
import { MedifileService } from '../medifile.service';


@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  admin : any = new Admin(0,1,"","");
  test : any = new Admin(0,1,"","");
  constructor(private service:MedifileService) { }

  ngOnInit(): void {
    
  }

  public verify(au: string, tu: string,ap: string, tp: string){
      if(tu!="" && tp!=""){
        if(au == tu && ap == tp){
        (<HTMLInputElement>document.getElementById("demo")).disabled=false;
        (<HTMLInputElement>document.getElementById("demo")).innerText="Login";
      }
    }
  }
  public searchById(a:number){
    let resp=this.service.getAdminById(a);
    resp.subscribe((data)=>this.admin=data);
  }
}
