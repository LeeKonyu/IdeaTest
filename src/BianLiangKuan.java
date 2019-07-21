public class BianLiangKuan {
    public static void main(String[] args) {
        //主方法对应的块(查看各个块的执行速度)
        System.out.println("主方法对应的块");
        {
            //普通块
            System.out.println("普通块");
        }
    }
    static {//静态块
        System.out.println("静态块");
    }
}
