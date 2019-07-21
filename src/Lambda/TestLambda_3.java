package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : 猕猴桃
 * @create 2019/7/15 17:38
 */
public class TestLambda_3 {
    public static void main(String[] args) {
        List<Hero> list=new ArrayList<Hero>();
        list.addAll(Arrays.asList(new Hero("abd",30,40),new Hero("sdf",50,20),new Hero("zxc",28,30)));
        for (Hero h:list){
            System.out.println(h);
        }
        //Lambda表达式
        TestLambda_3 testLambda_3=new TestLambda_3();
        filter(list,testLambda_3::sort);
    }
    public boolean sort(Hero h){
        return h.getHp()>600&&h.getDamage()<40;
    }
    private static void filter(List<Hero> heroList,HeroChecker heroChecker){
        for (Hero h:heroList){
            if (heroChecker.test(h))
                System.out.println(h);
        }
    }
}
