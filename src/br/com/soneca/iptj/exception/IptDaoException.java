package br.com.soneca.iptj.exception;

public class IptDaoException extends Exception {
	
	private static final long serialVersionUID = 7085700970543337689L;

	public IptDaoException(Throwable t){
		super(t);
	}
	
	public IptDaoException(String errorMessage, Throwable t){
		super(errorMessage, t);
	}
	
}
