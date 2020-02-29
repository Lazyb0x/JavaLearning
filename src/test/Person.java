package test;

class solution{
    public static int leftedNumber(String s){
        return leftedNumber_round(s,0);
    }

    private static int leftedNumber_round(String s,int k){
        if(k==s.length()-1){
            return s.length();
        }
        if(s.charAt(k)=='R'&&s.charAt(k+1)=='L'){
            String s1=s.substring(0,k)+s.substring(k+1,s.length());
            String s2=s.substring(0,k+1)+s.substring(k+2,s.length());
            return Math.min(leftedNumber_round(s1,k),leftedNumber_round(s2,k));
        }else{
            return leftedNumber_round(s,k+1);
        }
    }
}

public class Person {
	public static void main(String[] args) {
		System.out.println(solution.leftedNumber("RLRL"));
	}
}
