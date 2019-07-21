package Thread_1;

/**
 * @author : 猕猴桃
 * @create 2019/7/16 11:26
 */
public class TestThread {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("test："+i);
        }
    }
}
