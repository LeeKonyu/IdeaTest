package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : 猕猴桃
 * @create 2019/7/11 21:55
 */
public class ZiJiePiLiang {
    public static void copyFile(File srcFile,File destFile)throws IOException{
        if(!srcFile.exists())
            throw new IllegalArgumentException(srcFile+"文件不存在");
        if(!srcFile.isFile())
            throw new IllegalArgumentException(srcFile+"不是文件");
        FileInputStream in=new FileInputStream(srcFile);
        FileOutputStream out =new FileOutputStream(destFile);

        byte []buf =new byte[8*1024];
        int b;
        while((b=in.read(buf,0,buf.length))!=-1){
            out.write(buf,0,b);
            out.flush();//最好加上进行缓冲
        }
        in.close();
        out.close();
    }
}
