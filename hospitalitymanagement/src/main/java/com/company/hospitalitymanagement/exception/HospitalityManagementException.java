package com.company.hospitalitymanagement.exception;

public class HospitalityManagementException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private int errorCode;
	
	public HospitalityManagementException(final int errorCode,final String errorMessage,final Throwable error){
		super(errorMessage, error);
		this.errorCode = errorCode;
	}
	
	public HospitalityManagementException(final int errorCode,final String errorMessage){
		super(errorMessage);
		this.errorCode = errorCode;
	}
	
	public int getErrorCode(){
		return errorCode;
	}

}
