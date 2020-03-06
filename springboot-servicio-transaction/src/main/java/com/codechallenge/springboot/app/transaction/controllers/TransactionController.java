package com.codechallenge.springboot.app.transaction.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.codechallenge.springboot.app.transactions.models.entity.Transaction;
import com.codechallenge.springboot.app.transactions.models.service.ITransactionService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TransactionController {

	
	@Autowired
	private ITransactionService transactionService;
	

	@GetMapping("/transaction")
    public List<Transaction> listar(){
    	return transactionService.findAll();
    }
	
	@GetMapping("/transaction/{id}")
	public Transaction detalle(@PathVariable Long id) {
		return transactionService.findById(id);
	}
	
//    @GetMapping(value = "/ammountasc")
//    public List<Transaction> getTransactionByAmmountAsc() {
//
//        return transactionService.findAllOrderByAmmountAsc();
//    }
//    
//    @GetMapping(value = "/ammountdesc")
//    public List<Transaction> getTransactionByAmmountDesc() {
//
//        return transactionService.findAllOrderByAmmountDesc();
//    }
//    


}
