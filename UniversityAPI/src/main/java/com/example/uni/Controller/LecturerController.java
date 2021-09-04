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

import com.example.uni.Model.Lecturer;
import com.example.uni.Repo.LecturerRepo;


@RestController
@RequestMapping("/lecturer")
public class LecturerController {


	@Autowired
	LecturerRepo lect;
	@GetMapping
	public List<Lecturer> getAll(){
		return lect.findAll();
	}
	@GetMapping("/{id}")
	public Lecturer get(@PathVariable("id") Integer id) {
		return lect.findById(id).get();
	}
	@PostMapping
	public void add(@RequestBody Lecturer lecturer) {
		lect.save(lecturer);
	}
	
	@PutMapping
	public void update(@RequestBody Lecturer lecturer) {
		lect.save(lecturer);
		
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		lect.deleteById(id);
	}
}
