package com.yourname.demo.model;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import com.yourname.demo.model.enums.db.CustomerTransactionDrcrEnum;
import com.yourname.demo.model.iface.ICustomerTransaction;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.Type;
import org.hibernate.proxy.HibernateProxy;
import org.joda.time.DateTime;


/** 
 * Object mapping for hibernate-handled table: customer_transaction.
 * @author autogenerated
 */

@Entity
@Table(name = "customer_transaction")
public class CustomerTransaction implements Cloneable, Serializable, IPojoGenEntity, ICustomerTransaction {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559029077L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Long> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Long>());
	
	/** hashCode temporary storage. */
	private volatile Long hashCode;
	

	/** Field mapping. */
	private java.math.BigDecimal amount;
	/** Field mapping. */
	private Customer customer;
	/** Field mapping. */
	private Account destinationAccount;
	/** Field mapping. */
	private CustomerTransactionDrcrEnum drcr;
	/** Field mapping. */
	private Long id = 0L; // init for hibernate bug workaround
	/** Field mapping. */
	private Account originatingAccount;
	/** Field mapping. */
	private DateTime transactionDate;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public CustomerTransaction() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public CustomerTransaction(Long id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param amount java.math.BigDecimal object;
	 * @param customer Customer object;
	 * @param destinationAccount Account object;
	 * @param drcr CustomerTransactionDrcrEnum object;
	 * @param id Long object;
	 * @param originatingAccount Account object;
	 * @param transactionDate DateTime object;
	 */
	public CustomerTransaction(java.math.BigDecimal amount, Customer customer, Account destinationAccount, 					
			CustomerTransactionDrcrEnum drcr, Long id, Account originatingAccount, 					
			DateTime transactionDate) {

		this.amount = amount;
		this.customer = customer;
		this.destinationAccount = destinationAccount;
		this.drcr = drcr;
		this.id = id;
		this.originatingAccount = originatingAccount;
		this.transactionDate = transactionDate;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return CustomerTransaction.class;
	}
 

    /**
     * Return the value associated with the column: amount.
	 * @return A java.math.BigDecimal object (this.amount)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public java.math.BigDecimal getAmount() {
		return this.amount;
		
	}
	

  
    /**  
     * Set the value related to the column: amount.
	 * @param amount the amount value you wish to set
	 */
	public void setAmount(final java.math.BigDecimal amount) {
		this.amount = amount;
	}

    /**
     * Return the value associated with the column: customer.
	 * @return A Customer object (this.customer)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "customer_id", nullable = false )
	public Customer getCustomer() {
		return this.customer;
		
	}
	

  
    /**  
     * Set the value related to the column: customer.
	 * @param customer the customer value you wish to set
	 */
	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}

    /**
     * Return the value associated with the column: destinationAccount.
	 * @return A Account object (this.destinationAccount)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "destination_account", nullable = false )
	public Account getDestinationAccount() {
		return this.destinationAccount;
		
	}
	

  
    /**  
     * Set the value related to the column: destinationAccount.
	 * @param destinationAccount the destinationAccount value you wish to set
	 */
	public void setDestinationAccount(final Account destinationAccount) {
		this.destinationAccount = destinationAccount;
	}

    /**
     * Return the value associated with the column: drcr.
	 * @return A CustomerTransactionDrcrEnum object (this.drcr)
	 */
	@Enumerated(EnumType.STRING)
	@Basic( optional = false )
	@Column( nullable = false  )
	public CustomerTransactionDrcrEnum getDrcr() {
		return this.drcr;
		
	}
	

  
    /**  
     * Set the value related to the column: drcr.
	 * @param drcr the drcr value you wish to set
	 */
	public void setDrcr(final CustomerTransactionDrcrEnum drcr) {
		this.drcr = drcr;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Long object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic( optional = false )
	@Column( name = "id", nullable = false  )
	public Long getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Long id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0L) &&
				(id != null) &&
				(this.hashCode != null) ) {
		SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}

    /**
     * Return the value associated with the column: originatingAccount.
	 * @return A Account object (this.originatingAccount)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "originating_account", nullable = false )
	public Account getOriginatingAccount() {
		return this.originatingAccount;
		
	}
	

  
    /**  
     * Set the value related to the column: originatingAccount.
	 * @param originatingAccount the originatingAccount value you wish to set
	 */
	public void setOriginatingAccount(final Account originatingAccount) {
		this.originatingAccount = originatingAccount;
	}

    /**
     * Return the value associated with the column: transactionDate.
	 * @return A DateTime object (this.transactionDate)
	 */
	@Type(type="org.joda.time.contrib.hibernate.PersistentDateTime")
	@Basic( optional = false )
	@Column( name = "transaction_date", nullable = false  )
	public DateTime getTransactionDate() {
		return this.transactionDate;
		
	}
	

  
    /**  
     * Set the value related to the column: transactionDate.
	 * @param transactionDate the transactionDate value you wish to set
	 */
	public void setTransactionDate(final DateTime transactionDate) {
		this.transactionDate = transactionDate;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public CustomerTransaction clone() throws CloneNotSupportedException {
		
        final CustomerTransaction copy = (CustomerTransaction)super.clone();

		copy.setAmount(this.getAmount());
		copy.setCustomer(this.getCustomer());
		copy.setDestinationAccount(this.getDestinationAccount());
		copy.setDrcr(this.getDrcr());
		copy.setId(this.getId());
		copy.setOriginatingAccount(this.getOriginatingAccount());
		copy.setTransactionDate(this.getTransactionDate());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("amount: " + this.getAmount() + ", ");
		sb.append("drcr: " + this.getDrcr() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("transactionDate: " + this.getTransactionDate());
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final CustomerTransaction that; 
		try {
			that = (CustomerTransaction) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((getAmount() == null) && (that.getAmount() == null)) || (getAmount() != null && getAmount().equals(that.getAmount())));
		result = result && (((getCustomer() == null) && (that.getCustomer() == null)) || (getCustomer() != null && getCustomer().getId().equals(that.getCustomer().getId())));	
		result = result && (((getDestinationAccount() == null) && (that.getDestinationAccount() == null)) || (getDestinationAccount() != null && getDestinationAccount().getId().equals(that.getDestinationAccount().getId())));	
		result = result && (((getDrcr() == null) && (that.getDrcr() == null)) || (getDrcr() != null && getDrcr().equals(that.getDrcr())));
		result = result && (((getOriginatingAccount() == null) && (that.getOriginatingAccount() == null)) || (getOriginatingAccount() != null && getOriginatingAccount().getId().equals(that.getOriginatingAccount().getId())));	
		result = result && (((getTransactionDate() == null) && (that.getTransactionDate() == null)) || (getTransactionDate() != null && getTransactionDate().equals(that.getTransactionDate())));
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if ( this.hashCode == null ) {
			synchronized ( this ) {
				if ( this.hashCode == null ) {
					Long newHashCode = null;

					if ( getId() != null ) {
					newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0L) {
							newHashCode = getId();
						} else {
							newHashCode = (long) super.hashCode();

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
		return (int) (this.hashCode & 0xffffff);
	}
	

	
}
