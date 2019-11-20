import java.util.Arrays;
import java.util.List;

public class Array {
	public static void main(String[] args){
		int[] a = {10,25,94,33,574,5,1,-5};
		
		for(int i=0;i<7;i++) {
			for(int j=i+1;j<8;j++) {
				if(a[i]>a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		
		int[] c = {1,2,3};
		
		int[] b = Arrays.copyOf(c, c.length);
		c[0] =5;
		System.out.println(Arrays.toString(b));
		
	}
}
