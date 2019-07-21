package NeiBuLei;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 14:29
 */
public class Spider extends Animal {
    protected Spider(){
        super(8);
        System.out.println("spider have"+legs+" legs");
    }

    @Override
    public void eat() {
        System.out.println("spider eat small animal");
    }
}
