package Hero;

public class MixHero extends Hero implements AD,AP {
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    @Override

    public void magicAttack() {
        System.out.println(name+"进行魔法攻击");
    }

    public static void main(String[] args) {
        MixHero m=new MixHero();
        m.name="刘德华";
        m.magicAttack();
    }
}
