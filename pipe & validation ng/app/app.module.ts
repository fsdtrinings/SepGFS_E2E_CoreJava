import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AdminComponent } from './admin/admin/admin.component';
import { EmployeeComponent } from './employee/employee/employee.component';
import { RouterModule, Routes } from '@angular/router';
import { AddEmployeeComponent } from './employee/add-employee/add-employee.component';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { ViewEmployeeComponent } from './employee/view-employee/view-employee.component';
import { MyNewPipe } from './my-new-pipe';
const allLinks: Routes = [
  { path: 'admin', component: AdminComponent },
  { path: 'employee', component: EmployeeComponent },
  { path: 'addemployee', component: AddEmployeeComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    EmployeeComponent,
    AddEmployeeComponent,
    ViewEmployeeComponent,
    MyNewPipe,
  ],
  imports: [
    BrowserModule,
    CommonModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(allLinks),
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
