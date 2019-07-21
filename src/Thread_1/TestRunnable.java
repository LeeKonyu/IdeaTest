package Thread_1;

/**
 * @author : 猕猴桃
 * @create 2019/7/16 17:27
 */
//创建Runnable的接口类
public class TestRunnable implements Runnable{
    private int ticket=100;
    Object obj=new Object();

    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                    ticket--;
                }
            }
        }
    }
}
