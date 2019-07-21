package file;

import java.io.File;

/**
 * @author : 猕猴桃
 * @create 7/11/2019 10:04 AM
 */
public class BianLia {
    public static void searchFile(File f){
        File []fs=f.listFiles();
        for(File fi:fs){
            if(fi.isFile())
                System.out.println(fi.getAbsolutePath());
            else if(fi.isDirectory())
                searchFile(fi);
        }
    }

    public static void main(String[] args) {
        File f=new File("d:\\Steam");
        searchFile(f);
    }
}
