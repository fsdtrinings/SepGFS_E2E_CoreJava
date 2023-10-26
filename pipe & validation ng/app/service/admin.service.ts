import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { EmployeeRequestSubmitDTO } from '../dto/employee-request-submit-dto';
import { EmployeeBasicDTO } from '../dto/employee-basic-dto';

@Injectable({
  providedIn: 'root',
})
export class AdminService {
  constructor(private api: HttpClient) {}

  contextPath = 'http://localhost:2002';
  addEmployeeEndPoint = this.contextPath + '/emp/register/employee';
  getAllEmployeesEndPoint = this.contextPath + '/emp/employees';

  doGetAllEmployees(): Observable<EmployeeBasicDTO[]> {
    let outcome = this.api.get<EmployeeBasicDTO[]>(
      `${this.getAllEmployeesEndPoint}`
    );
    return outcome;
  }

  doEmployeeRegistration(
    dto: EmployeeRequestSubmitDTO
  ): Observable<EmployeeRequestSubmitDTO> {
    console.log('Inside service ' + dto.empName);

    let outcome = this.api.post<EmployeeRequestSubmitDTO>(
      `${this.addEmployeeEndPoint}`,
      dto
    );
    return outcome;
  }
}
