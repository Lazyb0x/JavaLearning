package container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student{
    String name;
    Integer num;
    
    public Student(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", num=" + num + "]";
    }
}

public class MyCollections {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,8,2,3,5,4,65);
        Collections.sort(list, Integer::compareTo);
        System.out.println(list);
        
        List<Student> slist = new ArrayList<Student>() {{
            add(new Student("xiaoming", 2));
            add(new Student("xiaohong", 3));
            add(new Student("xiaohuang", 0));
            }
        };
        
        Collections.sort(slist, Comparator.comparing(Student::getNum));
        Collections.sort(slist, Comparator.comparing(s -> s.num));
        slist.forEach(System.out::println);
    }
}
