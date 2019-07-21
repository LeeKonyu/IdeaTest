package NeiBuLei;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 14:47
 */
public class Fish extends Animal implements pet{
    private String name;

    @Override
    public void walk() {
        if(legs==0)
        {
        System.out.println("fish can't walk and have no legs");
        }
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println("fish like to play water");
    }

    @Override
    public void eat() {
        System.out.println("fish like eatting xiaochongzi");
    }
    public Fish(){
        super(0);
        System.out.println("Fish constructor");
    }
}
