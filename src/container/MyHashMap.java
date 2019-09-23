package container;
import java.util.*;;

public class MyHashMap {
	public static void main(String[] args) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		System.out.println(hm.get('I'));
		Set<Character> set = hm.keySet();
		Iterator<Character> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(hm.get('S')==null);
		hm.put('M', 2000);
		System.out.println(hm.get('M'));
	}
}
