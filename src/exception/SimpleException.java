package exception;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 17:39
 */
public class SimpleException {
    public static void main(String[] args) {
        //除数为0
        int k=5/0;
        //下标越界
        int []j=new int[5];
        j[10]=10;
        //空指针
        String str=null;
        str.length();

    }
}
