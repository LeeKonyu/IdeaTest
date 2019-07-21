package NeiBuLei;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 14:19
 */
public class ADAPHero implements ADHero,APHero {
    @Override
    public void attack() {
        ADHero.super.attack();
        APHero.super.attack();
    }

    public static void main(String[] args) {
        ADAPHero adapHero=new ADAPHero();
        adapHero.attack();
    }
}
