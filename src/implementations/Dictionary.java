package implementations;

import java.util.ArrayList;
import exceptions.InvalidKeyException;
import utilities.DictionaryADT;

public class Dictionary<K, V> implements DictionaryADT<K, V> {
	// constant
	private static final int DEFAULT_SIZE = 10;

	// index indicates pairing, e.g. keys[1] is stored at values[1]
	private ArrayList<K> keys;
	private ArrayList<V> values;

	// Constructor for the Dictionary class, initializes the keys and values
	// ArrayLists
	public Dictionary() {
		keys = new ArrayList<>(DEFAULT_SIZE);
		values = new ArrayList<>(DEFAULT_SIZE);
	}

	public ArrayList<K> getKeys() {
		return keys;
	}
	public ArrayList<V> getValues() {
		return values;
	}

	@Override
	public void insertDict(K key, V value) throws InvalidKeyException {
		if (keys.contains(key)) {
			throw new InvalidKeyException("Key already exists in the dictionary");
		}
		if (key == null) {
			throw new InvalidKeyException("key cannot be null");
		}
		keys.add(key);
		values.add(value);
	}

	@Override
	public void removeDict(K key) throws InvalidKeyException {
if (key == null) {
			throw new InvalidKeyException("key cannot be null");
		}
		if (!keys.contains(key)) {
			throw new InvalidKeyException("Key does not exist in the dictionary");
		}
		int index = keys.indexOf(key);
		keys.remove(index);
		values.remove(index);
	}

	@Override
	public void updateDict(K key, V value) throws InvalidKeyException{
		if (key == null) {
			throw new InvalidKeyException("key cannot be null");
		}
		if (!keys.contains(key)) {
			throw new InvalidKeyException("Key does not exist in the dictionary");
		}
		if (value == null) {
			throw new InvalidKeyException("value cannot be null");
		}
		values.set(keys.indexOf(key), value);
	}

	@Override
	public String lookUpDict(K key) throws InvalidKeyException{
		if (key == null) {
			throw new InvalidKeyException("key cannot be null");
		}
		if (!keys.contains(key)) {
			throw new InvalidKeyException("Key does not exist in the dictionary");
		}
		return values.get(keys.indexOf(key)).toString();
	}
}
