package Hero;


public class Hero {
    public String name;
    static String copyright;
    public static void lei(){
        System.out.println("类方法");
    }

    public static void main(String[] args) {
        lei();

        Hero h1=new Hero();
        h1.name="teemo";
        h1.copyright="Riot版权所有";

        Hero h2=new Hero();
        h2.name="grey";

        h2.copyright="Riot是版权商";

        Hero.copyright="Riot拥有版权所有";
        System.out.println(Hero.copyright);
        System.out.println(h1.name);
        System.out.println(h1.copyright);
        System.out.println(h2.name);
        System.out.println(h2.copyright);

        Hero hh=new ADHero();

        Hero h=new Hero();
        ADHero adHero=new ADHero();
        h=adHero;
        adHero=(ADHero)h;


        AD adi;
        adi=adHero;

        h=(Hero) adi;

        ADHero ad=new ADHero();
        APHero ap=new APHero();
        Hero hero1=ad;
        Hero hero2=ap;
        //instanceof可以判断一个引用所指向的对象是否为***类型，或者***的子类
        System.out.println(hero1 instanceof ADHero);
        System.out.println(hero2 instanceof APHero);
        System.out.println(hero1 instanceof  Hero);


    }
}
