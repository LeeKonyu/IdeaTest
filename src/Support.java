public class Support extends Heros{
    public void heal(){
        System.out.println("没有英雄被治疗");
    }
    public void heal(Heros h){
        System.out.println(name+"治疗了"+h.name);
    }
    public void heal(Heros h,int hp){
        //this.hp=hp;
        System.out.println(name+"治疗了"+h.name+hp+"滴血");
    }

    public static void main(String[] args) {
        Support support=new Support();
        support.name="众星之子";
        Heros heros=new Heros();
        heros.name="深渊巨口";
        heros.hp=200;
        support.heal();
        support.heal(heros);
        support.heal(heros,heros.hp);
    }
}
