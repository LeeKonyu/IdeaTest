package Thread_1;

/**
 * @author : 猕猴桃
 * @create 2019/7/16 20:22
 */
public class ThreadDemo_3 {
    public static void main(String[] args) {
        Object obj=new Object();

        new Thread((new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("敌军还有5秒到达战场，碾碎他们！");
                    try {
                        obj.wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        })).start();;

        new Thread((new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj){
                    System.out.println("敌军已经到达！");
                    obj.notify();
                }
            }
        })).start();
    }
}
