package com.sap.demolist.dao;

import java.util.List;

import com.sap.demolist.bean.Customer;


public interface CustomerDao { 

	        public  List<Customer> selectById(Integer head,Integer tail);
	   
} 