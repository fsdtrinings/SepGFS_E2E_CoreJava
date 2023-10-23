import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'DempApp';
  clickCount = 0;
  getCount(event:any)
  {
    this.clickCount = event as number;
  }
}
