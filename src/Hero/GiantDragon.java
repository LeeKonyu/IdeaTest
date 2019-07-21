package Hero;
/*什么是单例模式？
1.构造函数私有化
2.静态属性指向实例化对象
3.public static的方法返回静态类属性指向的实例化对象*/

public class GiantDragon {
    private GiantDragon(){
    }//私有化构造函数，防止外部通过new进行实例化

    private static GiantDragon instance=new GiantDragon();//通过准备一个静态类属性来指向实例化对象

    public static GiantDragon dragon(){
        return instance;//通过引用返回指向的实例化对象
    }
}
