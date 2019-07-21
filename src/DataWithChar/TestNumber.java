package DataWithChar;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 15:45
 */
public class TestNumber {
    public static void main(String[] args) {
        float f1=3.14f;
        Float f2=f1;
        String s1=f2.toString();
        System.out.println(s1);

        float f3=Float.parseFloat(s1);
        System.out.println(f3);
    }
}
