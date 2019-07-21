package Lambda;

import java.util.*;

/**
 * @author : 猕猴桃
 * @create 2019/7/15 16:34
 */
public class HeroSort {
    public static void main(String[] args) {
        List<Hero> heroList=new ArrayList<Hero>();
        heroList.addAll(Arrays.asList(new Hero("欧尔麦特",2000,10),
                new Hero("绿谷出久",800,40),new Hero("爆豪胜己",900,40),
                new Hero("障子",500,50)) );
        System.out.println("输出英雄的信息");
        System.out.println(heroList);

        //匿名方法进行排序
        Comparator<Hero> c=new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                if(o1.getHp()>o2.getHp())
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(heroList,c);
        System.out.println("排序之后为");
        for (Hero h:heroList
        ) {
            System.out.println(h);

        }

        //使用Limbda表达式
        Collections.sort(heroList,(x,y)->{
            if (x.getHp()==y.getHp()){
                return x.getName().compareTo(y.getName());
            }
            else
                return Integer.compare(x.getHp(),y.getHp());
        });
        System.out.println("排序之后为");
        for (Hero h:heroList
             ) {
            System.out.println(h);

        }
    }
}
