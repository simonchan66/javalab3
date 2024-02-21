package utilities;

import exceptions.InvalidKeyException;

/**
* DictionaryADT.java
*
* @author Simon Chan, Harry Yuen
* @version major.minor revision number starting at 1.0
* 
* Class Definition: This interface represents the public contract for the
* implementation of Dictionary for the DictionaryADT Lab. 
*/

public interface DictionaryADT<K,V>
{
	/**
	 * Inserts a key, value pair into the dictionary.
	 * 
	 * Precondition: Key must not be null, Key must not already exist in dictionary.
	 * 
	 * Postcondition: The key, value pair is inserted into dictionary.
	 * 
	 * @param key the key to insert into the dictionary.
	 * @param value the value to associate with the key.
	 * @exception InvalidKeyException is thrown if key is null or key already exist.
	 */
	
	public void insertDict(K key, V value) throws InvalidKeyException;
	
	/**
	 * Remove key, value pair from the dictionary based on the key.
	 * 
	 * Precondition: Key must not be null, Key must already exist in dictionary.
	 * 
	 * Postcondition: The key, value pair based on the key is successfully removed.
	 * 
	 * @param key the specific key whose pair is to be removed from dictionary
	 * @exception InvalidKeyException is thrown if key is null or key does not exist.
	 */
	
	public void removeDict(K key) throws InvalidKeyException;
	/**
	 * Mutator method to update value of existing key in the dictionary
	 * 
	 * Precondition: Key must not be null, Key must not already exist in dictionary. Value must not be null.
	 * 
	 * Postcondition: The value of the key is successfully updated.
	 * 
	 * @param key the key whose value is to be updated
	 * @param value the value to be updated to the key
	 * @exception InvalidKeyException is thrown if key is null or key does not exist.
	 */
	
	public void updateDict(K key, V value) throws InvalidKeyException;
	/**
	 * Mutator method to look up the value based on the key.
	 * 
	 * Precondition: Key must not be null, Key must already exist in dictionary.
	 * 
	 * Postcondition: The value associated with the specified key is returned.
	 * 
	 * @param key the key whose value is to be returned
	 * @return the value associated with the specific key
	 * @exception InvalidKeyException is thrown if key is null or key does not exist.
	 */
	
	public String lookUpDict(K key) throws InvalidKeyException;

}
