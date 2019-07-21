package file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author : 猕猴桃
 * @create 7/11/2019 3:01 PM
 */
public class TestReader {
    public static void main(String[] args) {
        File f1=new File("d:/lol.txt");
        File f2=new File("d:/cxk.txt");

        FileWriter fw=null;
        FileReader ffw=null;


        System.out.println("文件f1是否存在" + f1.exists());
        System.out.println("文件f2是否存在" + f2.exists());


        //对f1文件进行写入
        try{
            if(!f2.exists())
            {f2.createNewFile();}
            System.out.println("文件f1是否存在" + f1.exists());
            System.out.println("文件f2是否存在" + f2.exists());

            fw=new FileWriter(f1);
            char []c={'1','a','9','z'};
            fw.write(c);

            ffw=new FileReader(f2);
            ffw.read(c);
            for(char b:c)
                System.out.println(b);


        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                fw.close(); ffw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }



    }
}
