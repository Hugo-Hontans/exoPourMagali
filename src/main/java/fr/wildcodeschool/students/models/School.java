package fr.wildcodeschool.students.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
public class School {
	
	@Autowired
	@Qualifier("lyon") 
	private StudentService studentService;
	
	public List<Student> getStudents(){
		return this.studentService.studentsList();
    }
 

}
