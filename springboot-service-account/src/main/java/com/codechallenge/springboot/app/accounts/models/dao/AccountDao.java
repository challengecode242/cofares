package com.codechallenge.springboot.app.accounts.models.dao;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.codechallenge.springboot.app.accounts.models.entity.Account;



/***

 * Interface para Accounts.

 * @author Jorge Vila

 */

public interface AccountDao extends CrudRepository<Account, Long>{

    @Query("FROM Account ORDER BY ammount ASC")
    List<Account> findAllOrderByAmmountAsc();
    
    @Query("FROM Account ORDER BY ammount DESC")
    List<Account> findAllOrderByAmmountDesc();
    
//    @Query("SELECT IBAN FROM Account WHERE account=:accountValue")
//    Account findByAccount(@Param("accountValue") String accountValue);

}