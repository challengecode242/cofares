package com.codechallenge.springboot.app.customers.exception;

public class EbankOpDaoException extends EbankOpException{
	public EbankOpDaoException() { }
	
	public EbankOpDaoException(String msg, Throwable e) {
		super(msg, e);
	}

}
