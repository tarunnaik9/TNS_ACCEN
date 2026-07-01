package com.shoppingmall.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingmall.customer.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer>{
	

}
