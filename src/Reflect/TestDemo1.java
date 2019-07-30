package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author : 猕猴桃
 * @create 2019/7/30 9:27
 */
public class TestDemo1 {
    public static void main(String[] args) throws Exception {
        //获取Class类对象的三种方法
        Class class1 = Person.class;
        Class class2 = new Person().getClass() ;
        Class class3 = Class.forName("Reflect.Person");//最常用

    }
    //要对一个类实例化，但是不能new，就需要用反射来操作

    //操作有参数的构造方法
    public static void test1() throws Exception{
        //得到字节码对象
        Class c1 = Class.forName("Reflect.Person");
        //getConstructor(类<?>... parameterTypes)
        //返回一个 Constructor对象，该对象反映
        //Constructor对象表示的类的指定的公共 类函数。
        Constructor cs1 = c1.getConstructor(String.class,String.class);
        //通过有参数的构造方法设置值，通过有参数的构造方法创建Person实例
        Person p1 = (Person) cs1.newInstance("lisi","100");
    }

    //操作无参数的构造方法
    public static void test2() throws Exception{
        //得到字节码对象
        Class c3 = Class.forName("Reflect.Person");
        //Class类的newInstance()
        //创建由此 类对象表示的类的新实例。
        Person p = (Person) c3.newInstance();
        //设置值
        p.setName("zhangsan");
        System.out.println(p.getName());
    }

    //给私有属性赋值
    public static void test3() throws Exception{
        //得到字节码对象
        Class c3 = Class.forName("Reflect.Person");
        //得到Person的实例
        Person p = (Person) c3.newInstance();
        //得到Field属性对象，参数是属性的名称
        Field f1 = c3.getField("name");
        //设置可以操作私有属性
        f1.setAccessible(true);
        //现在就可以设置属性的值了
        f1.set(p,"wangwu");
        //System.out.println(p.getName());
        System.out.println(f1.get(p));
    }

    //使用反射操作普通方法
    public static void test4() throws Exception{
        //得到字节码对象
        Class c3 = Class.forName("Reflect.Person");
        //得到Person的实例
        Person p = (Person) c3.newInstance();
        //得到Method普通方法对象
        Method method=c3.getDeclaredMethod("setName", String.class);

        //让setName方法执行，执行设置值
        //第一个参数：person的实例。第二个参数：由方法设置的值
        method.invoke(p,"niuqi");

        System.out.println(p.getName());


        //如果操作的私有的方法，则需要设置值
        //method.setAccessible(true);

        //当操作的方法是静态的方法的时候，因为静态方法的调用方式是类名.方法名
        //不需要类的实例，所以在反射操作静态方式的时候，也是不需要实例
        //在invoke方法的第一个参数里面，直接写null
        //method.invoke(null,"niuqi");
    }
}
