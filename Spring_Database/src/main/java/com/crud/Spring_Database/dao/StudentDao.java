package com.crud.Spring_Database.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crud.Spring_Database.entity.Student;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory fact;

	public String insertdata(Student s) {
		Session ss = fact.openSession();
		Transaction tr = ss.beginTransaction();
		ss.persist(s);
		tr.commit();
		ss.close();
		return "data is inserted";
	}

	public String deletedata(int id) {
		Session ss = fact.openSession();
		Transaction tr = ss.beginTransaction();
		Student s1 = ss.get(Student.class, id);
		ss.remove(s1);
		tr.commit();
		ss.close();
		return "delete data";
	}

	public String updatedata(Student s, int id) {
		
//		Student s = new Student();
//		s.setName("Michael");
//		s.setCity("Los Angeles");
		Session ss = fact.openSession();
		Transaction tr = ss.beginTransaction();
		Student s1 = ss.get(Student.class, id);
		s1.setName(s.getName());
		s1.setCity(s.getCity());
		ss.update(s1);
		tr.commit();
		ss.close();
		return "update data";
	}

	// By HQL METHOD

	public Student getSingleData(int id) {
		Session ss = fact.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Student where id = :myid";
		Query<Student> query = ss.createQuery(hqlQuery, Student.class);
		query.setParameter("myid", id);

		Student s = query.uniqueResult();
		tr.commit();
		ss.close();
		return s;

	}

	public List<Student> getallData() {
		Session ss = fact.openSession();
		Transaction tr = ss.beginTransaction();
		String hqlQuery = "from Student";
		Query<Student>query = ss.createQuery(hqlQuery);
		List<Student > list = query.list();
		
		tr.commit();
		ss.close();
		return list;
	}
	


}
