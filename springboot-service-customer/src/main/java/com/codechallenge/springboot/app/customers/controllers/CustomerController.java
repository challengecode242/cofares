package com.codechallenge.springboot.app.customers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codechallenge.springboot.app.customers.models.data.CustomerRepository;
import com.codechallenge.springboot.app.customers.models.entity.Customer;
import com.codechallenge.springboot.app.customers.models.service.ICustomerService;


@RestController
public class CustomerController {

	@Autowired
	private ICustomerService customerService;
	

	@GetMapping("/customer")
    public List<Customer> listar(){
    	return customerService.findAll();
    }
	
	@GetMapping("/customer/{id}")
	public Customer detalle(@PathVariable Long id) {
		return customerService.findById(id);
	}
	
//	 @PostMapping("/customer")
//	  Customer newCustomer(@RequestBody Customer newCustomer) {
//	    return customerService.save(newCustomer);
//	  }
	

}
