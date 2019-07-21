package Hero;

import java.util.*;

public class Support {
    int hp;
    int blood;
    String name;
    public Support(String name,int blood){
        this.blood=blood;
        this.name=name;
        System.out.println(name+"加血前的血为"+blood);
    }
    public void addHp(Support support,int hp){
        support.blood=support.blood+hp;
        System.out.println(support.name+"加血后的血为"+support.blood);
    }
    /*public void addhp(Support support){
        Scanner s=new Scanner(System.in);
        hp=s.nextInt();
        blood=blood+hp;
        System.out.println(blood);
    }*/

    public static void main(String[] args) {
        Support s=new Support("风女",2100);
        s.addHp(s,200);
        //s.addhp(s);
    }
}
