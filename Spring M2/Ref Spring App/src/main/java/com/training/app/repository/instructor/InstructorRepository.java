package com.training.app.repository.instructor;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.training.app.dto.InstructorCourseDTO;
import com.training.app.entity.Course;
import com.training.app.entity.Instructor;

@Repository
public interface InstructorRepository extends 
        JpaRepository<Instructor,Integer>,CustomInstructorRepository
{

	@Query("select i.insName,i.insCode,c.courseName\n"
			+ "from Course c\n"
			+ "inner join Instructor i\n"
			+ "where c.courseName = 'Java' ")
	public List<InstructorCourseDTO> getInstructorByCourseName(String cname);
	
}//end interface
