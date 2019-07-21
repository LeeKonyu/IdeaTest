package DT;
/**
 * @author : 猕猴桃
 * @create 2019/7/10 10:20
 */
public class IHero {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void diaoyong(Mortal m){
        System.out.println(name);
        m.die();
    }

    public void finalize(){
        System.out.println("this hero has been deleting");
    }

    public static void main(String[] args) {
//        IHero i=new IHero();
//        i.name="garlen";
//        ADHero ad=new ADHero();
//        APHero ap=new APHero();
//        ADAPHero adap=new ADAPHero();
//        i.diaoyong(ad);
//        i.diaoyong(ap);
//        i.diaoyong(adap);
        IHero i;
        for(int j=0;j<100;j++){
            i=new IHero();
            i.finalize();
        }
    }
}
