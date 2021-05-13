package functional;

import java.time.LocalDateTime;
import java.util.function.Function;

public class Calculator {

    public static void main(String[] args) {
        int a = 2;
        int b = 50;

        printCalc(a, b, (x, y) -> x * y);
        
        tellTheTime(currTime -> "你好，现在的时间是 " + currTime);
    }

    public static void printCalc(int a, int b, CalculateAB c) {
        System.out.println(c.calc(a, b));
    }
    
    public static void tellTheTime(Function<String, String> f) {
        String currTime = LocalDateTime.now().toString();
        String s = f.apply(currTime);
        System.out.println(s);
    }

}
