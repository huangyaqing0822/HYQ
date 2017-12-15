package com.lxit.ssm.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.ssm.entity.Student;

@MapperScan
public interface StudentDao {
	public int add(Student stu);
	
	public int delete(int stuId);
	
	public int update(Student stu);
	
	public List<Student> query();
	
	public Student queryById(int stuId);
}
