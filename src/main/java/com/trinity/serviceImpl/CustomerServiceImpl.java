/**
 * 
 */
package com.trinity.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trinity.dao.CustomerDao;
import com.trinity.service.CustomerService;

/**
 * @author trinity-PC
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired CustomerDao customerDao;

	public String insert() {
		// TODO Auto-generated method stub
		return customerDao.insert();
	}
}
