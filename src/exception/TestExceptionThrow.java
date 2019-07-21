package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 17:14
 */
public class TestExceptionThrow {
    public static void main(String[] args) {
        method1();
    }
    private static void method1(){
        try{
            method2();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("LOL.exe不在D盘根目录");
        }
    }
    private static void method2 ()throws FileNotFoundException {
        File file=new File("d:/LOL.exe");
        System.out.println("尝试打开lol");
        new FileInputStream(file);
        System.out.println("打开了lol");
    }
}
