/**
 */
package eu.paasage.camel.unit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.unit.UnitPackage#getUnitType()
 * @model
 * @generated
 */
public enum UnitType implements Enumerator {
	/**
	 * The '<em><b>BYTES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES(0, "BYTES", "BYTES"),

	/**
	 * The '<em><b>BYTES PER SECOND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES_PER_SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES_PER_SECOND(1, "BYTES_PER_SECOND", "BYTES_PER_SECOND"),

	/**
	 * The '<em><b>KILOBYTES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KILOBYTES_VALUE
	 * @generated
	 * @ordered
	 */
	KILOBYTES(2, "KILOBYTES", "KILOBYTES"),

	/**
	 * The '<em><b>MEGABYTES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEGABYTES_VALUE
	 * @generated
	 * @ordered
	 */
	MEGABYTES(3, "MEGABYTES", "MEGABYTES"),

	/**
	 * The '<em><b>GIGABYTES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIGABYTES_VALUE
	 * @generated
	 * @ordered
	 */
	GIGABYTES(4, "GIGABYTES", "GIGABYTES"),

	/**
	 * The '<em><b>MILLISECONDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILLISECONDS_VALUE
	 * @generated
	 * @ordered
	 */
	MILLISECONDS(5, "MILLISECONDS", "MILLISECONDS"),

	/**
	 * The '<em><b>SECONDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECONDS_VALUE
	 * @generated
	 * @ordered
	 */
	SECONDS(6, "SECONDS", "SECONDS"),

	/**
	 * The '<em><b>MINUTES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUTES_VALUE
	 * @generated
	 * @ordered
	 */
	MINUTES(7, "MINUTES", "MINUTES"),

	/**
	 * The '<em><b>HOURS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOURS_VALUE
	 * @generated
	 * @ordered
	 */
	HOURS(8, "HOURS", "HOURS"),

	/**
	 * The '<em><b>DAYS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYS_VALUE
	 * @generated
	 * @ordered
	 */
	DAYS(9, "DAYS", "DAYS"),

	/**
	 * The '<em><b>WEEKS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEEKS_VALUE
	 * @generated
	 * @ordered
	 */
	WEEKS(10, "WEEKS", "WEEKS"),

	/**
	 * The '<em><b>MONTHS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTHS_VALUE
	 * @generated
	 * @ordered
	 */
	MONTHS(11, "MONTHS", "MONTHS"),

	/**
	 * The '<em><b>REQUESTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUESTS_VALUE
	 * @generated
	 * @ordered
	 */
	REQUESTS(12, "REQUESTS", "REQUESTS"),

	/**
	 * The '<em><b>REQUESTS PER SECOND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUESTS_PER_SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	REQUESTS_PER_SECOND(13, "REQUESTS_PER_SECOND", "REQUESTS_PER_SECOND"),

	/**
	 * The '<em><b>TRANSACTIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTIONS(14, "TRANSACTIONS", "TRANSACTIONS"),

	/**
	 * The '<em><b>TRANSACTIONS PER SECOND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTIONS_PER_SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTIONS_PER_SECOND(15, "TRANSACTIONS_PER_SECOND", "TRANSACTIONS_PER_SECOND"),

	/**
	 * The '<em><b>CORES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORES_VALUE
	 * @generated
	 * @ordered
	 */
	CORES(16, "CORES", "CORES"),

	/**
	 * The '<em><b>PERCENTAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENTAGE(17, "PERCENTAGE", "PERCENTAGE"),

	/**
	 * The '<em><b>EUROS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EUROS_VALUE
	 * @generated
	 * @ordered
	 */
	EUROS(18, "EUROS", "EUROS"),

	/**
	 * The '<em><b>POUNDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POUNDS_VALUE
	 * @generated
	 * @ordered
	 */
	POUNDS(19, "POUNDS", "POUNDS"),

	/**
	 * The '<em><b>DOLLARS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOLLARS_VALUE
	 * @generated
	 * @ordered
	 */
	DOLLARS(20, "DOLLARS", "DOLLARS");

