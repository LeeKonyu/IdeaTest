package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : 猕猴桃
 * @create 7/11/2019 11:51 AM
 */
public class OutputA {
    public static void main(String[] args) {
        File f=new File("d:/xyz/cxk.txt");
        File ff=f.getParentFile();
        FileOutputStream fo=null;
        String b="噶就看过撒娇可提前";
        if(!ff.exists()){
            ff.mkdirs();
        }

        try {
            fo=new FileOutputStream(f);
            fo.write(b.getBytes());
            System.out.println(fo);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
