package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : 猕猴桃
 * @create 2019/7/15 17:15
 */
public class TestLambda_2 {
    public static void main(String[] args) {
        List<Hero> heroList = new ArrayList<Hero>();
        heroList.addAll(Arrays.asList(new Hero("欧尔麦特", 2000, 10),
                new Hero("绿谷出久", 800, 40), new Hero("爆豪胜己", 900, 40),
                new Hero("障子", 500, 50)));
        System.out.println("输出英雄的信息");
        System.out.println(heroList);

        //Limbda表达式
        filter(heroList,hero -> testHero(hero)
            );
        //或者还可以这么用
        filter(heroList,TestLambda_2::testHero);

    }
    public static boolean testHero(Hero h){
        return h.getHp()>600&&h.getDamage()<40;
    }
    private static void filter(List<Hero> list,HeroChecker heroChecker){
        for (Hero h:list){
            if(heroChecker.test(h))
                System.out.println(h);
        }
    }
}
