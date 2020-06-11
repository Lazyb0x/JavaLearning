package reflect;

import java.lang.reflect.Field;

// 获取 Object 实例的字段信息
// 包括 获取字段名和字段值，修改字段值
// 一个Field对象包含了一个字段的所有信息

public class GetField {
    public static void main(String[] args) throws Exception{
        Class stdClass = Student.class;
        
        // 一个实例化的对象
        Student s = new Student(100, 3);
        System.out.println(s);
        
        // 获得字段
        Field pubField = stdClass.getField("score");
        System.out.println(pubField);
        // 获得字段的值
        Object pubValue = pubField.get(s);
        System.out.println(pubValue);
        // 字段名称，字段类型，字段的修饰符
        System.out.println(pubField.getName() + " " + pubField.getType() + " " + pubField.getModifiers());
        // 更改字段的值
        pubField.set(s, 99);
        
        // 使用 getDeclareField() 可以获得 private 的字段，而 getField() 只能获得 public 的字段。
        Field priField = stdClass.getDeclaredField("grade");
        System.out.println(priField);
        // 允许访问私有字段
        priField.setAccessible(true);
        Object priValue = priField.get(s);
        System.out.println(priValue);
        priField.set(s, 4);
        
        System.out.println(s);
    }
}

class Person {
    public String name;
}

class Student extends Person{
    public int score;
    private int grade;
    
    public Student(int score, int grade) {
        super();
        this.score = score;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [score=" + score + ", grade=" + grade + "]";
    }
}
