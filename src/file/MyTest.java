package file;

import java.io.*;

/**
 * @author : 猕猴桃
 * @create 2019/7/12 19:58
 */
public class MyTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader in=new InputStreamReader(new FileInputStream("d:/lol.txt"),"utf-8");
        OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream("d:/cxk.txt"),"utf-8");

        int i;
        char []s=new char[8*1024];
        while ((i=in.read(s,0,s.length))!=-1){
            out.write(s,0,i);
            out.flush();
        }
        in.close();
        out.close();
    }
}
