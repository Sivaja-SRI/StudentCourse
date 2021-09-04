
package com.example.uni.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.uni.Model.Student;
import com.example.uni.Repo.StudentRepo;


@RestController
@RequestMapping("/student")
public class StudentController {


	@Autowired
	StudentRepo st;
	@GetMapping
	public List<Student> getAll(){
		return st.findAll();
	}
	@GetMapping("/{id}")
	public Student get(@PathVariable("id") Integer id) {
		return st.findById(id).get();
	}
	@PostMapping
	public void add(@RequestBody Student student) {
		st.save(student);
	}
	
	@PutMapping
	public void update(@RequestBody Student student) {
		st.save(student);
		
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		st.deleteById(id);
	}
}

