public class ChongZai {
    public static void main(String[] args) {
        ChongZai chongZai=new ChongZai();
        chongZai.p(1,2);
        p(1,2);
        chongZai.p(1,2,3);
        chongZai.p(1,3.2);
    }
    public static void  p(int a,int b){
        int sum=a+b;
        System.out.println("sum="+sum);
    }
    public void p(int a,int b,int c){
        int sum=a+b+c;
        System.out.println("sum="+sum);
    }
    public double p(int a,double b){
        double sum=a+b;
        return sum;
    }
}
