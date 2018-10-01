package com.briup.test;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.briup.bean.Address;
import com.briup.bean.Customer;
import com.briup.dao.ICustomerMapper;
import com.briup.util.MyBatisSqlSessionFactory;

 

public class CustomerTest {
	SqlSession sqlsession=null;
	ICustomerMapper iCustomerMapper=null;
	@Before
	public void before(){		
			try {
				sqlsession=MyBatisSqlSessionFactory.getSqlSession();
				iCustomerMapper=sqlsession.getMapper(ICustomerMapper.class);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	@After
	public void commitSession(){
		sqlsession.commit();
		sqlsession.close();
	}
	@Test
	public void saveCustomer(){		
			try {
				Address address=new Address("江苏","苏州","昆山");
				Customer customer=new Customer(1,"贾俊红","1617",new Date(),address);		
				iCustomerMapper.saveCustomer(customer);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	@Test
	public void selectCustomerId(){
		Customer customer=iCustomerMapper.selectCustomerId(1);
		System.out.println(customer);
		
	}
	@Test
	public void saveCustomer2(){		
			try {
				Customer customer=new Customer();
//				customer.setId(1);
				customer.setUsername("tom");
				customer.setPassword("q22");
				customer.setDob(new Date());
				Address address=new Address("江苏","苏州","昆山");
				customer.setAddress(address);
				iCustomerMapper.saveCustomer(customer);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
}
