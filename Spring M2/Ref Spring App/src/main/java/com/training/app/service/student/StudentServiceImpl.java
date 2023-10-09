package com.training.app.service.student;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.app.entity.Course;
import com.training.app.entity.Instructor;
import com.training.app.entity.Student;
import com.training.app.exceptions.InvalidInputDataException;
import com.training.app.exceptions.InvalidRecordException;
import com.training.app.repository.course.CourseRepository;
import com.training.app.repository.student.IStudentRepository;
import com.training.app.util.VerifyInput;

import net.bytebuddy.asm.Advice.Return;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	@Override
	public String verifyStudent(String password,int usercode)
	{
		Student savedStudent = studentRepository.getReferenceById(usercode);
		if(savedStudent != null && savedStudent.getPassword().equals(password))
		{
			return savedStudent.getStuName();
		}
		else return null;
	}
	
	@Override
	@Transactional
	public Student addStudent(Student student) throws Exception{
		
		if(student != null)
		{
			// --- allow student to be inserted
			if(student.getStuName().equals(""))
			{
				throw new InvalidInputDataException("Student Name", "Student Name is Null");
			}
			if(!VerifyInput.verifyEmail(student.getProfile().getEmail()))
			{
				throw new InvalidInputDataException("Student EMail", "Invalid Email id "+student.getProfile().getEmail());
			}
			
			Student savedStudent = studentRepository.save(student);
			return savedStudent; // this student contains stuId value
		}
		else throw new NullPointerException("Student is Null");
		
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	@Transactional
	public Student updateCourseByStudentid(int sid, int cid) throws Exception{
		/// Step 
		
		
		// 1. get Student 
		
		Student studentFromDB = getStudentById(sid);
		
		// 2. get course 
		Course courseFromDB = courseRepository.getReferenceById(cid);
		
		// if student & course both are valid and available in DB then 
		if(studentFromDB != null & courseFromDB != null)
		{
			List<Student> allStudents = courseFromDB.getStudents();
			
			if(allStudents != null && allStudents.isEmpty() == false)
			{
				allStudents.add(studentFromDB);
				courseFromDB.setStudents(allStudents);
			}
			else // if course are null  then create ArrayList and add Student
			{
				List<Student> newStudentList = new ArrayList<>();
				newStudentList.add(studentFromDB);
				courseFromDB.setStudents(newStudentList);
			}
			// call repository save method
			courseRepository.saveAndFlush(courseFromDB);
			studentRepository.save(studentFromDB);
			return studentFromDB;
		}
		else
		{
			// if student or course not in the db
			throw new NullPointerException("Either Student "+studentFromDB+"or Course "+courseFromDB+" is Null ");
		}
		
	}

	@Override
	public Student getStudentById(int sid) throws Exception{
		if(sid >=1)
		{
			Student savedStudent =  studentRepository.getReferenceById(sid);
			if(savedStudent != null) return savedStudent;
			else 
			{
				throw new EntityNotFoundException("Invalid Student ID : "+sid);
			}
		}
		return null;
	}

	@Override
	public Course getCourseByStudentId(int sid) {
		
		return null;
	}
	
	@Override
	public boolean updatePassword(int id, String oldPassword, String newPassword) 
	throws InvalidInputDataException,InvalidRecordException
	{
		
		Student savedStudent = studentRepository.getReferenceById(id);
		if(savedStudent != null && savedStudent.getPassword().equals(oldPassword))
		{
			if(newPassword != null && newPassword.length()>=5)
			{
				savedStudent.setPassword(newPassword);
				studentRepository.save(savedStudent);
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

}


























