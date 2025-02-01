package com.crud.Spring_Database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.Spring_Database.dao.StudentDao;
import com.crud.Spring_Database.entity.Student;

@Service
public class Student_Service {
	@Autowired
	StudentDao dao;

	public String insertdata(Student s) {
		if (s.getAge() < 18 || s.getAge() > 100) {
			return "Student's age should be between 18 and 100.";
		}
		String str = dao.insertdata(s);
		return str;

	}

	public String deletedata(int id) {
		String str = dao.deletedata(id);
		return str;

	}

	public String updatedata(Student s, int id) {
		String str = dao.updatedata(s, id);
		return str;

	}

	public Student getSingleData(int id) {
		Student s = dao.getSingleData(id);
		return s;

	}
	
	public List<Student> getallData() {
		List<Student> list= dao.getallData();
		return list;
	}
}
