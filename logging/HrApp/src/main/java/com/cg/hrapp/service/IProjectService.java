package com.cg.hrapp.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.cg.hrapp.entity.Employee;
import com.cg.hrapp.entity.Project;

@Service
public interface IProjectService {
	
	public int addProject(Project p);
	public Project getProjectByID(int id);
	public Project getProjectByProjectName(String projectName);
	public Set<Project> getProjectByClientName(String clientName);
	public Set<Employee> getallAllocatedEmployeesByProject(int pid);
	public String allocateEmployeeToProject(int pid,int empId);
	

}
