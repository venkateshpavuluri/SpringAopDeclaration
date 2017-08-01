package com.example.controller;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;


@RestController
@Path("/getSudent")
public class InfoController {
	@RequestMapping(name="/info",produces=MediaType.APPLICATION_JSON)
	public List<Student> getStudentInfo()
	{
	List<Student> list=new ArrayList<>();
		Student student=new Student();
		student.setAddress("India");
		student.setId(12);
		student.setName("nani");
		Student student1=new Student();
		student1.setAddress("India");
		student1.setId(12);
		student1.setName("nani");
		list.add(student);
		list.add(student1);
		return list;
	}

}
