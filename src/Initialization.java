
/**
 * <p>有关类的初始化
 * <p>https://blog.csdn.net/wuxianjiezh/article/details/90267142
 * <p>https://stackoverflow.com/questions/3987428/what-is-an-initialization-block
 */
public class Initialization {
    public static int staticVariable;
    public static int staticVariable2 = initVariable2();
    public int variable;
    
    static {
        staticVariable = 3;
        System.out.println("静态初始化块 (static initialization block)");
    }
    
    
    private static int initVariable2(){
        System.out.println("带有 private 修饰和方法名的静态初始化块");
        return 2;
    }
    
    public Initialization(){
        System.out.println("构造器方法");
    }
    
    {
        variable = 6;
        System.out.println("初始化块");
    }
    
    public static void main(String[] args) {
        Initialization a = new Initialization();
        Initialization b = new Initialization();
        Initialization c = new Initialization() {
            {
                System.out.println("初始化块可以用于匿名内部类");
            }
        };
    }
}
