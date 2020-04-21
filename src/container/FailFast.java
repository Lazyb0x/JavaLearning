package container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// fail-fast 机制
// [Java提高篇（三四）-----fail-fast机制](https://blog.csdn.net/chenssy/article/details/38151189)
// [java.util.ConcurrentModificationException详解](https://www.jianshu.com/p/c5b52927a61a)

// “快速失败”行为，是 java 集合的一种错误检测机制。防止集合多线程操作时可能产生的错误。
// 比如：一个线程在遍历，一个线程在修改同一个集合的结构（添加/删除），
// 就会抛出  ConcurrentModificationException 异常。

// 单线程操作不当的时候也会发生这种错误。
// 不要使用 for-each 语句来添加/删除元素！

public class FailFast {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        
        // 第二次循环时，迭代器检查到数组修改，抛出异常。
        try {
            for (var item : list) {
                if ("1".equals(item)) {
                    list.remove(item);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(list);
        
        // 解决办法：用 iterator.remove()
        var iterator = list.iterator();
        while(iterator.hasNext()) {
            var item = iterator.next();
            if ("2".equals(item)) {
                list.remove(item);
            }
        }
        System.out.println(list);
    }
}
