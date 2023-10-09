package com.training.app.service.instructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.app.dto.InstructorCourseDTO;
import com.training.app.entity.Course;
import com.training.app.entity.Instructor;
import com.training.app.exceptions.InvalidInputDataException;
import com.training.app.exceptions.InvalidRecordException;
import com.training.app.repository.course.CourseRepository;
import com.training.app.repository.instructor.InstructorRepository;

@Service
public class InstructorServiceImpl implements InstructorService{

	@Autowired
	InstructorRepository instructorRepository;
	
	@Autowired
	CourseRepository courseRepository;
	
	@Override
	public String verifyTrainer(String password,int usercode)
	{
		Instructor savedInstructor = instructorRepository.getReferenceById(usercode);
		if(savedInstructor != null && savedInstructor.getPassword().equals(password))
		{
			return savedInstructor.getInsName();
		}
		else return null;
	}
	
	@Override
	public Instructor registerTrainer(Instructor instructor) {
		return instructorRepository.save(instructor);
	}

	@Override
	public List<Instructor> getAllTrainer() {
		return instructorRepository.findAll(); 
	}

	@Override
	public Instructor updateCourse(int instructorCode,int courseId) {
		
		// First Step : extract already saved instructor & course from DB
		
		Instructor savedInstructor = instructorRepository.getReferenceById(instructorCode);
		Course savedCourse = courseRepository.getReferenceById(courseId);
		
		// if both instructor & course is available in database
		if(savedInstructor != null & savedCourse != null) 
		{
			Instructor updatedInstructor = instructorRepository.updateCourseByInstructor(savedInstructor, savedCourse);
			instructorRepository.save(updatedInstructor); // if data is already saved then hibernate calls update query in background
			return updatedInstructor;
		}
		
		else return null;
		
		
	}
	
	@Override
	public List<InstructorCourseDTO> getInstructorByCourseName( String cname)
	{
		List<InstructorCourseDTO> list = instructorRepository.getInstructorByCourseName(cname);
		return list;
	}

	@Override
	public boolean updatePassword(int id, String oldPassword, String newPassword) 
	throws InvalidInputDataException,InvalidRecordException
	{
		
		Instructor savedInstructor = instructorRepository.getReferenceById(id);
		if(savedInstructor != null && savedInstructor.getPassword().equals(oldPassword))
		{
			if(newPassword != null && newPassword.length()>=5)
			{
				savedInstructor.setPassword(newPassword);
				instructorRepository.save(savedInstructor);
				return true;
			}
			else
			{
				throw new InvalidInputDataException("New Password","New Password cannot be null or should have 5 or more characters");
			}
		}
		else
		{
			throw new InvalidRecordException(id,"String");
		}
		
	}

	@Override
	public Instructor getInstructorById(int id) throws InvalidRecordException {
		Instructor savedInstructor = instructorRepository.getReferenceById(id);
		
			return savedInstructor;
		
	}
	
	
	
	
	
}

















