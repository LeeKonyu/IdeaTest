package Hero;

public class HelloWorld {
    public static void main(String[] args) {
        SeaSon seaSon=SeaSon.SPRING;
        switch (seaSon){                       //swith中的枚举可以保证范围的精准性，不会有第五个季节这种荒谬的case
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
        for(SeaSon s:SeaSon.values()){      //借用增强for循环，可以很方便的遍历一个枚举中的常量
            System.out.println(s);
        }
    }
}
