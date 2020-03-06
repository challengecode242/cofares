package com.codechallenge.springboot.app.customers.models.dao;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.codechallenge.springboot.app.customers.models.entity.Customer;



/***

 * Interface para Customers.

 * @author Jorge Vila

 */

public interface CustomerDao extends CrudRepository<Customer, Long>{

    @Query("FROM Customer ORDER BY ammount ASC")
    List<Customer> findAllOrderByAmmountAsc();
    
    @Query("FROM Customer ORDER BY ammount DESC")
    List<Customer> findAllOrderByAmmountDesc();
    
   // @Query("SELECT Customer FROM Customer WHERE customer=:customerValue")
    //Customer findByAccount(@Param("customerValue") String customerValue);

}