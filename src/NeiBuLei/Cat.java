package NeiBuLei;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 14:36
 */
public class Cat extends Animal implements pet {
    private String name;
    public Cat(String name){
        super(4);
        this.name=name;
        System.out.println(name);
    }
    public Cat(){
        this.name=null;
    }

    @Override
    public void eat() {
        System.out.println("cat eat mouse");
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
        System.out.println("cat like to play ball");
    }
}
