public class Calculate1 {
    public static String name="Person";
    int age=0;
}
class Child extends Calculate1{
    public  String grade="fas";
    static int x=10;
    static {x+=5;}

    public static void main(String[] args) {
        Calculate1 c1=new Calculate1();
        Calculate1 c2=new Child();
        Child child=new Child();//向上转型父类引用子类，如果父类方法被子类复写，
        // 则调用子类方法，否则调用父类方法，父类没有定义的方法和属性是不能被调用的
        System.out.println("x="+x);
        System.out.println(c1.name+ ((Child) c2).grade+child.grade+((Child) c2).grade);
    }
    static {x/=3;}
}
