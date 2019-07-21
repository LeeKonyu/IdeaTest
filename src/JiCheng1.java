public class JiCheng1 extends JiCheng {
    static int ac;

    public static void main(String[] args) {
        JiCheng1 j=new JiCheng1();
        j.name="布甲";
        j.price=300;
        j.ac=10;
        System.out.println("该护甲名称："+name+"价格："+price+"护甲值："+ac);
        j.name="布甲";
        j.price=300;
        j.ac=10;
        System.out.println("该护甲名称："+name+"价格："+price+"护甲值："+ac);

    }
}
