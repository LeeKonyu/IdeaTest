package Hero;
/*执行顺序：
所以的静态初始化块应该先被执行，随后才是各类的非静态初始化块和构造方法
1.父类静态初始化块
2.子类静态初始化块
3.父类初始化块
4.父类构造方法
5.子类初始化块
6.子类构造方法*/
public class ClassInitialization1 {
    public String name="ont";
    public ClassInitialization1(){
        name="tnt";
    }
    {
        name="thnt";
    }

    public static void main(String[] args) {
        ClassInitialization1 c=new ClassInitialization1();
        System.out.println(c.name);
    }
}
