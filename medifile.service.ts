import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Book } from './gbook';
import { Doctor } from './gdoctor';
import { Hospital } from './ghospital';
import { Patient } from './gpatient';

@Injectable({
  providedIn: 'root'
})
export class MedifileService {

  constructor(private http:HttpClient) { }

  public postBooking(book: Book){
    return this.http.post("http://localhost:8083/postbook",book,{responseType:'text' as 'json'});
  }
  public updateBooking(book: Book){
    return this.http.put("http://localhost:8083/updatebook",book,{responseType:'text' as 'json'});
  }
  public getBooks(){
    return this.http.get("http://localhost:8083/getallbooks");
  }
  public getBookById(a:number){
    return this.http.get("http://localhost:8083/getbookbyid?gin="+a);
  }
  public deleteBook(a:number){
    return this.http.delete("http://localhost:8083/deletebookbyid?gin="+a);
  }


  public postDoctor(doctor: Doctor){
    return this.http.post("http://localhost:8083/postdoctor",doctor,{responseType:'text' as 'json'});
  }
  public updateDoctor(doctor: Doctor){
    return this.http.put("http://localhost:8083/updatedoctor",doctor,{responseType:'text' as 'json'});
  }
  public getDoctors(){
    return this.http.get("http://localhost:8083/getalldoctors");
  }
  public getDoctorById(a:number){
    return this.http.get("http://localhost:8083/getdoctorbyid?doctorid="+a);
  }
  public deleteDoctor(a:number){
    return this.http.delete("http://localhost:8083/deletedoctorbyid?doctorid="+a);
  }


  public postHospital(hospital: Hospital){
    return this.http.post("http://localhost:8083/posthospital",hospital,{responseType:'text' as 'json'});
  }
  public updateHospital(hospital: Hospital){
    return this.http.put("http://localhost:8083/updatehospital",hospital,{responseType:'text' as 'json'});
  }
  public getHospitals(){
    return this.http.get("http://localhost:8083/getallhospitals");
  }
  public getHospitalById(a:number){
    return this.http.get("http://localhost:8083/gethospitalbyid?ghi="+a);
  }
  public deleteHospital(a:number){
    return this.http.delete("http://localhost:8083/deletehospitalbyid?ghi="+a);
  }


  public postPatient(patient: Patient){
    return this.http.post("http://localhost:8083/postpatient",patient,{responseType:'text' as 'json'});
  }
  public updatePatient(patient: Patient){
    return this.http.put("http://localhost:8083/updatepatient",patient,{responseType:'text' as 'json'});
  }
  public getPatients(){
    return this.http.get("http://localhost:8083/getallpatients");
  }
  public getPatientById(a:number){
    return this.http.get("http://localhost:8083/getpatientbyid?gin="+a);
  }
  public deletePatient(a:number){
    return this.http.delete("http://localhost:8083/deletepatientbyid?gin="+a);
  }

  
  public getAdminById(a:number){
    return this.http.get("http://localhost:8083/getadminbyid?aid="+a);
  }  
}
