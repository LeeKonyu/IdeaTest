public class JiCheng3 {
    int age;
    String name;
    public JiCheng3(int Age,String Name){
        this.age=Age;
        this.name=Name;
    }

    public static void main(String[] args) {
        JC jc=new JC(18,"吴彦祖",200);
        JiCheng3 jc3=new JC(19,"twq",421);
        jc.info();
        System.out.println(jc3.name);
    }
}
class JC extends JiCheng3{
    int ad;
    public JC(int Age,String Name,int Ad){
        super(Age,Name);
        this.ad=Ad;
    }
    public void info(){
        System.out.println(age+"..."+name+"..."+ad);
    }
}
