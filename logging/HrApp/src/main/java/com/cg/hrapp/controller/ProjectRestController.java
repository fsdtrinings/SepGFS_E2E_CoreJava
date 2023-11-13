package com.cg.hrapp.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hrapp.entity.Project;
import com.cg.hrapp.service.IProjectService;

@RestController
@RequestMapping("/project")
@CrossOrigin(origins = {"http://localhost:2002", "http://localhost:4200"},allowedHeaders = "*")
public class ProjectRestController {

	@Autowired
	IProjectService projectService;
	
	
	public ProjectRestController() {
		System.out.println("Project Rest controller created");
	}
	
	@PostMapping("/submit")
	public ResponseEntity<Project> saveProject(@RequestBody Project project)
	{
		int pid = projectService.addProject(project);
		Project savedProject = projectService.getProjectByID(pid);
		
		return new ResponseEntity<Project>(savedProject, HttpStatus.CREATED);
	}
	
	@GetMapping("/details")
	public ResponseEntity<Project> getProject(@RequestParam int pid)
	{
		Project savedProject = projectService.getProjectByID(pid);
		
		return new ResponseEntity<Project>(savedProject, HttpStatus.FOUND);
	}
	
	@GetMapping("/details/name/{name}")
	public ResponseEntity<Project> getProject2(@PathVariable String name)
	{
		Project savedProject = projectService.getProjectByProjectName(name);
		
		return new ResponseEntity<Project>(savedProject, HttpStatus.FOUND);
	}
	
	
	
	@PutMapping("/emp")
	public ResponseEntity<String> 
	    doEmployeeAllotment(@RequestParam int empid,@RequestParam int pid)
	{
		
		String status = projectService.allocateEmployeeToProject(pid, empid);
		
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}
	
}//end clas























