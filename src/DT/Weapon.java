package DT;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 11:26
 */
public class Weapon extends Item {
    @Override
    public boolean disposabke() {
        return false;
    }

    public static void main(String[] args) {
        Weapon w=new Weapon();
        System.out.println("whether w cunzai"+w.disposabke());
    }
}
