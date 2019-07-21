package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author : 猕猴桃
 * @create 2019/7/15 15:17
 */
public class TestLambda {
    public static void main(String[] args) {
        List<Hero> heroes=new ArrayList<Hero>();
        Random random=new Random();
        for (int i=0;i<4;i++){
            heroes.add(new Hero("hero "+i,random.nextInt(500),random.nextInt(250)));
        }
        System.out.println("初始化后的集合");
        System.out.println(heroes);
//        System.out.println("筛选出hp>100&&damage<50的英雄有");
//        filter(heroes);
//    private static void filter(List<Hero> heroes){
////        for(Hero h:heroes){
////            if (h.getHp()>100&&h.getDamage()<50)
////                System.out.println(h);
////        }
////    }
        //使用匿名类的方式进行筛选
        System.out.println("筛选出hp>100&&damage<50的英雄有");
//        HeroChecker heroChecker=new HeroChecker() {
//            @Override
//            public boolean test(Hero hero) {
//               return (hero.getHp()>100&&hero.getDamage()<50);
//            }
//        };
        //直接引用Lambda表达式
        filter(heroes,hero -> hero.getHp()>100&&hero.getDamage()<50);
    }

    private static void filter(List<Hero> heroes,HeroChecker heroChecker){
        for (Hero h:heroes){
            if(heroChecker.test(h))
                System.out.println(h);
        }
    }

}
