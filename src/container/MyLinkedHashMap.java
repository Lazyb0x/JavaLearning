package container;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MyLinkedHashMap {
		public static void main(String[] args) {
			LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
			map.put(1, "in");
			map.put(0, "Seasons");
			map.put(2, "the");
			
			for(Entry<Integer, String> e : map.entrySet()) {
				String s = e.getKey() + " " + e.getValue();
				System.out.println(s);
			}
		}
		
}
