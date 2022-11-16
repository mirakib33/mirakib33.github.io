import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Student } from 'src/model/student.model';
import { TraineeService } from '../trainee.service';

@Component({
  selector: 'app-typescript',
  templateUrl: './typescript.component.html',
  styleUrls: ['./typescript.component.css']
})
export class TypescriptComponent implements OnInit {

  constructor(private formBuilder: FormBuilder, private traineeService : TraineeService) { }

  addForm: FormGroup;
  students:Student[];

  ngOnInit() {
    this.addForm = this.formBuilder.group({
      id:[''],
      name:[''],
      email:[''],
      subject:['']
    });

    this.traineeService.getStudent().subscribe((data:Student[]) => {
      this.students = data;
    });
  }

  add(){
    this.traineeService.saveData(this.addForm.value).subscribe(data=>{this.ngOnInit();});
  }

  deleteStu(student:Student): void {
    this.traineeService.deleteStudent(student.id).subscribe(data=>{this.ngOnInit();});
  }

  editStu(student:Student): void {
    localStorage.setItem('editStuId', student.id.toString());
    let stuId = localStorage.getItem('editStuId');
    
    if(+stuId > 0){
      this.traineeService.getStudentById(+stuId).subscribe(data => {
        this.addForm.patchValue(data);
    })
     
  }
}

update(){
  this.traineeService.updateStudent(this.addForm.value).subscribe(data=>{this.ngOnInit();});
}

}
