package com.yourname.demo.model.enums.db;
import java.util.Map;
import java.util.HashMap;
import com.felees.hbnpojogen.persistence.impl.StringValuedEnum;
/**
 * Defines the AccountAcTypeEnum enumeration.
 * 
 * @author autogenerated
 *
 */
public enum AccountAcTypeEnum  implements StringValuedEnum {

	/** Enum Constant. */
	CURRENT("Current"),
	/** Enum Constant. */
	SAVINGS("Savings"),
	/** Enum Constant. */
	FIXED("Fixed");
	/**
	 * Internal storage of status field value, see the Enum spec for
 	 * clarification.
 	 */
	private final String status;
	
	/**
	 * Enum constructor for ActiveState.
	 * @param state Value.
	 */
	AccountAcTypeEnum(final String state) {
		this.status = state;
	}
	
	/** Construct a map for reverse lookup. */
	private static Map<String, AccountAcTypeEnum> valueMap = new HashMap<String, AccountAcTypeEnum>();

    static {
    	// construct hashmap for later possible use.
        for (AccountAcTypeEnum unit : values()) {
            valueMap.put(unit.getValue(), unit);
        }
    }
    
	/**
	 * Current string value stored in the enum.
	 * 
	 * @return string value.
	 */
	public String getValue() {
		return this.status;
	}

	/**
     * Perform a reverse lookup (given a value, obtain the enum).
     * 
     * @param value to search
     * @return Enum object.
     */
    public static AccountAcTypeEnum lookupEnum(String value) {
        return AccountAcTypeEnum.valueMap.get(value);
    }
}