	/**
	 * The '<em><b>BYTES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BYTES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BYTES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BYTES_VALUE = 0;

	/**
	 * The '<em><b>BYTES PER SECOND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BYTES PER SECOND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BYTES_PER_SECOND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BYTES_PER_SECOND_VALUE = 1;

	/**
	 * The '<em><b>KILOBYTES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KILOBYTES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KILOBYTES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KILOBYTES_VALUE = 2;

	/**
	 * The '<em><b>MEGABYTES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MEGABYTES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEGABYTES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEGABYTES_VALUE = 3;

	/**
	 * The '<em><b>GIGABYTES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GIGABYTES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GIGABYTES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GIGABYTES_VALUE = 4;

	/**
	 * The '<em><b>MILLISECONDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MILLISECONDS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MILLISECONDS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MILLISECONDS_VALUE = 5;

	/**
	 * The '<em><b>SECONDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SECONDS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECONDS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECONDS_VALUE = 6;

	/**
	 * The '<em><b>MINUTES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MINUTES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINUTES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MINUTES_VALUE = 7;

	/**
	 * The '<em><b>HOURS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HOURS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOURS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOURS_VALUE = 8;

	/**
	 * The '<em><b>DAYS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DAYS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAYS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAYS_VALUE = 9;

	/**
	 * The '<em><b>WEEKS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEEKS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEEKS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEEKS_VALUE = 10;

	/**
	 * The '<em><b>MONTHS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MONTHS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONTHS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MONTHS_VALUE = 11;

	/**
	 * The '<em><b>REQUESTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUESTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUESTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUESTS_VALUE = 12;

	/**
	 * The '<em><b>REQUESTS PER SECOND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUESTS PER SECOND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUESTS_PER_SECOND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUESTS_PER_SECOND_VALUE = 13;

	/**
	 * The '<em><b>TRANSACTIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRANSACTIONS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSACTIONS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTIONS_VALUE = 14;

	/**
	 * The '<em><b>TRANSACTIONS PER SECOND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRANSACTIONS PER SECOND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSACTIONS_PER_SECOND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTIONS_PER_SECOND_VALUE = 15;

	/**
	 * The '<em><b>CORES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CORES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CORES_VALUE = 16;

	/**
	 * The '<em><b>PERCENTAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERCENTAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERCENTAGE_VALUE = 17;

	/**
	 * The '<em><b>EUROS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EUROS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EUROS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EUROS_VALUE = 18;

	/**
	 * The '<em><b>POUNDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POUNDS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POUNDS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POUNDS_VALUE = 19;

	/**
	 * The '<em><b>DOLLARS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOLLARS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOLLARS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOLLARS_VALUE = 20;

	/**
	 * An array of all the '<em><b>Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitType[] VALUES_ARRAY =
		new UnitType[] {
			BYTES,
			BYTES_PER_SECOND,
			KILOBYTES,
			MEGABYTES,
			GIGABYTES,
			MILLISECONDS,
			SECONDS,
			MINUTES,
			HOURS,
			DAYS,
			WEEKS,
			MONTHS,
			REQUESTS,
			REQUESTS_PER_SECOND,
			TRANSACTIONS,
			TRANSACTIONS_PER_SECOND,
			CORES,
			PERCENTAGE,
			EUROS,
			POUNDS,
			DOLLARS,
		};

	/**
	 * A public read-only list of all the '<em><b>Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitType get(int value) {
		switch (value) {
			case BYTES_VALUE: return BYTES;
			case BYTES_PER_SECOND_VALUE: return BYTES_PER_SECOND;
			case KILOBYTES_VALUE: return KILOBYTES;
			case MEGABYTES_VALUE: return MEGABYTES;
			case GIGABYTES_VALUE: return GIGABYTES;
			case MILLISECONDS_VALUE: return MILLISECONDS;
			case SECONDS_VALUE: return SECONDS;
			case MINUTES_VALUE: return MINUTES;
			case HOURS_VALUE: return HOURS;
			case DAYS_VALUE: return DAYS;
			case WEEKS_VALUE: return WEEKS;
			case MONTHS_VALUE: return MONTHS;
			case REQUESTS_VALUE: return REQUESTS;
			case REQUESTS_PER_SECOND_VALUE: return REQUESTS_PER_SECOND;
			case TRANSACTIONS_VALUE: return TRANSACTIONS;
			case TRANSACTIONS_PER_SECOND_VALUE: return TRANSACTIONS_PER_SECOND;
			case CORES_VALUE: return CORES;
			case PERCENTAGE_VALUE: return PERCENTAGE;
			case EUROS_VALUE: return EUROS;
			case POUNDS_VALUE: return POUNDS;
			case DOLLARS_VALUE: return DOLLARS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private UnitType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //UnitType
