package com.Crud.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Crud.Entity.Customer;
@Repository
public class CustumerDao { // repositri class or connect with database
	@Autowired
	SessionFactory sf;

	public String insertData(Customer c) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		ss.persist(c);
		tr.commit();
		ss.close();
		return "data is inserted";
	}

	public String deleteData(int id) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Customer c = ss.get(Customer.class, id);
		ss.remove(c);
		tr.commit();
		ss.close();
		return "data is deleted succesfully";
	}

	public String updateData(Customer c, int id) {

		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Customer c1 = ss.get(Customer.class, id);
		c1.setName(c.getName());
		c1.setMobile(c.getMobile());
		c1.setLastname(c.getLastname());
		c1.setAccount_no(c.getAccount_no());
		ss.merge(c1);
		tr.commit();
		ss.close();
		return "data is updated";
	}

	public Customer GetSingleData( int id) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Customer where id =:myid";
		Query<Customer> query = ss.createQuery(hqlQuery, Customer.class);
		query.setParameter("myid", id);
		Customer c1 = query.uniqueResult();

		tr.commit();
		ss.close();
		return c1;
	}

	public List<Customer> GetAllData() {

		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Customer ";
		Query<Customer>query =  ss.createQuery(hqlQuery,  Customer.class);
		List<Customer>list = query.list();
		tr.commit();
		ss.close();
		return list;
		
	}

}
