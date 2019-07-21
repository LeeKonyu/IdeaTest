public class JiCheng2 {
    String name;
    int price;
    public JiCheng2(String Name, int Price){
        this.name=Name;
        this.price=Price;
    }
    public static void main(String[] args) {
        Ji j=new Ji("hujia",300,10);
        Ji j1=new Ji("suozijia",720,30);
        j.info();
        j1.info();
    }
}
class Ji extends JiCheng2{
    int ac;
    public Ji(String Name, int Price,int ac) {
        super(Name, Price);
        this.ac=ac;
    }
    public void info(){
        System.out.println(name+price+ac);
    }
}



