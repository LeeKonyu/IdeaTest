package Thread_1;

/**
 * @author : 猕猴桃
 * @create 2019/7/16 11:26
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread："+i);
        }

    }
}
