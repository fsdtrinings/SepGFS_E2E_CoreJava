export class EmployeeRequestSubmitDTO {
  empId: number;
  empName: string;
  salary: number;
  designation: string;
  location: string;
  panNumber: string;

  constructor(
    empId: number,
    empName: string,
    salary: number,
    designation: string,
    location: string,
    panNumber: string
  ) {
    this.empId = empId;
    this.empName = empName;
    this.salary = salary;
    this.designation = designation;
    this.location = location;
    this.panNumber = panNumber;
  }
}
