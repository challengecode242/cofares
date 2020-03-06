package com.codechallenge.springboot.app.accounts.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codechallenge.springboot.app.accounts.models.dao.AccountDao;
import com.codechallenge.springboot.app.accounts.models.entity.Account;

@Service
public class AccountServiceImpl implements IAccountService {

	@Autowired
	private AccountDao accountDao;

	@Transactional(readOnly = true)
	public List<Account> findAll() {

		return (List<Account>)accountDao.findAll();

	}

	@Transactional(readOnly = true)
	public Account findById(Long id) {
		return accountDao.findById(id).orElse(null);
	}


//    @Override
//    public List<Accounts> findAllOrderByAmmountAsc() {
//        return accountDao.findAllOrderByAmmountAsc();
//    }
//    
//    @Override
//    public List<Accounts> findAllOrderByAmmountDesc() {
//        return accountDao.findAllOrderByAmmountDesc();
//    }
    

}