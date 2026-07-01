package com.shoppingmall.customer.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingmall.customer.entity.Customer;
import com.shoppingmall.customer.repository.CustomerRepo;


@Service
public class CustomerService {
	@Autowired
	public CustomerRepo crepo;
	
	//create
	public Customer addCustomer(Customer customer) {
		return crepo.save(customer);
	}
	//read
	public List<Customer> getCustomer()
	{
		return 
				crepo.findAll();
	}
	//update
	public  Customer updateCustomer( Customer customer)
	{
		Integer c_id = customer.getC_id();
		 Customer customer1 = crepo.findById(c_id).get();
		 customer1.setC_name(customer.getC_name());
		 customer1.setC_order_id(customer.getC_order_id());
		 customer1.setC_phone_number(customer.getC_phone_number());
		 customer1.setC_email(customer.getC_email());
		return crepo.save(customer1);
	}
	//delete
	public void deleteCustomer(Integer id)
	{
		crepo.deleteById(id);
	}
}







