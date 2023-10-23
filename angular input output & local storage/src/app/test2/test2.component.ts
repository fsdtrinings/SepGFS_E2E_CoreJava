import { Component } from '@angular/core';

@Component({
  selector: 'app-test2',
  templateUrl: './test2.component.html',
  styleUrls: ['./test2.component.css']
})
export class Test2Component {

  courseName='';
  constructor()
  {
    console.log("Contructor called ...");
    
    }

  readData()
  {
    console.log("read Data called ...");
    this.courseName = localStorage.getItem('course-name') as string;

  }
}
