public class This {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public This(String Name,float Armor){
        this.name=Name;
        this.armor=Armor;
        System.out.println("第一个构造函数");
    }
    public This(String Name,float Hp,float Armor,int MoveSpeed){
        this(Name,Armor);
        this.name=Name;
        this.hp=Hp;
        this.armor=Armor;
        this.moveSpeed=MoveSpeed;
        System.out.println("第二个构造函数");
    }

    public static void main(String[] args) {
        This tt=new This("扎克",120f);
        System.out.println(tt.name);
        This t=new This("菲兹",520f,62f,330);
        System.out.println(t.name);
    }
}
