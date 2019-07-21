package exception;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 17:42
 */
public class ErrorException {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<Integer.MAX_VALUE;i++){
            sb.append('a');
        }
    }
}
