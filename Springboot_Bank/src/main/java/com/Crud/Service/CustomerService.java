package com.Crud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Crud.Dao.CustumerDao;
import com.Crud.Entity.Customer;

@Service
public class CustomerService {
	
	@Autowired
	CustumerDao dao;
	
	
	public String insertData(Customer c) {
		String str = dao.insertData(c);
		return str;
	}
	
	public String deleteData(int id) {
		String str = dao.deleteData(id);
		return str;
	}
	
	public String updateData(Customer c, int id) {
		String str = dao.updateData(c, id);
		return str;
	}

	public Customer GetSingleData( int id) {
		Customer str = dao.GetSingleData( id);
		return str;
	}
	public List<Customer> GetAllData() {
		 List<Customer >list= dao.GetAllData();
		 return list;
		 
	}
	
} 
