package Thread_1;

/**
 * @author : 猕猴桃
 * @create 2019/7/16 17:26
 */
public class ThreadDemo_2 {
    public static void main(String[] args) {

        //实现接口，得到线程的实现类对象的引用
        TestRunnable runnable=new TestRunnable();

        //然后创建Thread并启动线程
        Thread t1=new Thread(runnable);
        Thread t2=new Thread(runnable);
        t1.start();
        t2.start();
    }

}
