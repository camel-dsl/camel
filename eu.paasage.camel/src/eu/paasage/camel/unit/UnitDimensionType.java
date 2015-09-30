/**
 */
package eu.paasage.camel.unit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dimension Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.unit.UnitPackage#getUnitDimensionType()
 * @model
 * @generated
 */
public enum UnitDimensionType implements Enumerator {
	/**
	 * The '<em><b>TIME INTERVAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_INTERVAL_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_INTERVAL(0, "TIME_INTERVAL", "TIME_INTERVAL"),

	/**
	 * The '<em><b>STORAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	STORAGE(1, "STORAGE", "STORAGE"),

	/**
	 * The '<em><b>COST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COST_VALUE
	 * @generated
	 * @ordered
	 */
	COST(2, "COST", "COST"),

	/**
	 * The '<em><b>THROUGHPUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THROUGHPUT_VALUE
	 * @generated
	 * @ordered
	 */
	THROUGHPUT(3, "THROUGHPUT", "THROUGHPUT"),

	/**
	 * The '<em><b>REQUEST NUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_NUM_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_NUM(4, "REQUEST_NUM", "REQUEST_NUM"),

	/**
	 * The '<em><b>TRANSACTION NUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_NUM_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTION_NUM(5, "TRANSACTION_NUM", "TRANSACTION_NUM"),

	/**
	 * The '<em><b>DIMENSIONLESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIMENSIONLESS_VALUE
	 * @generated
	 * @ordered
	 */
	DIMENSIONLESS(6, "DIMENSIONLESS", "DIMENSIONLESS"),

	/**
	 * The '<em><b>CORE NUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORE_NUM_VALUE
	 * @generated
	 * @ordered
	 */
	CORE_NUM(7, "CORE_NUM", "CORE_NUM");

	/**
	 * The '<em><b>TIME INTERVAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME INTERVAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_INTERVAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_INTERVAL_VALUE = 0;

	/**
	 * The '<em><b>STORAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STORAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STORAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STORAGE_VALUE = 1;

	/**
	 * The '<em><b>COST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COST_VALUE = 2;

	/**
	 * The '<em><b>THROUGHPUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THROUGHPUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THROUGHPUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THROUGHPUT_VALUE = 3;

	/**
	 * The '<em><b>REQUEST NUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUEST NUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_NUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_NUM_VALUE = 4;

	/**
	 * The '<em><b>TRANSACTION NUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRANSACTION NUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_NUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_NUM_VALUE = 5;

	/**
	 * The '<em><b>DIMENSIONLESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIMENSIONLESS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIMENSIONLESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIMENSIONLESS_VALUE = 6;

	/**
	 * The '<em><b>CORE NUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CORE NUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORE_NUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CORE_NUM_VALUE = 7;

	/**
	 * An array of all the '<em><b>Dimension Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitDimensionType[] VALUES_ARRAY =
		new UnitDimensionType[] {
			TIME_INTERVAL,
			STORAGE,
			COST,
			THROUGHPUT,
			REQUEST_NUM,
			TRANSACTION_NUM,
			DIMENSIONLESS,
			CORE_NUM,
		};

	/**
	 * A public read-only list of all the '<em><b>Dimension Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitDimensionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dimension Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnitDimensionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitDimensionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dimension Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnitDimensionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitDimensionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dimension Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnitDimensionType get(int value) {
		switch (value) {
			case TIME_INTERVAL_VALUE: return TIME_INTERVAL;
			case STORAGE_VALUE: return STORAGE;
			case COST_VALUE: return COST;
			case THROUGHPUT_VALUE: return THROUGHPUT;
			case REQUEST_NUM_VALUE: return REQUEST_NUM;
			case TRANSACTION_NUM_VALUE: return TRANSACTION_NUM;
			case DIMENSIONLESS_VALUE: return DIMENSIONLESS;
			case CORE_NUM_VALUE: return CORE_NUM;
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
	private UnitDimensionType(int value, String name, String literal) {
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
	
} //UnitDimensionType
