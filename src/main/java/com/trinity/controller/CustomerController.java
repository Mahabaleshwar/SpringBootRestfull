/**
 * 
 */
package com.trinity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.trinity.service.CustomerService;

/**
 * @author trinity-PC
 *
 */
@RestController
public class CustomerController {
	
	@Autowired CustomerService customerService;
	
	@RequestMapping(value="/" , method=RequestMethod.GET)
	public String m1(){
		System.out.println("Hi Hello World.");
		String s="Hi Hello Wrold.";
		return s;
	}
	@RequestMapping(value="/hello" , method=RequestMethod.GET)
	public String m2(){
		System.out.println("Hi Hello World3333333333333333333.");
		String s="Hi Hello Wrold333333333333333333333333.";
		return s;
	}
	@RequestMapping(value="/insert" , method=RequestMethod.GET)
	public String insert(){
		String insert = customerService.insert();
		return insert;
	}

}
