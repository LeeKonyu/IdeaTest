package file;

import java.io.*;

/**
 * @author : 猕猴桃
 * @create 2019/7/12 10:25
 */
public class Obout {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream ob=new ObjectOutputStream(new FileOutputStream("d:/lol.dat"));
        Student s=new Student("14","刘德华",100);
        ob.writeObject(s);
        ob.flush();
        ob.close();
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("d:/lol.dat"));
        Student stu=(Student)in.readObject();
        System.out.println(stu);
        in.close();
    }
}
