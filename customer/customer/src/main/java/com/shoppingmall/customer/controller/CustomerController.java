package com.shoppingmall.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingmall.customer.entity.Customer;
import com.shoppingmall.customer.service.CustomerService;

@RestController

public class CustomerController {

	@Autowired

	public CustomerService service;

	

	@PostMapping("/addCustomer")

	public Customer regCustomer(@RequestBody Customer customer) {

		return service.addCustomer(customer);

	}

	

	@GetMapping("/getCustomer")

	public List<Customer> getCustomer()

	{

		return service.getCustomer();

	}



	@PutMapping("/updateCustomer")

	public Customer updateCustomer(@RequestBody Customer customer)

	{        

		return service.updateCustomer(customer);

	}

	

	@DeleteMapping("/deleteCustomer/{id}")

	public void deleteCustomer(@PathVariable Integer id) {

		service.deleteCustomer(id);

	}

}