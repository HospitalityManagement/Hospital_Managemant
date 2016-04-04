
package com.company.hospitalitymanagement.response;

public class ErrorResponse {
	
	private String status;
	
	private int errorCode;
	
	private String message;

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the errorCode
	 */
	public int getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the errorMessage
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
