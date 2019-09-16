
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
		
		for(int i=0;i<8;i++) {
			System.out.print(a[i]+" ");
		}
		
		int[][] A = {{1,2,3,4},{5,4,6,8}};
		A[0][0] = 5;
		
		for(int i=0;i<2;i++) {
			System.out.println();
			for(int j=0;j<4;j++) {
				System.out.print(A[i][j]+" ");
			}
		}
	}
}
