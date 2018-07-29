package com.sap.demolist.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.jsp.tagext.IterationTag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sap.demolist.bean.Customer;
import com.sap.demolist.dao.CustomerDao;



@Service
public class CustomerService {
	          List listtest = new ArrayList();
	          List list = new ArrayList();
	          List linkedlist =   new LinkedList();
	          Set hashset =  new HashSet();
	          Set treeset = new TreeSet();
	          Map hashtable =  new Hashtable();
	          Iterator it =list.iterator();
	          @Autowired
	          private  CustomerDao customerDao ;
	          
	          
	           public  List<Customer>  Search(Integer head,Integer tail) {
	        	               System.out.println("This is the 1 add");
	        	               System.out.println("This is the 2 add");
	        	               System.out.println("This is the 3 add");
	        	               System.out.println("This is the 4");
	        	               System.out.println("This is the 5");
			               System.out.println("This is the 6");
			               System.out.println("This is the 7");
			               System.out.println("This is the 1111111111");
			   
	        	               return  customerDao.selectById(head,tail);
	           }

			

}
