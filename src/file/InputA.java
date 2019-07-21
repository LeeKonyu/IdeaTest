package file;

import java.io.*;

/**
 * @author : 猕猴桃
 * @create 7/11/2019 11:26 AM
 */
public class InputA {
    public static void main(String[] args) {
        File f=new File("d:/lol.txt");
        try {

            FileInputStream file=new FileInputStream(f);
            //创建字节数组
            byte []all=new byte[(int)f.length()];
            //读取文件内容
            file.read(all);
            for(byte b:all){
                System.out.println(b);
            }
            file.close();
            FileOutputStream ff=new FileOutputStream(f);
            byte []x={'a','g','2','r',10};
            ff.write(x);
            for (byte y:x){
                System.out.println(y);
            }
            ff.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
