package reflect;

// 获取 Class 实例的方法

class TestClass{
    static {
        System.out.println("类被加载");
    }
    {
        System.out.println("类被实例化");
    }
}

public class GetClass {
    public static void main(String[] args) throws Exception{
        
        // 1. 通过类名获得
        Class<TestClass> cls = TestClass.class;
        TestClass ss = (TestClass)cls.newInstance();

        // 2. 通过类的全名路径获得
        Class cls2 = null;
        cls2 = Class.forName("reflect.TestClass");
        
        // 3. 通过实例对象获得
        Class cls3 = new TestClass().getClass();
        
        System.out.println(cls==cls2 && cls2==cls3);    //true
    }
}
