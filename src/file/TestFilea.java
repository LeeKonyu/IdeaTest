package file;

import java.io.File;
import java.util.Date;

/**
 * @author : 猕猴桃
 * @create 7/11/2019 8:49 AM
 */
public class TestFilea {
    public static void main(String[] args) {
        File f=new File("C:/Users/Envy/Desktop/1.png");
        System.out.println("当前文件是："+f);
        //判断文件是否存在
        System.out.println("判断是否存在"+f.exists());
        //判断文件是否十文件夹
        System.out.println("判断是否是文件夹"+f.isDirectory());
        //判断是否为文件
        System.out.println("判断是否为文件："+f.isFile());
        //文件长度
        System.out.println("文件长度："+f.length());

        //文件最后的修改时间
        long time=f.lastModified();
        Date d=new Date(time);

        System.out.println("获取文件的最后修改时间："+d.toString());
        //设置文件修改时间为1970.1.1 08:00:00
        f.setLastModified(0);

        //文件重命名
        File f2=new File("C:/Users/Envy/Desktop/2.png");
        f.renameTo(f2);
        System.out.println("将1.png改成了2.png");

        File f3=new File("C:/Users/Envy/Desktop/1.png");
        f2.renameTo(f3);
        System.out.println("将2.png改成了1.png");
    }
}
