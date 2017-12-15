package com.lxit.ssm.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lxit.ssm.entity.Student;
import com.lxit.ssm.service.StudentService;
@SessionAttributes("student")
@Controller
public class StudentAction {
	@Autowired
	StudentService studentService;
	
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	
	@RequestMapping("/add")
	public String add(){
		return "add";
	}

	@RequestMapping("/addPost")
	public String add(Student stu){
		int count=studentService.add(stu);
		return "addSuccess";
	}
	
	
	@ResponseBody
	@RequestMapping("/query")
	public List<Student> query(){
		List<Student> list=studentService.query();
		return list;
	}
	
	
	@ResponseBody
	@RequestMapping("/delete")
	public String delete(int id){
		int count=studentService.delete(id);
		System.out.println(count);
		if(count>0){
			return "true";
		}
		return "false";
	}
	
	
	@RequestMapping("/upd")
	public String update(int id,Map<String, Object> map){
		Student student=studentService.queryById(id);
		map.put("student", student);
		return "update";
	}
	
	
	@ResponseBody
	@RequestMapping("/updataPost")
	public String updataPost(Student student){
		System.out.println(student);
		int count=studentService.update(student);
		if(count>0){
			return "true";
		}
		return "false";
	}
}
