package com.cg.hrapp.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MyProject")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int projectId;
	@Column(unique = true,nullable = false)
	private String projectName;
	@Column(nullable = false)
	private String clientName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="projectid")
	private Set<Employee> allEmployees;

	public Project(String projectName, String clientName) {
		super();
		this.projectName = projectName;
		this.clientName = clientName;
	}


	
	
	
}

















