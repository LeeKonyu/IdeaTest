package Thread_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author : 猕猴桃
 * @create 2019/7/16 21:20
 */
public class PoolMain {
    public static void main(String[] args) {
        //使用线程池工厂类中的Executors里面的静态方法newFixedThreadPool生产一个具有一定线程数量的线程池
        ExecutorService es= Executors.newFixedThreadPool(2);
        ThreadPoolDemo tpd=new ThreadPoolDemo();
        Thread t1=new Thread(tpd);
        Thread t2=new Thread(tpd);

        es.submit(t1);
        es.submit(t2);

        t1.start();
        t2.start();

        es.shutdown();
    }
}
