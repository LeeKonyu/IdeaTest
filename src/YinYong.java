import java.util.Scanner;

public class YinYong {
    public String name;
    protected float hp;

    public static void main(String[] args) {
        YinYong h1 = new YinYong();
        YinYong h2 = new YinYong();
        YinYong h3;
        YinYong h4;
        h3 = h1;
        h4 = h3;
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println(name);
    }
}
