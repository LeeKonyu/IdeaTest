package file;

import java.io.File;
import java.io.IOException;

/**
 * @author : 猕猴桃
 * @create 7/11/2019 9:12 AM
 */
public class TestFileb {
    public static void main(String[] args) throws IOException {
        File f=new File("c:/Windows");
        File min=null;
        File max=null;
        System.out.println("文件是否存在："+f.exists());
        if(f.exists()){
            File []fs=f.listFiles();
            for(File fi:fs) {
                if(!fi.isDirectory()) {
                    min=fi;
                    max=fi;
                    break;
                }
            }
            for(File file:fs){
                if(file.isFile()&&file.length()>0) {
                    min = file.length() <= min.length() ? file : min;
                    max = file.length() >= max.length() ? file : max;
                }
            }
        }

        System.out.println("最大的是"+max+"   字节：   "+max.length());
        System.out.println("最小的是"+min+"   字节：   "+min.length());
    }
}
