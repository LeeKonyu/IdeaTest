package Thread_1;

/**
 * @author : 猕猴桃
 * @create 2019/7/16 15:28
 */
public class Clock {
    public static void main(String[] args) {
        for (int i = 1; i <=60 ; i++) {
            System.out.println(i);

            //让线程每秒暂停一次
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
