package com.example.uni.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Module {
	@Id
	private int Module_Id;
	private String Name;
	private int No_of_Periods;
	@ManyToOne
	@JoinColumn(name="Lecturer_id",referencedColumnName = "Lec_Id")
	private Lecturer Lecturer;
	@ManyToOne
	@JoinColumn(name="Student_id",referencedColumnName = "Student_Id")
	private Student Students;
	
	public Module() {
		
	}

	public Module(int module_Id, String name, int no_of_Periods, com.example.uni.Model.Lecturer lecturer,
			Student students) {
		super();
		Module_Id = module_Id;
		Name = name;
		No_of_Periods = no_of_Periods;
		Lecturer = lecturer;
		Students = students;
	}

	public int getModule_Id() {
		return Module_Id;
	}

	public void setModule_Id(int module_Id) {
		Module_Id = module_Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getNo_of_Periods() {
		return No_of_Periods;
	}

	public void setNo_of_Periods(int no_of_Periods) {
		No_of_Periods = no_of_Periods;
	}

	public Lecturer getLecturer() {
		return Lecturer;
	}

	public void setLecturer(Lecturer lecturer) {
		Lecturer = lecturer;
	}

	public Student getStudents() {
		return Students;
	}

	public void setStudents(Student students) {
		Students = students;
	}
	
}
