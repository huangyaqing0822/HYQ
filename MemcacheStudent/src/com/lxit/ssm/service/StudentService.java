package com.lxit.ssm.service;

import java.util.List;

import com.lxit.ssm.entity.Student;

public interface StudentService {
	public int add(Student stu);
	public int delete(int stuId);
	public int update(Student stu);
	public List<Student> query();
	public Student queryById(int stuId);
}
