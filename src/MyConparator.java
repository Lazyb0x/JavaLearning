import java.util.Arrays;
import java.util.Comparator;

public class MyConparator {
	public static Comparator<Integer> intComparator = new Comparator<Integer>() {
		@Override
		public int compare(Integer a, Integer b) {
			return a-b;
		}
	};
	
	public static void main(String[] args) {
		Integer[] a = {7,6,5,4,3,2,1};
		Arrays.sort(a,intComparator);
		System.out.println(Arrays.toString(a));
	}
}
