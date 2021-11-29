package com.mybatis.controller;

import com.mybatis.models.Student;
import com.mybatis.services.ServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class StudentController {

	@Autowired
	private ServicesImpl services;

	@PostMapping("/save")
	public String saveData(@RequestBody Student student) {
		services.save(student);
		return "Data successfully insert in database";
	}

	@GetMapping("/get")
	public List<Student> getAll() {
		return services.getall();
	}


	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable Integer id) {
		services.delete(id);
		return "Data delete successfully";
	}


	@PutMapping("/update")
	public String updateStudent(@RequestBody Student student) {
		services.update(student);
		return "Data successfully update";
	}

	@GetMapping("/find/{id}")
	public Student findStudentById(@PathVariable Long id) {
		return services.findById(id);
	}


}
