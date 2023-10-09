package com.training.app.repository.instructor;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.training.app.entity.Course;
import com.training.app.entity.Instructor;

public interface CustomInstructorRepository {

	public Instructor updateCourseByInstructor(Instructor instructor,
			Course course);
	
	
	
	/*
	 *  update Instructor set course = 1 where insCode = 101
	 * 
	 * */
	
}
