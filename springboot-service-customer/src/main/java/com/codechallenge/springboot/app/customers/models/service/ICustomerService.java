package com.codechallenge.springboot.app.customers.models.service;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

import com.codechallenge.springboot.app.customers.models.entity.Customer;

public interface ICustomerService {
		public List<Customer> findAll();
		public Customer findById(Long id);
		List<Customer> findAllOrderByAmmountAsc();
		List<Customer> findAllOrderByAmmountDesc();
		//public Customer findByAccount(@Param("accountValue") String accountValue);
}