package Hero;

public class ClassInitialization {
    private String name="刘德华";
    private float hp;

    float maxHp;int number;
    {
        maxHp=200f;number=10;
    }
    public static int lizhi=41;
    public static int pushu;
    public static int xuwei;
    static {
        pushu=20;
    }
    public ClassInitialization(){
        hp=30f;
        xuwei=50;
    }
    public static void main(String[] args) {
        ClassInitialization c=new ClassInitialization();
        System.out.println(c.name);
        System.out.println(c.hp);
        System.out.println(lizhi+"   "+pushu+"   "+xuwei);
    }
}
