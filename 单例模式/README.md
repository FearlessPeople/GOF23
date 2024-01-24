## 一、单例模式介绍

单例模式：保证一个类只有一个实例，并且提供一个访问该实例的全局访问点。

单例模式优点：

1. 只生成一个实例，系统开销比较小

2. 单例模式可以在系统设置全局的访问点，优化共享资源的访问。

常见单例模式分类：

主要：

1. 饿汉式（线程安全，调用效率高，但是不能延时加载）

2. 懒汉式（线程安全，调用效率不高，但是可以延时加载）

3. 双重检测锁式（由于JVM底层内部模型原因，偶尔会出问题。不建议使用）

4. 静态内部类式（线程安全，调用效率高。但是可以延时加载）

5. 枚举单例（线程安全，调用效率高，不能延时加载）

## 二、单例模式实例代码

### 懒汉式

```java
package com.fz.singleton;

/**
 * 饿汉式单例：所谓饿汉式，就是比较饿。当类一加载的时候就直接new了一个静态实例。不管后面有没有用到该实例
 */
public class Singleton1 {
    /**
     * 1、提供一个静态变量。
     * 当类加载器加载该类时，就new一个实例出来。从属于这个类。不管后面用不用这个类。所以没有延时加载功能
     */
    private static Singleton1 instance = new Singleton1();

    /**
     * 2、私有化构造器:外部是不能直接new该对象的
     */
    private Singleton1() {
    }

    /**
     * 3、对外提供一个公共方法来获取这个唯一对象（方法没有使用synchronized则调用效率高）
     * @return
     */
    public static Singleton1 getInstance() {
        return instance;
    }
}
```

### 饿汉式

```java
package com.fz.singleton;

/**
 * 懒汉式单例：比较懒，一开始不初始化实例。等什么时候用就什么时候初始化.避免资源浪费
 */
public class Singleton2 {
    /**
     * 1、声明一个静态实例，不给它初始化。等什么时候用就什么时候初始化。节省资源
     */
    private static Singleton2 instance;

    /**
     * 2、依然私有化构造器，对外不让new
     */
    private Singleton2() {
    }

    /**
     * 3、对外提供一个获取实例的方法，因为静态属性没有实例化。
     * 假如高并发的时候，有可能会同时调用该方法。造成new出多个实例。所以需要加上同步synchronized，因此调用效率不高
     * 在方法上加同步，是整个方法都同步。效率不高
     * @return
     */
    public synchronized static Singleton2 getInstance() {
        if (instance == null) {//第一次调用时为空，则直接new一个
            instance = new Singleton2();
        }
        //之后第二次再调用的时候就已经初始化了，不用再new。直接返回
        return instance;
    }
}
```

### 双重检索方式

```java
package com.fz.singleton;

/**
 * 双重检索单例模式
 * 将锁加在判断实例为空的地方，不加在方法上
 */
public class Singleton3 {
    /**
     * 1、提供未实例化的静态实例
     */
    private static Singleton3 instance = null;

    /**
     * 2、私有化构造器
     */
    private Singleton3() {
    }

    /**
     * 3、对外提供获取实例的方法
     * 但是同步的时候将锁放到第一次获取实例的时候，这样的好处就是只有第一次会同步。效率高
     * @return
     */
    public static Singleton3 getInstance() {
        if (instance == null) {
            Singleton3 s3;
            synchronized (Singleton3.class) {
                s3 = instance;
                if (s3 == null) {
                    synchronized (Singleton3.class) {
                        if (s3 == null) {
                            s3 = new Singleton3();
                        }
                    }
                    instance = s3;
                }
            }
        }
        return instance;
    }

}
```

### 静态内部类方式

```java
package com.fz.singleton;

/**
 * 静态内部类单例实现
 */
public class Singleton4 {

    /**
     * 1、私有化构造器
     */
    private Singleton4() {
    }

    /**
     * 2、声明一个静态内部类,在静态内部类内部提供一个外部类的实例（常量，不可改变）
     * 初始化Singleton4 的时候不会初始化SingletonClassInstance，实现了延时加载。并且线程安全
     */
    private static class SingletonClassInstance {
        //该实例只读，不管谁都不能修改
        private static final Singleton4 instance = new Singleton4();
    }

    /**
     * 3、对外提供一个获取实例的方法：直接返回静态内部类中的那个常量实例
     * 调用的时候没有同步等待，所以效率也高
     * @return
     */
    public static Singleton4 getInstance() {
        return SingletonClassInstance.instance;
    }

}

```

### 枚举单例

```java
package com.fz.singleton;

/**
 * 枚举实现单例模式（枚举本身就是单例）
 */
public enum Singleton5 {
    /**
     * 定义一个枚举元素，它就是一个单例的实例了。
     */
    INSTANCE;

    /**
     * 对枚举的一些操作
     */
    public void singletonOperation() {

    }

}
```

