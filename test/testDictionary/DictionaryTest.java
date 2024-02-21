/**
 * 
 */
package testDictionary;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import exceptions.InvalidKeyException;
import implementations.Dictionary;

/**
 * @author Simon Chan and Harry Yuen
 *
 */
public class DictionaryTest {
	//test objects
	Dictionary one;
	static Dictionary zero;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		zero = new Dictionary();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		zero = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		one = new Dictionary();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		one = null;
	}

	/**
	 * Test method for {@link implementations.Dictionary#Dictionary()}.
	 */
	@Test
	public void testDictionary() {
		assertNotNull("Dictionary object is not null", one);
	}

	/**
	 * Test method for {@link implementations.Dictionary#removeDict(java.lang.String)}.
	 * @throws InvalidKeyException 
	 */
	@Test
	public void testRemoveDict() throws InvalidKeyException {
		one.insertDict("testingkey", "testingtesting");
		one.removeDict("testingkey");
		assertEquals("Dictionary is empty", 0, one.getKeys().size());
	}

	/**
	 * Test method for {@link implementations.Dictionary#updateDict(java.lang.String)}.
	 * @throws InvalidKeyException 
	 */
	@Test
	public void testUpdateDict() throws InvalidKeyException {
		one.insertDict("testkey", "testupdatevalue");
		one.updateDict("testkey", "testedvalue");
		assertEquals("Value is updated", "testedvalue", one.lookUpDict("testkey") );
	}

	/**
	 * Test method for {@link implementations.Dictionary#insertDict(java.lang.String, java.lang.String)}.
	 * @throws InvalidKeyException 
	 */
	@Test
	public void testInsertDict() throws InvalidKeyException {
		one.insertDict("testkey", "testvalue");
		assertEquals("Key value pair is inserted", "testvalue", one.lookUpDict("testkey"));
	}

	/**
	 * Test method for {@link implementations.Dictionary#lookUpDict(java.lang.String)}.
	 * @throws InvalidKeyException 
	 */
	@Test
	public void testLookUpDict() throws InvalidKeyException {
		one.insertDict("testkey", "testvalue");
		String result = one.lookUpDict("testkey");
		assertEquals("Value is found", "testvalue", result);

	}

	/**
	 * Test method for {@link java.lang.Object#toString()}.
	 */
	@Test
	public void testToString() {
		// This will be a manual visual verification
		System.out.println( one.toString() );
	}

}
