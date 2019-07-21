/**
 * @author : 猕猴桃
 * @create 2019/7/17 10:19
 * 获取Class对象的三种方式
 * 1.Class.forName("全类名")：将字节码文件加载进内存，返回class对象
 *      多用于配置文件，将类名定义在配置文件中，读取文件，加载类
 * 2.类名.class：通过类名的属性class获取
 *      多用于参数传递
 * 3.对象.getClass()：getClass()方法在Object类中定义着
 *      多用于对象的获取字节码方式（对象已经存在）
 *
 * 结论：同一个字节码文件(*.class)在一次程序运行过程中，只会被加载一次
 *       不论通过哪一种方式获取Class对象都是同一个
 */
public class Reflect {
    public static void main(String[] args) {
        try {
            Class c1=Class.forName("Hero");
            System.out.println(c1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Class c2=Hero.class;
        System.out.println(c2);

        Hero h1=new Hero();
        Class c3=h1.getClass();
        System.out.println(c3);
    }

}
