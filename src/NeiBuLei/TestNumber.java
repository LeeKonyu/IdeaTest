package NeiBuLei;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 15:09
 */
public class TestNumber {
    public static void main(String[] args) {
        int i=5;
        Integer i1=new Integer(i);   //基本类型转为封装类型
        int i2=i1.intValue();        //封装类型转为基本类型

        Integer it=new Integer(i);       //基本类型转化为封装类型
        Integer itt=i;                  //这种自动转换叫做装箱

        //int的最大（小）值可以通过其对应的封装类Integer.MAX_VALUE来获取
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
