package NeiBuLei;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 14:53
 */
public class AnimalMain {
    public static void main(String[] args) {
        Spider s=new Spider();
        s.eat();
        Cat c1=new Cat("iamfish");
        Cat c2=new Cat();
        c2.eat();
        c2.setName("cat");
        System.out.println(c2.getName());
        c2.play();
        Fish f=new Fish();
        f.setName("fish");
        System.out.println(f.getName());
        f.eat();
        f.play();
        f.walk();

    }
}
