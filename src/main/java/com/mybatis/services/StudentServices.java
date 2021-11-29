package com.mybatis.services;

import com.mybatis.models.Student;

import java.util.List;

public interface StudentServices {

	public void save(Student student);

	public List<Student> getall();

	public void delete(Integer id);

	public void update(Student student);

	public Student findById(Long Id);


}
