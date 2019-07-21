public class ShuZu {
    public static void main(String[] args) {
        //写法一
        int[] a;
        a =new int[5];
        a[0]=(int)(Math.random()*100);
        a[1]=(int)(Math.random()*100);
        a[2]=(int)(Math.random()*100);
        a[3]=(int)(Math.random()*100);
        a[4]=(int)(Math.random()*100);
        //写法二
        int [] b=new int[5];
        //写法三
        int [] c=new int[]{21,432,643,321,2};
        //写法四
        int [] d={421,532,321,543,1};

        //
        int [] e=new int[5];
        for(int i=0;i<5;i++){
            e[i]=(int)(Math.random()*100);
        }
        System.out.println("数组中的随机数为：");
        for(int i=0;i<5;i++){
            System.out.println(e[i]);
        }
        System.out.println("增强型for循环");
        for(int x: e){
            System.out.println(x);
        }
        System.out.println("使用增强型for循环找出最大数：");
        int max=e[0];
        for(int y:e){
            if(y>max){
                max=y;
            }
        }
        System.out.println(max);

        System.out.println("数组实现反转效果：");
        int t=e[0];
        for(int i=0;i<e.length/2;i++){
            t=e[i];e[i]=e[4-i];e[4-i]=t;
        }
        for(int i=0;i<e.length;i++){
            System.out.println(e[i]);
        }





        System.out.println("数组中的随机数为：");
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
        //选择排序
        int tt;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    t=a[i];a[i]=a[j];a[j]=t;
                }
            }
        }
        System.out.println("排序之后为：");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        //冒泡法排序
        int ttt;
        System.out.println("排序之后为：");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]<a[j+1]){
                    ttt=a[j];a[j]=a[j+1];a[j+1]=ttt;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }



        System.out.println("本练习的目的是，找出最小的一个值：");
        int temp;
        temp=a[0];
        for(int i=0;i<5;i++){
            if(temp>a[i]){
                temp=a[i];
            }
        }
        System.out.println(temp);
    }
}
