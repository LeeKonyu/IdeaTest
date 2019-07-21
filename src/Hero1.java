public class Hero1 {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public Hero1(){
        System.out.println("无参的构造函数");
    }
    public Hero1(String heroName){
        this.name=heroName;
        System.out.println("该英雄名字："+name);
    }
    public Hero1(float heroHP){
        this.hp=heroHP;
        System.out.println("该英雄血量："+hp);
    }
    public Hero1(int heroMoveSpeed){
        this.moveSpeed=heroMoveSpeed;
        System.out.println("该英雄移动速度为："+moveSpeed);
    }

    public static void main(String[] args) {
        Hero1 hero1=new Hero1();
        Hero1 hero2=new Hero1("暗裔剑魔");
        Hero1 hero3=new Hero1(2100f);
        Hero1 hero4=new Hero1(330);

    }

}
