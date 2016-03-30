package com.company.hospitalitymanagement.daoImpl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.hospitalitymanagement.dao.TenantDao;
import com.company.hospitalitymanagement.entity.Tenant;

/**
 * @author M1030758
 *
 */
@Repository("TenantRepository")
@Transactional
public class TenantDaoImpl implements TenantDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public void saveTenant(Tenant tenant) {
		
		Session session = sessionFactory.getCurrentSession();
		session.save(tenant);
	}

}
