
public class Hero {
    String name;
    float hp;
    float armor;
    int die;
    int money;
    int moveSpeed;

    //获取护甲值
    float getArmor(){
        return armor;
    }
    //坑队友
    void keng(){
        System.out.println("坑队友！");
    }
    //增加移动速度
    void addSpeed(int speed){
        moveSpeed=moveSpeed+speed;
    }
    void legendary(){
        System.out.println("超神！");
    }
    float getHp() {
        return hp;
    }
    void recovery(float blood){
        System.out.println("恢复了"+blood+"滴血");
    }

    public static void main(String[] args) {
        Hero garen=new Hero();
        garen.name="盖伦";
        garen.hp=828.5f;
        garen.armor=341f;
        garen.moveSpeed=350;
        garen.addSpeed(100);
        garen.die=3;
        garen.money=4124;

        Hero teemo=new Hero();
        teemo.name="提莫";
        teemo.hp=432.7f;
        teemo.armor=123f;
        teemo.moveSpeed=325;
        teemo.die=12;
        teemo.money=3241;

        //通过字符数组创建一个字符串对象
        char [] cs = new char[]{'崔','斯','特'};
        String hero = new String(cs);

        //给不同类型的变量赋予合法的字面值
        byte a=1;
        short b=18;
        int c=143;
        long d=51631;
        char e='e';
        float f=3.32f;
        double g=5.4523f;
        boolean h=false;


    }
}
