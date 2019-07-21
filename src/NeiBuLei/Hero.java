package NeiBuLei;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 11:39
 */
public class Hero {
    private int hp;
    private String name;
    private int kill;

    public void saymyname(){
        System.out.println("I am "+name);
    }
    class WasKilled{
        public void KillSore(){
            if(kill>=8)
                System.out.println(name+"已经超神");
            else
                System.out.println(name+"还在超鬼的路上");
        }
    }

    public static void main(String[] args) {
        Hero h=new Hero();
        h.kill=9;
        h.name="garen";
        h.saymyname();
        WasKilled w=h.new WasKilled();
        w.KillSore();
    }
}
