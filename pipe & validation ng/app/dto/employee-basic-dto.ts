export class EmployeeBasicDTO {
  empId: number;
  employeeName: string;

  designation: string;
  location: string;
  panNumber: string;
  projectName: string;
  verificationStatus: string;

  constructor(
    empId: number,
    employeeName: string,

    designation: string,
    location: string,
    panNumber: string,
    projectName: string,
    verificationStatus: string
  ) {
    this.empId = empId;
    this.employeeName = employeeName;

    this.designation = designation;
    this.location = location;
    this.panNumber = panNumber;
    this.projectName = projectName;
    this.verificationStatus = verificationStatus;
  }
}
