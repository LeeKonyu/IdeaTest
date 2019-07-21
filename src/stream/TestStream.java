package stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : 猕猴桃
 * @create 7/11/2019 9:37 AM
 */
public class TestStream {
    public static void main(String[] args) {

        try{
            File file=new File("d:/LOL.txt");
            FileOutputStream ff=new FileOutputStream(file);
            String s="五类让我去";
            ff.write(s.getBytes());
            System.out.println();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
