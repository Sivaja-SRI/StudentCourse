package com.example.uni.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Student {
	@Id
	private int Student_Id;
	private String Name;
	private String Course;
	private int Year;
	@OneToMany
	@JoinColumn(name="Student_id",referencedColumnName = "Student_Id")
	public List<Module> modules;
	
	public Student() {
		
	}

	public Student(int student_Id, String name, String course, int year, List<Module> modules) {
		super();
		Student_Id = student_Id;
		Name = name;
		Course = course;
		Year = year;
		this.modules = modules;
	}

	public int getStudent_Id() {
		return Student_Id;
	}

	public void setStudent_Id(int student_Id) {
		Student_Id = student_Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	
	}
