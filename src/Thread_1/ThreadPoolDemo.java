package Thread_1;

/**
 * @author : 猕猴桃
 * @create 2019/7/16 21:20
 */
public class ThreadPoolDemo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"   "+i);
        }
    }
}
