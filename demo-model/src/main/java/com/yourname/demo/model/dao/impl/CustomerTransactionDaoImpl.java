package com.yourname.demo.model.dao.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import com.yourname.demo.model.CustomerTransaction;
import org.springframework.stereotype.Repository;
import com.yourname.demo.model.dao.CustomerTransactionDao;
 
 
/**
 * DAO for table: CustomerTransaction.
 * @author autogenerated
 */
@Repository
public class CustomerTransactionDaoImpl extends GenericHibernateDaoImpl<CustomerTransaction, Long> implements CustomerTransactionDao {
	
	/** Constructor method. */
		public CustomerTransactionDaoImpl() {
			super(CustomerTransaction.class);
		}
	}