## 如何破解单例模式？

### 通过反射破解

不包括枚举，因为枚举本身是单例，是由JVM管理的

```java
package com.fz.singleton;

import java.lang.reflect.Constructor;

/**
 * 通过反射破解单例模式
 */
public class TestReflect {
    public static void main(String[] args) throws Exception {
        Singleton6 s1 = Singleton6.getInstance();
        Singleton6 s2 = Singleton6.getInstance();
        System.out.println(s1 == s2);//true

        //通过反射破解
        Class<Singleton6> clazz = (Class<Singleton6>) Class.forName(Singleton6.class.getName());
        Constructor<Singleton6> c = clazz.getDeclaredConstructor(null);//获得无参构造器
        c.setAccessible(true);//跳过检查：可以访问private构造器
        Singleton6 s3 = c.newInstance();//此时会报错：没有权限访问私有构造器
        Singleton6 s4 = c.newInstance();
        System.out.println(s3 == s4);//不加c.setAccessible(true)则会报错。此时的结果就是false，获得的就是两个对象

    }
}
```
如何防止反射破解单例模式呢？

在Singleton6构造的时候，假如不是第一次就直接抛出异常。不让创建。这样第二次构建的话就直接抛出异常了。

```java
private Singleton6(){
    if (instance != null) {
        //如果不是第一次构建，则直接抛出异常。不让创建
        throw new RuntimeException();
    }
}
```

### 通过反序列化

通过序列化和反序列化构建对象

```java
package com.fz.singleton;
 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
 
/**
 * 通过反射破解单例模式
 */
public class TestReflect {
    public static void main(String[] args) throws Exception {
        Singleton6 s1 = Singleton6.getInstance();
        Singleton6 s2 = Singleton6.getInstance();
 
        //通过反序列化构建对象：通过序列化将s1存储到硬盘上，然后再通过反序列化把s1再构建出来
        FileOutputStream fos = new FileOutputStream("e:/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();
        //通过反序列化将s1对象再构建出来
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/a.txt"));
        Singleton6 s5 = (Singleton6) ois.readObject();
        System.out.println(s5);//此时打印出一个新对象
        System.out.println(s1==s5);//false
    }
}
```

防止反序列化构建对象

在Singleton6中定义一个方法，此时结果就会一样了。System.out.println(s1==s5);结果就是true了

```java
package com.fz.singleton;
 
import java.io.ObjectStreamException;
import java.io.Serializable;
 
/**
 * 用于测试反射破解的单例类
 */
public class Singleton6 implements Serializable {
    /**
     * 1、提供一个静态变量。
     * 当类加载器加载该类时，就new一个实例出来。从属于这个类。不管后面用不用这个类。所以没有延时加载功能
     */
    private static Singleton6 instance = new Singleton6();
    /**
     * 2、私有化构造器:外部是不能直接new该对象的
     */
    private Singleton6(){
        if (instance != null) {
            //如果不是第一次构建，则直接抛出异常。不让创建
            throw new RuntimeException();
        }
    }
    /**
     * 3、对外提供一个公共方法来获取这个唯一对象（方法没有使用synchronized则调用效率高）
     * @return
     */
    public static Singleton6 getInstance(){
        return instance;
    }
     
    /**
     * 反序列化时，如果定义了readResolve()则直接返回该方法指定的实例。不会再单独创建新对象！
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException{
        return instance;
    }
     
}
```

测试几种单例的速度

```java
package com.fz.singleton;
  
import java.util.concurrent.CountDownLatch;
  
/**
 * 测试几种单例模式的速度
 */
public class TestSingleton {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        int threadNum = 10;//10个线程
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
          
        for (int i = 0; i < threadNum; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100000; i++) {
                        Object o = Singleton5.INSTANCE;
                    }
                    countDownLatch.countDown();//计数器-1
                }
            }).start();
        }
          
        countDownLatch.await();//main线程阻塞
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start));
          
        /**
         * 结果（毫秒）:
         * Singleton1（饿汉式）耗时：5
         * Singleton2（懒汉式）耗时：227
         * Singleton3（双重检索式）耗时：7
         * Singleton4（静态内部类式）耗时：40
         * Singleton5（枚举式）耗时：5
         */
    }
}
```

## 四、总结

### 如何选用？

1. 枚举式  好于  饿汉式

2. 静态内部类式  好于 懒汉式

### 常见应用场景

- windows的任务管理器
- 网站的计数器
- 数据库的连接池
- Application容器也是单例
- Spring中每个bean默认也是单例
- Servlet中，每个servlet也是单例
