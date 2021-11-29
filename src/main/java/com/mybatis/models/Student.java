package com.mybatis.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {


	private long id;
	private String name;
	private String email;
	private String password;
	private double salary;


}
