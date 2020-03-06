package com.codechallenge.springboot.app.accounts.models.service;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

import com.codechallenge.springboot.app.accounts.models.entity.Account;

public interface IAccountService {
		public List<Account> findAll();
		public Account findById(Long id);
//		List<Accounts> findAllOrderByAmmountAsc();
//		List<Accounts> findAllOrderByAmmountDesc();

}