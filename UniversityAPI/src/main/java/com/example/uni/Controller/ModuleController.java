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

import com.example.uni.Model.Module;
import com.example.uni.Repo.ModuleRepo;


@RestController
@RequestMapping("/module")
public class ModuleController {


	@Autowired
	ModuleRepo modules;
	@GetMapping
	public List<Module> getAll(){
		return modules.findAll();
	}
	@GetMapping("/{id}")
	public Module get(@PathVariable("id") Integer id) {
		return modules.findById(id).get();
	}
	@PostMapping
	public void add(@RequestBody Module module) {
		modules.save(module);
	}
	
	@PutMapping
	public void update(@RequestBody Module module) {
		modules.save(module);
		
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		modules.deleteById(id);
	}
}

