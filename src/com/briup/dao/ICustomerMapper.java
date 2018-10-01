package com.briup.dao;
import com.briup.bean.Customer;

public interface ICustomerMapper {
	public void saveCustomer(Customer customer);
	public Customer selectCustomerId(Integer id);
	public void saveCustomer2(Customer customer);
}
