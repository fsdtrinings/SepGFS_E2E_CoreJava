import { Component } from '@angular/core';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent {
 
  name:string = 'Ramesh';
  isVisible:boolean = false;
  passingStatus:string='black';
  buttonText:string = 'Show';

  doToggle(){
    if(this.isVisible == true)
    {
      this.isVisible = false;
      this.buttonText = 'Show';
    }
    else if(this.isVisible == false){
      this.isVisible = true;
      this.buttonText = 'Hide';
    }
  }

  validateResult(marks:string)
  {
    let finalMarks:number = parseInt(marks);
    if(finalMarks<60)
    {
      this.passingStatus = 'red'
    }
    else if(finalMarks>=60) this.passingStatus = 'green';
  }
}
