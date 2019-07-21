package DT;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 10:04
 */
public class Hero {
    public void no(){
        System.out.println("i am death");
    }
    public void item(){
        System.out.println("物品使用后会有使用效果：");
    }

    public static void main(String[] args) {
        System.out.println("h1");
        Hero h1=new BloodHero();
        h1.item();
        System.out.println("h2");
        Hero h2=new BlueHero();
        h2.item();
    }
}
