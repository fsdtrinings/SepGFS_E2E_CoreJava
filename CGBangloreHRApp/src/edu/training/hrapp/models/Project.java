package edu.training.hrapp.models;

import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Project {

	@Id
	private int pid;
	private String projectname;
	private String clientName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ProjectId")
	private Set<Employee> allEmployees;
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int pid, String projectname, String clientName) {
		super();
		this.pid = pid;
		this.projectname = projectname;
		this.clientName = clientName;
	}
	
	public Set<Employee> getAllEmployees() {
		return allEmployees;
	}
	public void setAllEmployees(Set<Employee> allEmployees) {
		this.allEmployees = allEmployees;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(clientName, pid, projectname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return Objects.equals(clientName, other.clientName) && pid == other.pid
				&& Objects.equals(projectname, other.projectname);
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", projectname=" + projectname + ", clientName=" + clientName + "]";
	}
	
	
}
