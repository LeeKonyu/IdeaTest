package NeiBuLei;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 15:16
 */
public class TestInteger {
    public static void main(String[] args) {
        byte b=1;
        short s=10;
        float f=1.2f;
        double d=3.1415926d;

        Byte b1=new Byte(b);
        byte b2=b1.byteValue();
        Short s1=new Short(s);
        short s2=s1.shortValue();
        Float f1=new Float(f);
        float f2=f1.floatValue();
        Double d1=new Double(d);
        double d2=d1.doubleValue();

        Integer i1=new Integer(b);
        int i2=b1.byteValue();

        //Byte b3=new Byte(i1);
        int i=5;
        Integer iii=i;
        int iiii=iii;
        int ii=b1;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
    }
}
