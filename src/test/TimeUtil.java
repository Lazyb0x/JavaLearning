package test;

class Time implements Comparable<Time>{
    int hour;
    int minute;
    int second;
    
    public Time(String s) {
        String[] strArr = s.split(":");
        if (strArr.length==2) {
            hour = Integer.parseInt(strArr[0]);
            minute = Integer.parseInt(strArr[1]);
        }
    }
    
    @Override
    public int compareTo(Time o) {
        int val1 = hour*10000 + minute*100 + second;
        int val2 = o.hour*10000 + o.minute*100 + o.second;
        return val1-val2;
    }

    @Override
    public String toString() {
        return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
    }
    
    
}

public class TimeUtil {
    
    public static void main(String[] args) {
        Time t1 = new Time("10:22");
        Time t2 = new Time("12:00");
        System.out.println(t1);
        System.out.println(t1.compareTo(t1));
        System.out.println(t1.compareTo(t2));
    }
}
