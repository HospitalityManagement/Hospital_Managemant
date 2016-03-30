package com.company.hospitalitymanagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.hospitalitymanagement.dao.TenantDao;
import com.company.hospitalitymanagement.entity.Tenant;
import com.company.hospitalitymanagement.service.TenanatService;

@Service("TenantService")
public class TenantServiceImpl implements TenanatService{

	@Autowired
	private TenantDao tenantDao;

	public void saveTenant(Tenant tenant) {
		// TODO Auto-generated method stub
		tenantDao.saveTenant(tenant);
	}

}
