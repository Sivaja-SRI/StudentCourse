package com.example.uni.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Lecturer {
	@Id
	private int Lec_Id;
	private String Name;
	private int Contact_Id;
	private String Department;
	@OneToMany
	@JoinColumn(name="Lecturer_id",referencedColumnName = "Lec_Id")
	public List<Module> modules;
	
	
	public Lecturer() {
	}


	public Lecturer(int lec_Id, String name, int contact_Id, String department, List<Module> modules) {
		super();
		Lec_Id = lec_Id;
		Name = name;
		Contact_Id = contact_Id;
		Department = department;
		this.modules = modules;
	}


	public int getLec_Id() {
		return Lec_Id;
	}


	public void setLec_Id(int lec_Id) {
		Lec_Id = lec_Id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getContact_Id() {
		return Contact_Id;
	}


	public void setContact_Id(int contact_Id) {
		Contact_Id = contact_Id;
	}


	public String getDepartment() {
		return Department;
	}


	public void setDepartment(String department) {
		Department = department;
	}


	public List<Module> getModules() {
		return modules;
	}


	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	
	
}

