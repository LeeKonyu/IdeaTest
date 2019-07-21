package Thread_1;

/**
 * @author : 猕猴桃
 * @create 2019/7/16 16:02
 */
public class ThreadDemo_1 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+i);
                }
            }
        }.start();


        TestRunnable r=new TestRunnable() {
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+i+"我");
                }
            }
        };
        new Thread(r).start();


        new Thread(new TestRunnable(){
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+i+"<---");
                }
            }
        }).start();

    }
}
