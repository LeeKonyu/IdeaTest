public class YinYong2 {
    String name;
    int hp;
    public YinYong2(String name,int hp){
        this.name=name;
        this.hp=hp;
    }
    public void t(YinYong2 yinYong2){
        yinYong2=new YinYong2("teemo",383);
        System.out.println(yinYong2.hp);
        System.out.println(yinYong2);
    }

    public static void main(String[] args) {
        YinYong2 y2=new YinYong2("teemo",383);
        y2.hp=y2.hp-400;

        y2.t(y2);
        System.out.println(y2.hp);
        System.out.println(y2);
    }
}
