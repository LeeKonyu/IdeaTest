package Hero;

public class TestGiantDragon {
    public static void main(String[] args) {
        //GiantDragon g=new GiantDragon();
        GiantDragon g1=GiantDragon.dragon();
        GiantDragon g2=GiantDragon.dragon();
        GiantDragon g3=GiantDragon.dragon();

        System.out.println(g1==g2);
        System.out.println(g1==g3);
        System.out.println(g2==g3);
    }
}
