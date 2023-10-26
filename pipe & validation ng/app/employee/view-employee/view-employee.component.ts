import { Component } from '@angular/core';
import { EmployeeBasicDTO } from 'src/app/dto/employee-basic-dto';
import { AdminService } from 'src/app/service/admin.service';

@Component({
  selector: 'app-view-employee',
  templateUrl: './view-employee.component.html',
  styleUrls: ['./view-employee.component.css'],
})
export class ViewEmployeeComponent {
  allEmployee: EmployeeBasicDTO[] = [];
  __adminService: AdminService;
  isError: boolean = false;
  errorMsg: string = '';
  constructor(__adminService: AdminService) {
    this.__adminService = __adminService;

    this.__adminService.doGetAllEmployees().subscribe(
      (data) => {
        this.allEmployee = data;
      },
      (err) => {
        console.log(err);
      }
    );
  }

  doLoad() {
    this.__adminService.doGetAllEmployees().subscribe(
      (data) => {
        this.allEmployee = data;
      },
      (err) => {
        this.isError = true;
        this.errorMsg = err.message;
      }
    );
  }
}
