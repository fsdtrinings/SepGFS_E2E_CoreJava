package com.training.app.service.instructor;

import java.util.List;

import org.springframework.stereotype.Service;

import com.training.app.dto.InstructorCourseDTO;
import com.training.app.entity.Course;
import com.training.app.entity.Instructor;
import com.training.app.exceptions.InvalidInputDataException;
import com.training.app.exceptions.InvalidRecordException;

@Service
public interface InstructorService {

	
	public Instructor registerTrainer(Instructor instructor);
	public List<Instructor> getAllTrainer();
	public Instructor updateCourse(int instructorCode,int courseId);
	public List<InstructorCourseDTO> getInstructorByCourseName( String cname);
	public boolean updatePassword(int id,String oldPassword,String newPassword)
			throws InvalidInputDataException,InvalidRecordException;
	public String verifyTrainer(String password,int usercode);
	public Instructor getInstructorById(int id)throws InvalidRecordException;
}
