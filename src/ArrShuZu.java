import java.util.Arrays;

public class ArrShuZu {
    public static void main(String[] args) {
        int a[]=new int[]{2,5,1,4,8};
    //数组复制
        int b[]=Arrays.copyOfRange(a,0,3);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
     //转换为字符串
        String dayin=Arrays.toString(a);
        System.out.println(dayin);
     //数组排序（从小到大）
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
     //数组中的数搜索（需要先进行排序）
        System.out.println(Arrays.binarySearch(a,1));
     //判断数组是否相同
        System.out.println(Arrays.equals(a,b));
     //数组填充
        int c[]=new int[10];
        Arrays.fill(a,3);
        System.out.println(Arrays.toString(a));
        int d[]=new int[3];
        a[0]=(int)(Math.random());
    }
}
