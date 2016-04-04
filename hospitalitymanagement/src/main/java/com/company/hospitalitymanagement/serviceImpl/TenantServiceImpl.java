package com.company.hospitalitymanagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.hospitalitymanagement.common.PropertyUtils;
import com.company.hospitalitymanagement.constants.HMConstants;
import com.company.hospitalitymanagement.dao.TenantDao;
import com.company.hospitalitymanagement.entity.Tenant;
import com.company.hospitalitymanagement.exception.HospitalityManagementException;
import com.company.hospitalitymanagement.service.TenanatService;

@Service("TenantService")
public class TenantServiceImpl implements TenanatService {
	@Autowired
	private TenantDao tenantDao;

	public void saveTenant(Tenant tenant) throws HospitalityManagementException {
		if (tenant.getTenantName() == "") {
			throw new HospitalityManagementException(Integer.parseInt(HMConstants.EMPTY_TENANT_NAME),
					PropertyUtils.getProperty(HMConstants.EMPTY_TENANT_NAME));
		} 
		
		else {
			tenantDao.saveTenant(tenant);
		}

	}

}
