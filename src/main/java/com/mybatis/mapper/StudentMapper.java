package com.mybatis.mapper;

import com.mybatis.models.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {

	@Insert("insert into student(name,email,password,salary) values(#{name},#{email},#{password},#{salary})")
	@Options(useGeneratedKeys =true, keyProperty = "id")
	@Results({
			@Result(property = "id", column = "s_id" , id=true),
			@Result(property = "name", column = "s_name"),
			@Result(property = "email", column = "s_email"),
			@Result(property = "password", column = "s_password"),
			@Result(property = "salary", column = "s_salary")
	})
	public void insert(Student student);

	@Select("select * from student")
	@Results({
			@Result(property = "id", column = "s_id" , id=true),
			@Result(property = "name", column = "s_name"),
			@Result(property = "email", column = "s_email"),
			@Result(property = "password", column = "s_password"),
			@Result(property = "salary", column = "s_salary")
	})
	public List<Student> findAll();

	@Delete("delete from student where id =#{id}")
	public void delete(Integer id);

	@Update(" update student set name = #{name} ,email = #{email} ,password = #{password} ,salary = #{salary} where id = #{id}")
	public void update(Student student);

	@Select("SELECT * FROM student WHERE id = #{id}")
	public Student findByid(Long id);

}
