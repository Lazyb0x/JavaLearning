import java.util.ArrayList;
import java.util.List;

//泛型以及泛型数组
//《java核心技术I 10th》 P321 不能创建参数化类型的数组，
//但可以声明并进行类型转换，但结果是不安全的
//不过在添加不同的元素的时候，IDE和编译器都会报错，是不是新版已经修正了？


public class GenericArray {


	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		List<Integer> a[] =(ArrayList<Integer>[]) new ArrayList<?>[10];
		
		for (int i=0;i<10;i++) {
			List<Integer> list = new ArrayList<Integer>();
//			list.add(i);
			for (int j=0;j<=i;j++) {
				list.add(j);
			}
			a[i] = list;
		}
		
		
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i].toString());
		}
	}
}
