package NeiBuLei;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 14:25
 */
public abstract class Animal {
    protected int legs;

    protected Animal(){
        System.out.println("Animal constructor");
    }
    protected Animal(int legs){
        this.legs=legs;
    }
    public abstract void eat();
    public void walk(){
        System.out.println(legs+"legsnumbers,and how to walk");
    }
}
