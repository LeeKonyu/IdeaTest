public class Test1{
     int age=20;


    public  Test1(){
        System.out.println("这是无参的构造方法"+age);
    }
    public  Test1(int Age){
        age=Age;
        System.out.println("这是带参的构造方法"+age);
    }
    public Test1(int AAge,float a){
        this(AAge);
        System.out.println("这是this带参的构造方法"+AAge);
    }
    public  void setAge(int age) {
        this.age = age;
    }

    public  int getAge() {
        System.out.println("这是方法赋值的年龄："+age);
        return age;
    }

    public static void main(String[] args) {
//        Test1 t=new Test1();
//        t=new Test1(10);
//        t=new Test1(100,0);
        Test1 t = new Test1();
        t.setAge(40);
        t.getAge();
    }
}