package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyDate {
    public static void main(String[] args) {
        
        // 获取一年中的每一天
        Calendar c = Calendar.getInstance();
        int lastDay = c.getActualMaximum(Calendar.DAY_OF_YEAR);
        for (int i=0; i<lastDay; i++) {
            c.set(Calendar.DAY_OF_YEAR,i+1);
            int dow = c.get(Calendar.DAY_OF_WEEK);
            
            System.out.print(new SimpleDateFormat("yyyyMMdd").format(c.getTime()));
            
            if (dow == Calendar.SATURDAY || dow == Calendar.SUNDAY) {
                System.out.println("周末！");
            }
            else {
                System.out.println();
            }
        }
//        System.out.println(new SimpleDateFormat().format(c.getTime()));
    }
}
