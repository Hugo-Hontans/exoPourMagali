package fr.wildcodeschool.students.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("lyon")
public class StudentServiceImplBdx implements StudentService {

	public StudentServiceImplBdx() {
		// TODO Auto-generated constructor stub
	}
	
	 public List<Student> studentsList(){
			List<Student> students = new ArrayList<>();
			students.add(new Student("Eliott"));
			students.add(new Student("Hugo"));
			students.add(new Student("Magali"));
			return students;
	    }

}
