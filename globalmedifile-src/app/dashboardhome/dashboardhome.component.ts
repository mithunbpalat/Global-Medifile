import { Component, OnInit } from '@angular/core';
import { Book } from '../gbook';
import { Search } from '../gsearch';
import { MedifileService } from '../medifile.service';

@Component({
  selector: 'app-dashboardhome',
  templateUrl: './dashboardhome.component.html',
  styleUrls: ['./dashboardhome.component.css']
})
export class DashboardhomeComponent implements OnInit {

  book :any=new Book(0,0,"","","","","","","","");
  search :any=new Search(0);
  books:any;
  constructor(private service:MedifileService) { }

  ngOnInit(): void {
    let resp=this.service.getBooks();
    resp.subscribe((data)=>this.books=data);
  }

  public bookNow(){
    let resp = this.service.postBooking(this.book);
    resp.subscribe((data)=>this.books=data);
  }
  public updateNow(){
    let resp = this.service.updateBooking(this.book);
    resp.subscribe((data)=>this.books=data);
  }
  public delBook(gin:number){
    let resp=this.service.deleteBook(gin);
    resp.subscribe((data)=>this.books=data);
  }
  public searchById(a:number){
    let resp=this.service.getBookById(a);
    resp.subscribe((data)=>this.book=data);
  }
}
