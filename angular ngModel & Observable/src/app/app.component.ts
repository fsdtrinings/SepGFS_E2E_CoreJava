import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'EmployeeApp';
  router:Router;
  role:string = '';
  isLogin:boolean = false;
  username:string = '';
  constructor(router:Router)
  {
    this.router = router;
  }

  doLogin(username:string,password:string)
  {
      if(username == 'a' && password == 'a')
      {
        this.router.navigate(['admin']);
        this.role = 'admin';
        this.isLogin = true;
      }
      else  if(username == 'e' && password == 'e')
      {
        this.router.navigate(['employee']);
        this.role = 'employee';
        this.isLogin = true;
      }

      if(this.isLogin == true)
      {
        this.username = username;
        localStorage.setItem("username",username);
        localStorage.setItem("loginStatus",true+'');
        
      }
  }
}
