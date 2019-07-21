public class BianLiang {//类对应的块
    final int i=1;
    //i在第二行已经被赋值过了，所以在这里会出现编译错误   i=10;
    public void method(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {//主方法对应的块
        //把实参传进了形参并调用了方法
        new BianLiang().method(5);
        int i=7;
        System.out.println(i);
    }
}
