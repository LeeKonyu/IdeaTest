package Hero;

public class Girl {
    public void smile(){
        System.out.println("girl smile()...");
    }
}
class MMGirl extends Girl{

    @Override
    public void smile() {

        System.out.println("MMirl smile sounds sweet...");
    }
    public void c(){
        System.out.println("MMirl c()...");
    }
}
class Main{

    public static void main(String[] args) {

        Girl g1=new MMGirl(); //向上转型
        g1.smile();

        MMGirl mmg=(MMGirl)g1; //向下转型,编译和运行皆不会出错
        mmg.smile();
        mmg.c();


        Girl g2=new Girl();
//    MMGirl mmg1=(MMGirl)g2; //不安全的向下转型,编译无错但会运行会出错
//    mmg1.smile();
//    mmg1.c();
        /*output:
         * CGirl smile sounds sweet...
         * CGirl smile sounds sweet...
         * CGirl c()...
         * Exception in thread "main" java.lang.ClassCastException: com.wensefu.other1.Girl
         * at com.wensefu.other1.Main.main(Girl.java:36)
         */
        if(g2 instanceof MMGirl){
            MMGirl mmg1=(MMGirl)g2;
            mmg1.smile();
            mmg1.c();
        }

    }
}