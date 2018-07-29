package com.sap.demolist.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sap.demolist.bean.Customer;

import com.sap.demolist.service.CustomerService;


@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private  CustomerService customerService;
    private Integer tail;
	Map map = new HashMap();
    
    @RequestMapping("initlist/{head}") 
	public String searchInit(@PathVariable("head") Integer head,Model model) {
		       
		        
		        tail = head+1;
		        List<Customer>  customerlist =(List<Customer>)customerService.Search(head,tail);
		        model.addAttribute("list",customerlist);
                
		return "/infolist";
		
	} 

    
	@RequestMapping("nextlist/{head}") 
	@ResponseBody
	public Object searchList(@PathVariable("head") Integer head,Model model) {
		       
		        tail = head+1;
		        List<Customer>  customerlist =(List<Customer>)customerService.Search(head,tail);
		       
                System.out.println("success");
		        return customerlist;
		
	}

	
	
}
