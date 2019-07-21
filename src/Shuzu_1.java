import java.util.ArrayList;
import java.util.List;

/**
 * @author : 猕猴桃
 * @create 2019/7/15 19:39
 */
public class Shuzu_1 {
    public int i;
    public Shuzu_1(int i){this.i=i;}
    public static void main(String[] args) {
        List list=new ArrayList();
        Shuzu_1 shuzu_1=new Shuzu_1(1);
        Shuzu_1 shuzu_2=new Shuzu_1(2);
        Shuzu_1 shuzu_3=new Shuzu_1(3);
        list.add(shuzu_1);
        list.add(shuzu_2);
        list.add(shuzu_3);


        Shuzu_1 []shuzu=(Shuzu_1[]) list.toArray(new Shuzu_1[list.size()]);
        System.out.println(shuzu.length);
    }
}
