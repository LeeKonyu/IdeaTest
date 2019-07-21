package CourseList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author : 猕猴桃
 * @create 2019/7/12 17:46
 */
public class FanXing {
    public List<Course> courses;
    public FanXing(){
        this.courses=new ArrayList<Course>();
    }
    //测试增加
    public void Add(){
        Course c=new Course(30,"翁迪");
        courses.add(c);
        Course c1=courses.get(0);
        System.out.println("增加后的泛型指针中的数据："+c1.getNum()+":"+c1.getName());
    }
    public void shuchu(){
        Iterator in= courses.iterator();
        System.out.println("使用迭代器输出数据");
        while(in.hasNext()){
            Course c=(Course)in.next();
            System.out.println("增加后的泛型指针中的数据："+c.getNum()+":"+c.getName());
        }
    }

    //若已经规定泛型，则可以使用这样的for each
    public void foreach(){
        System.out.println("使用for each输出数据");
        courses.add(new Course(19,"rwq"));
        Course []cs={new Course(19,"iam"),new Course(30,"twq")};
        courses.addAll(Arrays.asList(cs));
        for(Course course:courses){
            System.out.println("增加后的泛型指针中的数据："+course.getNum()+":"+course.getName());
        }
    }

    public static void main(String[] args) {
        FanXing fx=new FanXing();
        fx.Add();
        fx.shuchu();
        fx.foreach();
    }
}
