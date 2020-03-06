package com.codechallenge.springboot.app.accounts.exception;

@SuppressWarnings("serial")
public class EbankOpException extends Exception{
	public EbankOpException() {}
	
	public EbankOpException(String msg, Throwable e) {
		super(msg, e);
	}

}
