package file;

import java.io.*;

/**
 * @author : 猕猴桃
 * @create 2019/7/12 8:47
 */
public class IORW {
    public static void main(String[] args) throws IOException {
        FileInputStream f=new FileInputStream("d:/lol.txt");
        InputStreamReader in=new InputStreamReader(f,"utf-8");
        FileOutputStream fo=new FileOutputStream("d:/cxk.txt");
        OutputStreamWriter out =new OutputStreamWriter(fo);

//        int x;
//        //从in中读取字符
//        while ((x=in.read())!=-1){
//            System.out.println((char)x);
//        }
//        //创建数组
//        char []c=new char[8*1024];
//        int a;
//        //批量读取，放入buffer这个字符数组，从第0个位置开始放，最多放c.length个
//        //返回的是读到的字符的个数
//        while((a=in.read(c,0,c.length))!=-1){
//            String s=new String(c,0,a);
//            System.out.println(s);
//        }
//        int a;
//        char []c=new char[8*1024];
//        while ((a=in.read(c,0,c.length))!=-1){
//            out.write(c,0,a);
//            out.flush();
//        }
        char []c={'1','2','z','w'};
        out.write(c);
        out.flush();

        in.close();
        out.close();
        FileReader fr=new FileReader("d:/cxk.txt");
        FileWriter fw=new FileWriter("d:/lol.txt",true);

        char []ca=new char[8*1024];
        int i;
        while((i=fr.read(ca,0,ca.length))!=-1){
            fw.write(ca,0,i);
            fw.flush();
        }
        fr.close();
        fw.close();
    }
}
