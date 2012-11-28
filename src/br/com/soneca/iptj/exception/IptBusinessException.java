package br.com.soneca.iptj.exception;

public class IptBusinessException extends Exception {

	public IptBusinessException(Throwable t){
		super(t);
	}
	
	public IptBusinessException(String errorMessage, Throwable t){
		super(errorMessage, t);
	}
}
