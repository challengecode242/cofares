package com.codechallenge.springboot.app.accounts.exception;

public class EbankOpDaoException extends EbankOpException{
	public EbankOpDaoException() { }
	
	public EbankOpDaoException(String msg, Throwable e) {
		super(msg, e);
	}

}
