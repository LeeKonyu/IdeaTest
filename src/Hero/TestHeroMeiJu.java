package Hero;

import java.util.Scanner;

public class TestHeroMeiJu {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        for(HeroMeiJu h:HeroMeiJu.values()){
            switch (h){
                case TANK:
                    System.out.println("坦克");
                    break;
                case WIZARD:
                    System.out.println("法师");
                    break;
                case PUSH:
                    System.out.println("推进");
                    break;
                case ASSIST:
                    System.out.println("辅助");
                    break;
                case WARRIOR:
                    System.out.println("战士");
                    break;
                case ASSASSIN:
                    System.out.println("刺客");
                    break;
                case RANGED:
                    System.out.println("远程");
                    break;
                case FARMING:
                    System.out.println("打野");
                    break;
            }
        }
    }
}
