package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 16:49
 */
public class TestException {
    public static void main(String[] args) {
        File f=new File("d:/LOL.exe");


        //试图打开文件LOL.exe，会抛出FileNotFoundException，
        //如果不处理该异常，就会有编译错误
        //new FileInputStream(f);
        try{
            System.out.println("试图打开");
            new FileInputStream(f);
            System.out.println("成功打开");
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM--dd");
            Date d=sdf.parse("2019-07-10");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("文件不存在");
        }
        catch (ParseException e){
            System.out.println("地址解析格式错误");
            e.printStackTrace();
        }
        finally {
            System.out.println("无论怎样finally块中的代码都会被调用");
        }

    }
}
