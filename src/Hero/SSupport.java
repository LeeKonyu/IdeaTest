package Hero;

public class SSupport extends Hero implements Healer{
    @Override
    public void heal() {
        System.out.println("进行了治疗");
    }
}
