/**
 * 
 */
package com.company.hospitalitymanagement.resources;

import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.company.hospitalitymanagement.entity.Tenant;

/**
 * @author sari
 *
 */
@Controller
public class TestController
{

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
	 */
	@RequestMapping(value = "/savetenant", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
	public ResponseEntity<Tenant> saveTenant(@RequestBody Tenant tenant)
	{
		System.out.println(tenant);
		return new ResponseEntity<Tenant>(tenant, HttpStatus.OK);

	}

}
