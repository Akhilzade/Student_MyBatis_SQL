package com.mybatis.services;

import com.mybatis.mapper.StudentMapper;
import com.mybatis.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesImpl implements StudentServices {

	@Autowired
	private StudentMapper studentMapper;

	@Override
	public void save(Student student) {

		studentMapper.insert(student);

	}

	@Override
	public List<Student> getall() {
		return studentMapper.findAll();
	}

	@Override
	public void delete(Integer id) {
		 studentMapper.delete(id);
	}

	@Override
	public void update(Student student) {
		studentMapper.update(student);
	}

	@Override
	public Student findById(Long id) {
		return studentMapper.findByid(id);
	}


}
