package com.lxit.tmaven.cxfwebservices.service;

import javax.jws.WebService;

@WebService
public class StudentServiceImpl implements StudentService {

	@Override
	public Student getStu(String name) {
		Student stu = new Student();
		stu.setId(1);
		stu.setName("name:"+name);
		return stu;
	}

}
