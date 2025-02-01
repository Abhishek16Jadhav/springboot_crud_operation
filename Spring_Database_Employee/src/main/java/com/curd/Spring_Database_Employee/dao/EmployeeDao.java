package com.curd.Spring_Database_Employee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.curd.Spring_Database_Employee.Entity.EmployeeEntity;

@Repository
public class EmployeeDao {
	@Autowired
	SessionFactory sf;

	public String insertData(EmployeeEntity e) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		ss.persist(e);
		tr.commit();
		ss.close();
		return "Data is inserted ";

	}

	public String updateData(EmployeeEntity e, int emp_id) {

		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		EmployeeEntity e1 = ss.get(EmployeeEntity.class, emp_id);
		e1.setBranch(e.getBranch());
		e1.setCity(e.getCity());
		e1.setEmail(e.getEmail());
		e1.setPassword(e.getPassword());
		ss.update(e1);
		tr.commit();
		ss.close();
		return "data is updated";

	}

	public String deleteData(int emp_id) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		EmployeeEntity e = ss.get(EmployeeEntity.class, emp_id);
		ss.remove(e);
		tr.commit();
		ss.close();
		return "data is deleted";
	}

	public EmployeeEntity getSingleData(int emp_id) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		String hqlQuery = "from EmployeeEntity where emp_id =:myid";
		Query<EmployeeEntity> query = ss.createQuery(hqlQuery);
		query.setParameter("myid", emp_id);
		EmployeeEntity e = query.uniqueResult();
		
		tr.commit();
		ss.close();
		return e;
	}
	
	public List<EmployeeEntity> getAllRecord() {
		
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		String hqlQuery = "from EmployeeEntity";
		Query<EmployeeEntity> query = ss.createQuery(hqlQuery);
		List<EmployeeEntity> list = query.list();
		tr.commit();
		ss.close();
		return list;
		
	}
}
