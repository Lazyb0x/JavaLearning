

public class Boxing {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(12345);
        Integer y = Integer.valueOf(12345);
        
        // Integer 会对 -128~127 的数进行缓存，
        // 但不会对大数进行缓存
        System.out.println(x==y);           //false
        System.out.println(x.equals(y));    //true
    }
}
