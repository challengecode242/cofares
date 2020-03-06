package com.codechallenge.springboot.app.accounts.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codechallenge.springboot.app.accounts.models.data.AccountsRepository;
import com.codechallenge.springboot.app.accounts.models.entity.Account;
import com.codechallenge.springboot.app.accounts.models.service.IAccountService;


@RestController
public class AccountController {


	
	@Autowired
	private IAccountService accountService;
	

	@GetMapping("/accounts")
    public List<Account> listar(){
    	return accountService.findAll();
    }
	
	@GetMapping("/accounts/{id}")
	public Account detalle(@PathVariable Long id) {
		return accountService.findById(id);
	}
	
    	

}
