public class YinYong1{
    String name;
    float hp;
    float blood;
    public YinYong1(String name,float blood){
        this.name=name;
        this.blood=blood;
        System.out.println("英雄名称："+this.name+"   英雄血量"+this.blood);
    }
    public void attack(YinYong1 yinYong1,float hp){
        this.hp=hp;
        yinYong1.blood=yinYong1.blood-this.hp;
        System.out.println(this.name+"打了"+yinYong1.name+"以后它还剩"+yinYong1.blood+"滴血");
    }

    public static void main(String[] args) {
        YinYong1 y1=new YinYong1("小鱼人",1200f);
        YinYong1 y2=new YinYong1("石头人",1800f);
        y1.attack(y2,800);
    }
}