package reflect;

// 获取 Class 实例的方法
// 获取实例的3种方式
// 以及父类的获取
// 接口的获取

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
        
        // 获取父类
        Class son = SonClass.class;
        Class fat = son.getSuperclass();
        System.out.println(fat);            //class reflect.FatherClass
        Class o = fat.getSuperclass();
        System.out.println(o);              //class java.lang.Object
        
        // 获取 Integer 实现的所有接口
        Class s = Integer.class;
        Class[] is = s.getInterfaces();
        for (Class i : is) {
            System.out.println(i);
        }
    }
}
