package Hash;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 21:29
 */
public class Yuan {
    private HashMap<Integer, String> yuannames = new HashMap<Integer, String>();
    private int i;

    public void set(int i){
        this.i=i;
    }
    public String toString(){
        return ""+i;
    }

    public Yuan() {
        yuannames.put(1, "一块");
        yuannames.put(5, "五块");
        yuannames.put(10, "十块");
        yuannames.put(20, "二十块");
        yuannames.put(50, "五十块");
        yuannames.put(100, "一百块");
    }

    public String getName(int s) {
        if (yuannames.containsKey(s))
            return yuannames.get(s);
        else
            return "该值不存在于HashMap容器中";
    }

    public static void main(String[] args) {
        int []j={1,2,3,8};
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            int num = scanner.nextInt();
            Yuan yuan = new Yuan();
            String name = yuan.getName(num);
            System.out.println(name);
        }
        for(int i:j){
            System.out.println(i);
        }
        Yuan y=new Yuan();
        y.set(10);
        System.out.println(y);
    }
}
