/*------------------------------------------------------------------------------
 *******************************************************************************
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.company.hospitalitymanagement.response;

public final class ResponseHandler {
	
	
	public static ErrorResponse getFailedResponse(final int errorCode,final String message){
		final ErrorResponse er = new ErrorResponse();
		er.setErrorCode(errorCode);
		er.setMessage(message);
		er.setStatus("INTERNAL ERROR");
		return er;
	}

}
