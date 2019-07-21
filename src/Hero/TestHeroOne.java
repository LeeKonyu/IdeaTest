package Hero;

public class TestHeroOne {
    public static void main(String[] args) {
        //HeroOne heroOne=new HeroOne();
        HeroOne h1=HeroOne.getHeroOne();
        HeroOne h2=HeroOne.getHeroOne();

        System.out.println(h1==h2);
    }
}
