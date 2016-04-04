/**
 * 
 */
package com.company.hospitalitymanagement.resources;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.company.hospitalitymanagement.dao.TenantDao;
import com.company.hospitalitymanagement.entity.Tenant;
import com.company.hospitalitymanagement.exception.HospitalityManagementException;
import com.company.hospitalitymanagement.response.ErrorResponse;
import com.company.hospitalitymanagement.response.ResponseHandler;
import com.company.hospitalitymanagement.serviceImpl.TenantServiceImpl;

/**
 * @author sari
 *
 */
@Controller
public class TestController
{
	
	
	@Autowired
	private TenantServiceImpl tenantServiceImpl;
	
	@Autowired
	private TenantDao tenantDao;
	
	@RequestMapping("/")
	public ModelAndView getIndexPage()
	{

		ModelAndView modelAndView = new ModelAndView("home");
		return modelAndView;

	}

	/**
	 * GET REQUEST
	 * 
	 * @return
	 */
	@RequestMapping(value = "/gettenant", method = RequestMethod.GET)
	public ResponseEntity<Tenant> getTenant()
	{
		// Check with post man : hit the url and get the data
		Tenant tenant = new Tenant();
		tenant.setTenantId("Apol1234");
		tenant.setTenantEmailId("apollo@gmail.com");
		tenant.setTenantAddress("viajyanagar");
		tenant.setTenantMobileNumber(8095583091L);
		tenant.setTenantName("Apollo");
		tenant.setTenantPassword("sariputra");
		return new ResponseEntity<Tenant>(tenant, HttpStatus.OK);
	}
	

	/**
	 * POST REQUEST
	 * 
	 * @return
	 * @throws HospitalityManagementException 
	 */
	@RequestMapping(value = "/savetenant", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
	public ResponseEntity<Tenant> saveTenant(@RequestBody Tenant tenant) throws HospitalityManagementException
	{
		
		
		//throw new HospitalityManagementException(200,"custome expection");		
		tenantServiceImpl.saveTenant(tenant);
		
		return new ResponseEntity<Tenant>(tenant, HttpStatus.OK);

	}
	
	@ExceptionHandler(HospitalityManagementException.class)
	protected ResponseEntity<ErrorResponse> handleInvalidRequest(HospitalityManagementException e, WebRequest request) {
		System.out.println("coming inside condtoller");
		final ErrorResponse errorResponse = ResponseHandler.getFailedResponse(e.getErrorCode(), e.getMessage());
		return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.OK);
		
	}


}
