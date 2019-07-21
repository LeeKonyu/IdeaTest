package Hero;

public class HeroOne {
    private HeroOne(){

    }
    private static HeroOne heroOne;
    public static HeroOne getHeroOne(){
        if (heroOne==null){
            heroOne=new HeroOne();
        }
        return heroOne;
    }

}
