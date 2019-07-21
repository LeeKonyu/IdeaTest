public class ADHero extends Heros {
    public void attack(){
        System.out.println("没有英雄被攻击");
    }
    public void attack(Heros h1){
        System.out.println(name+"攻击了"+h1.name);
    }
    public void attack(Heros h1,Heros h2){
        System.out.println(name+"攻击了"+h1.name+"和"+h2.name);
    }
    public void attack(Heros ... heros){
        for (int i=0;i<heros.length;i++){
            System.out.println(name+"攻击了"+heros[i].name);
        }
    }

    public static void main(String[] args) {
        ADHero adHero=new ADHero();
        adHero.name="风清扬";
        Heros h1=new Heros();
        h1.name="郭靖";
        Heros h2=new Heros();
        h2.name="令狐冲";
        Heros h3=new Heros();
        h3.name="张无忌";
        adHero.attack();
        adHero.attack(h1);
        adHero.attack(h1,h2);
        adHero.attack(h1,h2,h3);
    }
}
