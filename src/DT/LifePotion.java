package DT;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 11:26
 */
public class LifePotion extends Item {
    @Override
    public boolean disposabke() {
        return true;
    }

    public static void main(String[] args) {
        LifePotion l=new LifePotion();
        System.out.println("whether l cunzai "+l.disposabke());
    }
}
