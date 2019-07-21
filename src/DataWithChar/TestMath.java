package DataWithChar;
/**
 * @author : 猕猴桃
 * @create 2019/7/10 16:05
 */
public class TestMath {
    public static void main(String[] args) {
        int n;
        double sum=0d;
        n=20;
        for(int i=1;i<=n;i++){
            double n1=1/i;
            double n2=Math.pow(1+n1,i);
            sum+=n2;
        }
        double e=Math.E;
        double ee=sum-e;
        System.out.println(ee);

    }
}
