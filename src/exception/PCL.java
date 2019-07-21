package exception;

import java.io.FileNotFoundException;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 19:15
 */
public class PCL {
    public static void main(String[] args) {
        try{
            t();
        }catch (Throwable e){
            e.printStackTrace();
        }
    }
    public static void t()throws Throwable{
        throw new FileNotFoundException();
    }
}
