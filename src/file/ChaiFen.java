package file;

import java.io.File;

/**
 * @author : 猕猴桃
 * @create 7/11/2019 2:34 PM
 */
public class ChaiFen {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\Envy\\Desktop\\Learning folder\\123.txt");
        System.out.println(f.length());
        File []fs=null;
        fs=f.listFiles();
        for(File fl:fs){
            
        }

    }
}
