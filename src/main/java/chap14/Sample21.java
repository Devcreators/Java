package chap14;

import java.util.HashMap;
import java.util.Map;

public class Sample21 {

	public static void main(String[] args) {
		// The value of the local variable name is not used
		String name = "빵형";
		
		// HashMap is a raw type. References to generic type 
		// HashMap<K, V> should be parameterized
		Map map = new HashMap();
		
		// Type safety: The method put(Object, Object) 
		// belongs to the raw type Map.
		// References to generic type Map<K, V> should be parameterized 
		map.put("key", "value");
	}
}
