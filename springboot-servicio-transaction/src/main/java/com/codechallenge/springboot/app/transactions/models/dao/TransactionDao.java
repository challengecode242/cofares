package com.codechallenge.springboot.app.transactions.models.dao;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.codechallenge.springboot.app.transactions.models.entity.Transaction;


/***

 * Interface para Transacciones.

 * @author Jorge Vila

 */

public interface TransactionDao extends CrudRepository<Transaction, Long>{

    @Query("FROM Transaction ORDER BY ammount ASC")
    List<Transaction> findAllOrderByAmmountAsc();
    
    @Query("FROM Transaction ORDER BY ammount DESC")
    List<Transaction> findAllOrderByAmmountDesc();
    

}