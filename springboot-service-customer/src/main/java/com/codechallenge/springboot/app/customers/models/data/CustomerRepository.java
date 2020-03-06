package com.codechallenge.springboot.app.customers.models.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codechallenge.springboot.app.customers.models.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
