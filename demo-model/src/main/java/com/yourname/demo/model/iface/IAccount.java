package com.yourname.demo.model.iface;
import com.yourname.demo.model.Customer;
import com.yourname.demo.model.CustomerTransaction;
import com.yourname.demo.model.enums.db.AccountAcTypeEnum;
import java.util.Set;


/** 
 * Object interface mapping for hibernate-handled table: account.
 * @author autogenerated
 */

public interface IAccount {



    /**
     * Return the value associated with the column: acType.
	 * @return A AccountAcTypeEnum object (this.acType)
	 */
	AccountAcTypeEnum getAcType();
	

  
    /**  
     * Set the value related to the column: acType.
	 * @param acType the acType value you wish to set
	 */
	void setAcType(final AccountAcTypeEnum acType);

    /**
     * Return the value associated with the column: balance.
	 * @return A java.math.BigDecimal object (this.balance)
	 */
	java.math.BigDecimal getBalance();
	

  
    /**  
     * Set the value related to the column: balance.
	 * @param balance the balance value you wish to set
	 */
	void setBalance(final java.math.BigDecimal balance);

    /**
     * Return the value associated with the column: customer.
	 * @return A Customer object (this.customer)
	 */
	Customer getCustomer();
	

  
    /**  
     * Set the value related to the column: customer.
	 * @param customer the customer value you wish to set
	 */
	void setCustomer(final Customer customer);

    /**
     * Return the value associated with the column: customerTransaction.
	 * @return A Set&lt;CustomerTransaction&gt; object (this.customerTransaction)
	 */
	Set<CustomerTransaction> getCustomerTransactions();
	
	/**
	 * Adds a bi-directional link of type CustomerTransaction to the customerTransactions set.
	 * @param customerTransaction item to add
	 */
	void addCustomerTransaction(CustomerTransaction customerTransaction);

  
    /**  
     * Set the value related to the column: customerTransaction.
	 * @param customerTransaction the customerTransaction value you wish to set
	 */
	void setCustomerTransactions(final Set<CustomerTransaction> customerTransaction);

    /**
     * Return the value associated with the column: id.
	 * @return A Long object (this.id)
	 */
	Long getId();
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	void setId(final Long id);

	// end of interface
}