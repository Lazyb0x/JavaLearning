package io;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    
}

public class Serialize {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Person.ser"))){
            Person person = new Person("Xiaoming", 22);
            oos.writeObject(person);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
