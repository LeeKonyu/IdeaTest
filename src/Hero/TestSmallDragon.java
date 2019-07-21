package Hero;

public class TestSmallDragon {
    public static void main(String[] args) {
        //SmallDragon smallDragon=new SmallDragon();
        SmallDragon s1=SmallDragon.getSmallDragon();
        SmallDragon s2=SmallDragon.getSmallDragon();
        SmallDragon s3=SmallDragon.getSmallDragon();

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1==s3);
    }
}
