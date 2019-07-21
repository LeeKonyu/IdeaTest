package exception;

import java.util.Scanner;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 19:38
 */
public class ZiDingYiException {
    public int i=-1,j=11;
    static int x=10;
    Scanner scanner=new Scanner(System.in);
    class IndexIsNagetiveException extends Exception{
        public IndexIsNagetiveException(){

        }
        public IndexIsNagetiveException(String iine){
            super(iine);
        }
    }
    class IndexIsOutofRangeException extends Exception{
        public IndexIsOutofRangeException(){

        }
        public IndexIsOutofRangeException(String iiofre){
            super(iiofre);
        }
    }
    public void t()throws IndexIsNagetiveException{

        if(i<0)
            throw new IndexIsNagetiveException("i的下标为父异常");
    }
    public void tt()throws IndexIsOutofRangeException{
        if(j>x)
            throw new IndexIsOutofRangeException("i的下标超出范围异常");
    }

    public static void main(String[] args) {
        ZiDingYiException z=new ZiDingYiException();
        try{
            z.t();
        }catch (IndexIsNagetiveException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        try{
            z.tt();
        }catch (IndexIsOutofRangeException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
