package Hero;

public class SmallDragon {
    private SmallDragon(){

    }
    private static SmallDragon smallDragon;
    public static SmallDragon getSmallDragon(){
        if (null==smallDragon){
            smallDragon=new SmallDragon();
        }
        return smallDragon;
    }

}
