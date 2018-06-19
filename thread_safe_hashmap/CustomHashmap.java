import java.util.HashMap;

public class CustomHashmap<K, V> extends HashMap<K, V>{

	private static final long serialVersionUID = 1L;
	
	@Override
	public V put(K key, V value) {
		V val = null;
		synchronized (key) {
			val = super.put(key, value);
		}
		
		return val;
	}
	
	@Override
	public V get(Object key) {
		return super.get(key);
	}
	

}
