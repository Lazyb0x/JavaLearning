package reflect.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK 提供的创建接口对象的方式
 * JDK 会自动为我们创建这个一个类
 * @author Lazyb0x
 *
 */
public class DynamicProxy {
    public static void main(String[] args) {
        Hello hello = (Hello)Proxy.newProxyInstance(
                Hello.class.getClassLoader(),   // 传入 ClassLoader
                new Class[] {Hello.class},      // 传入要实现的接口
                new MyHandler());               // 传入处理调用方法的 InvocationHandler
        
        hello.morning("Bob");
    }
}

interface Hello{
    void morning(String name);
}

class MyHandler implements InvocationHandler{

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method);
        if (method.getName().equals("morning")) {
            System.out.println("Good morning, " + args[0] + ".");
        }
        return null;
    }
    
}