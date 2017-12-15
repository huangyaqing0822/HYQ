package com.lxit.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lxit.ssm.dao.StudentDao;
import com.lxit.ssm.entity.Student;
import com.lxit.ssm.service.StudentService;
import com.whalin.MemCached.MemCachedClient;



@Service("studentService")
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public class StudentServiceImpl implements StudentService{ 
	@Autowired
	StudentDao studentDao;
	@Autowired
	MemCachedClient memcachedClient;
	
	@Override
	public int add(Student stu) {
		int count = studentDao.add(stu);
		memcachedClient.add(stu.getId()+"", stu); //加到缓存
		System.out.println(stu.getId()+""+"2222222222");
		return count;
		
	}

	@Override
	public int delete(int stuId) {
		int count =  studentDao.delete(stuId);
		memcachedClient.add(stuId+"", stuId);
		return count;
	}

	@Override
	public int update(Student stu) {
		int count = studentDao.update(stu);
		memcachedClient.add(stu.getId()+"", stu); //加到缓存
		System.out.println(stu.getId()+""+"2222222222");
		return count;
	}

	@Override
	public List<Student> query() {
		return studentDao.query();
	}

	@Override
	public Student queryById(int stuId) {		
		System.out.println("测试memached................"+stuId);
		Student stu =  (Student) memcachedClient.get("stuId", stuId);
		if(stu != null){
			return stu;
		}else{
			Student student = studentDao.queryById(stuId);
			memcachedClient.add("student", student);
			System.out.println("缓存的stuId:"+student);
			return student;
		}
	}


	
}
