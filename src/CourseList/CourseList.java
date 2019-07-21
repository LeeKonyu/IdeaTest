package CourseList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author : 猕猴桃
 * @create 2019/7/12 15:36
 */
public class CourseList {
   public List toListCourse;

   public CourseList(){
       this.toListCourse=new ArrayList();
   }
   //向链表中填入数据
   public void TestList(){
       Course c1=new Course(10,"高等数学");
       toListCourse.add(c1);
       Course c2=(Course) toListCourse.get(0);
       System.out.println("测试结果："+c2.getNum()+"---"+c2.getName());
       System.out.println("-----------------------------");
       //将对象数组装入链表中
       Course []cs={new Course(90,"英语"),new Course(71,"离散数学")};
       toListCourse.addAll(Arrays.asList(cs));

   }
   //从链表中写出数据
    public void TestInquire(){
       for(int i=0;i<toListCourse.size();i++){
           Course cr=(Course)toListCourse.get(i);
           System.out.println("测试结果:"+cr.getNum()+"---"+cr.getName());
       }
        System.out.println("-----------------------------");
    }
    //使用迭代器写出数据
    public void DDQ(){
        Iterator it=toListCourse.iterator();
        while(it.hasNext()){
            Course c=(Course) it.next();
            System.out.println("测试结果:"+c.getNum()+"---"+c.getName());
        }
        System.out.println("-----------------------------");
    }
    //使用for each写出数据
    public void forEach(){
       for (Object obj:toListCourse){
           Course c=(Course)obj;
           System.out.println("测试结果:"+c.getNum()+"---"+c.getName());
       }
        System.out.println("-----------------------------");
    }
    //进行数据修改
    public void Modify(){
       Course c=new Course(100,"英格利希");
       toListCourse.set(1,c);
       System.out.println("-----------------------------");
    }
    //进行数据删除
    public void delete(){
        //Course c=new Course(100,"英格利希");
        toListCourse.remove(1);
        System.out.println("-----------------------------");
    }
    public void deleteall(){
       Course []cs={new Course(10,"qwe"),new Course(2,"das"),new Course(30,"zxc")};
       toListCourse.addAll(Arrays.asList(cs));
       Iterator it=toListCourse.iterator();
       while(it.hasNext()){
           Course c=(Course) it.next();
           System.out.println("测试结果:"+c.getNum()+"---"+c.getName());
       }
        System.out.println("-----------------------------");
        System.out.println("进行全部删除");
       toListCourse.removeAll(Arrays.asList(cs));
       for(Object obj:toListCourse){
           Course course=(Course)obj;
           System.out.println("测试结果:"+course.getNum()+"---"+course.getName());
       }
    }
    public static void main(String[] args) {
        CourseList cls=new CourseList();
        cls.TestList();
        cls.TestInquire();
        cls.DDQ();
        cls.forEach();
        cls.Modify();
        cls.forEach();
        cls.delete();
        cls.forEach();
        cls.deleteall();
    }
}
