package example3;

public class Container <K, V> {
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	
	
	public void set(K Key, V value) {
		this.key = Key;
		this.value = value;
	}
}
