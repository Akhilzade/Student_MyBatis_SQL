package com.mybatis;

import com.mybatis.models.Student;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MappedTypes(Student.class)
@MapperScan("com.mybatis.mapper")
public class StudentMyBatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentMyBatisApplication.class, args);
	}

}
