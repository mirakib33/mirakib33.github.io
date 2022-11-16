import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Student } from 'src/model/student.model';

@Injectable({
  providedIn: 'root'
})
export class TraineeService {

  constructor(private http: HttpClient) { }
  private url = "http://localhost:3000/students";

  saveData(data : Student){
    return this.http.post<Student>(this.url, data);
  }

  getStudent() {
    return this.http.get<Student[]>(this.url);
  }

  deleteStudent(id:number) {
    return this.http.delete<Student>(this.url+"/"+id);
  }

  getStudentById(id:number) {
    return this.http.get<Student>(this.url+"/"+id);
  }

  updateStudent(student:Student) {
    return this.http.put(this.url+"/"+student.id, student);
  }
}
