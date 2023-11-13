package com.cg.hrapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hrapp.entity.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
	public List<Employee> getEmployeeByDesignation(String designation);
	public List<Employee> getEmployeeByLocation(String location);
	
	@Query("From Employee where designation=:des and location =:loc")
	public List<Employee> getEmployeeByLocationAndDesignation
						  (@Param("des")String des,@Param("loc") String loc);
}
