package com.shoppingmall.customer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Customer {
	@Id
	private int c_id;
	private String c_name;
	private String c_order_id;
	private String c_phone_number;
	private String c_email;
	
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_order_id() {
		return c_order_id;
	}
	public void setC_order_id(String c_order_id) {
		this.c_order_id = c_order_id;
	}
	public String getC_phone_number() {
		return c_phone_number;
	}
	public void setC_phone_number(String c_phone_number) {
		this.c_phone_number = c_phone_number;
	}
	public String getC_email() {
		return c_email;
	}
	public void setC_email(String c_email) {
		this.c_email = c_email;
		
	}
	@Override
	public String toString() {
		return "Customer [c_id=" + c_id + ", c_name=" + c_name + ", c_order_id=" + c_order_id + ", c_phone_number="
				+ c_phone_number + ", c_email=" + c_email + "]";
	}

}
