package com.codechallenge.springboot.app.customers.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codechallenge.springboot.app.customers.models.dao.CustomerDao;
import com.codechallenge.springboot.app.customers.models.entity.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Transactional(readOnly = true)
	public List<Customer> findAll() {

		return (List<Customer>)customerDao.findAll();

	}

	@Transactional(readOnly = true)
	public Customer findById(Long id) {
		return customerDao.findById(id).orElse(null);
	}


    @Override
    public List<Customer> findAllOrderByAmmountAsc() {
        return customerDao.findAllOrderByAmmountAsc();
    }
    
    @Override
    public List<Customer> findAllOrderByAmmountDesc() {
        return customerDao.findAllOrderByAmmountDesc();
    }
    
//    @Override
//    public Customer findByAccount(String account) {
//        return customerDao.findByAccount(account);
//    }


}