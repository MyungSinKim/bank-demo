package com.yourname.demo.model.iface;
import com.yourname.demo.model.Account;
import com.yourname.demo.model.Customer;
import com.yourname.demo.model.enums.db.CustomerTransactionDrcrEnum;
import org.joda.time.DateTime;


/** 
 * Object interface mapping for hibernate-handled table: customer_transaction.
 * @author autogenerated
 */

public interface ICustomerTransaction {



    /**
     * Return the value associated with the column: amount.
	 * @return A java.math.BigDecimal object (this.amount)
	 */
	java.math.BigDecimal getAmount();
	

  
    /**  
     * Set the value related to the column: amount.
	 * @param amount the amount value you wish to set
	 */
	void setAmount(final java.math.BigDecimal amount);

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
     * Return the value associated with the column: destinationAccount.
	 * @return A Account object (this.destinationAccount)
	 */
	Account getDestinationAccount();
	

  
    /**  
     * Set the value related to the column: destinationAccount.
	 * @param destinationAccount the destinationAccount value you wish to set
	 */
	void setDestinationAccount(final Account destinationAccount);

    /**
     * Return the value associated with the column: drcr.
	 * @return A CustomerTransactionDrcrEnum object (this.drcr)
	 */
	CustomerTransactionDrcrEnum getDrcr();
	

  
    /**  
     * Set the value related to the column: drcr.
	 * @param drcr the drcr value you wish to set
	 */
	void setDrcr(final CustomerTransactionDrcrEnum drcr);

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

    /**
     * Return the value associated with the column: originatingAccount.
	 * @return A Account object (this.originatingAccount)
	 */
	Account getOriginatingAccount();
	

  
    /**  
     * Set the value related to the column: originatingAccount.
	 * @param originatingAccount the originatingAccount value you wish to set
	 */
	void setOriginatingAccount(final Account originatingAccount);

    /**
     * Return the value associated with the column: transactionDate.
	 * @return A DateTime object (this.transactionDate)
	 */
	DateTime getTransactionDate();
	

  
    /**  
     * Set the value related to the column: transactionDate.
	 * @param transactionDate the transactionDate value you wish to set
	 */
	void setTransactionDate(final DateTime transactionDate);

	// end of interface
}