package com.yourname.demo.model.dao.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import com.yourname.demo.model.Account;
import org.springframework.stereotype.Repository;
import com.yourname.demo.model.dao.AccountDao;
 
 
/**
 * DAO for table: Account.
 * @author autogenerated
 */
@Repository
public class AccountDaoImpl extends GenericHibernateDaoImpl<Account, Long> implements AccountDao {
	
	/** Constructor method. */
		public AccountDaoImpl() {
			super(Account.class);
		}
	}

