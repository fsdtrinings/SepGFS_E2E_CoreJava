import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent {
  
  count:number = 0;
  @Output()  sendToParentPage = new EventEmitter<string>();
  doClick(courseName:string){
    this.count++;
    this.sendToParentPage.emit(this.count+'');
    localStorage.setItem('course-name',courseName);
  }
}
