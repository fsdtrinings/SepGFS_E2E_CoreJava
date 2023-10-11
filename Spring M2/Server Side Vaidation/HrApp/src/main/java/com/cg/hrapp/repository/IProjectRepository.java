package com.cg.hrapp.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hrapp.entity.Project;

@Repository
public interface IProjectRepository extends JpaRepository<Project, Integer> {

	public Project getProjectByProjectName(String projectName);
	public Set<Project> getProjectByClientName(String clientName);
	
}
