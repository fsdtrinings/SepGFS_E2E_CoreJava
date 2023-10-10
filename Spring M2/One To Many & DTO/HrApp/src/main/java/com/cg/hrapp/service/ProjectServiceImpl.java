package com.cg.hrapp.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hrapp.entity.Employee;
import com.cg.hrapp.entity.Project;
import com.cg.hrapp.repository.IProjectRepository;

@Service
public class ProjectServiceImpl implements IProjectService {

	@Autowired
	IProjectRepository projectRepository;
	@Autowired
	IEmployeeService empService;
	
	public ProjectServiceImpl() {
		System.out.println("Inside Project Service impl contructor");
	}

	@Override
	@Transactional
	public int addProject(Project p) {
		
		if(p != null)
		{
			Project savedProject = projectRepository.save(p);
			return savedProject.getProjectId();
		}
		return 0;
	}

	@Override
	public Project getProjectByID(int id) {
		if(id != 0)
		{
			Project savedProject = projectRepository.findById(id).get();
			if(savedProject != null) return savedProject;
		}
		return null;
	}
	

	@Override
	public Project getProjectByProjectName(String projectName) {
		if(projectName != null || !projectName.isEmpty())
		{
			Project savedProject = projectRepository.getProjectByProjectName(projectName);
			if(savedProject != null) return savedProject;
		}
		return null;
	}

	@Override
	public Set<Project> getProjectByClientName(String clientName) {
		
		Set<Project> allProjects = projectRepository.getProjectByClientName(clientName);
		
		
		return allProjects;
	}

	@Override
	@Transactional
	public String allocateEmployeeToProject
	    (int pid,int empId)
	{
		String status = "";
		
		Employee e = empService.getEmployeeById(empId);
		Project p = getProjectByID(pid);
		
		if(e!=null && p!=null)
		{
			
			Set<Employee> allWorkingEmployee = p.getAllEmployees();
			allWorkingEmployee.add(e);
			
			p.setAllEmployees(allWorkingEmployee);// update query
			
			status = "Employee allocated , Employee Count :- "+p.getAllEmployees().size();
			
			
		}
		else 
		{
			status = "Employee "+e+" or Project "+p;
		}
		
		
		
		return status;
		
	}

	@Override
	public Set<Employee> getallAllocatedEmployeesByProject(int pid) {
		Project p = getProjectByID(pid);
		Set<Employee> allEmployees = p.getAllEmployees();
		return allEmployees;
	}
	
	
	
	
	
	
	
}//end class





















