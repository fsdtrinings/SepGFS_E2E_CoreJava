import { Component } from '@angular/core';
import { EmployeeBasicDTO } from 'src/app/dto/employee-basic-dto';
import { EmployeeRequestSubmitDTO } from 'src/app/dto/employee-request-submit-dto';
import { AdminService } from 'src/app/service/admin.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css'],
})
export class AddEmployeeComponent {
  dto: EmployeeRequestSubmitDTO = new EmployeeRequestSubmitDTO(
    0,
    'WebUser1',
    7400,
    'Developer',
    'Banglore',
    'PAN1234'
  );
  __adminService: AdminService;
  router: Router;
  constructor(__adminService: AdminService, router: Router) {
    this.__adminService = __adminService;
    this.router = router;
  }

  doSubmit() {
    console.log(this.dto);
    this.__adminService.doEmployeeRegistration(this.dto).subscribe(
      (data) => {
        alert('Employee Saved ' + data.empName + ' Emp Id ' + data.empId);
        if (data.empId != 0) {
          this.dto = new EmployeeRequestSubmitDTO(0, '', 0, '', '', '');
        }
        this.router.navigate(['addemployee']);
      },
      (err) => {
        console.log('Error ' + err);
      }
    );
  }
}
