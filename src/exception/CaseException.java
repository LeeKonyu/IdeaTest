package exception;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 17:23
 */
public class CaseException {

    public static int method(){
        try{
            System.out.println(1);
            return 1;
        }
        catch (Exception e){
            System.out.println(2);
            return 2;
        }
        finally {
            System.out.println(3);
            return 3;
        }
    }
    public static void main(String[] args) {
        System.out.println(method());
    }
}
