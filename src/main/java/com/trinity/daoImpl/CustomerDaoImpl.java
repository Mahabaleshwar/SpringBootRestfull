/**
 * 
 */
package com.trinity.daoImpl;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.trinity.dao.CustomerDao;

/**
 * @author trinity-PC
 *
 */
@Repository
public class CustomerDaoImpl extends JdbcDaoSupport implements CustomerDao {
	
	@Autowired private DataSource dataSource;
	
	@PostConstruct
	public void initialize(){
		setDataSource(dataSource);
	}

	public String insert(){
		String s=null;
		String sql="INSERT INTO iot.customer( name, age)VALUES ( ?, ?)";
		try{
		int update = getJdbcTemplate().update(sql,new Object[]{"Bali",26});
		s="Successfully Inserted";
		}
		catch(Exception e){
			s="Successfully Not inserted";	
		}
		return s;
	}
}
