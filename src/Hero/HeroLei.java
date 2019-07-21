package Hero;

public class HeroLei {
    String name;
    int hp;

    public void die(){
        System.out.println("i have dead");
    }
    public static void battleWin(){
        //die();       静态方法不能调用非静态方法，但是非静态方法可以调用静态方法
        System.out.println("i am winner");
    }

    public static void main(String[] args) {
        HeroLei h=new HeroLei();
        h.die();
        battleWin();
    }
}
