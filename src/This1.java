public class This1 {
    String name;
    float hp;
    String a="x";
    String b="x";

    public This1(String name){
        this.name=name;
        System.out.println("一个构造函数");
    }
    public This1(String name,float hp){
        this(name);
        this.name=name;
        this.hp=hp;
        System.out.println("两个构造函数");

    }

    public static void main(String[] args) {
        This1 this1=new This1("菲兹",8f);
        System.out.println(this1.a==this1.b);
        System.out.println(this1.a.equals(this1.b));
    }
}
