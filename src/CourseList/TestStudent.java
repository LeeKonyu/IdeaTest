package CourseList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author : 猕猴桃
 * @create 2019/7/14 14:52
 */
public class TestStudent {
    public List<Course> list;
    public TestStudent(){
        this.list=new ArrayList <Course>();
    }
    public void Add(){
        Course []c={new Course(1,"线代"),new Course(2,"毛概")};
        list.addAll(Arrays.asList(c));
    }
    public void foreach(){
        for (Object obj:list){
            Course c=(Course)obj;
            System.out.println("课程信息："+c.getNum()+c.getName());
        }
    }
    public void testSetContains(){
        //提示输入课程名称
        System.out.println("请输入学生已选的课程名称：");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        Course course=new Course();
        course.setName(name);
        System.out.println("新创建课程："+course.getName());
        System.out.println("备选课程中是否包含课程："+list.contains(course));
    }

    public static void main(String[] args) {
        TestStudent ts=new TestStudent();
        ts.Add();
        ts.foreach();
        Student s=new Student(1,"小米");
        System.out.println("欢迎学生"+s.getName()+"选课");
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<2;i++){
            System.out.println("请输入课程id：");
            int id=sc.nextInt();
            for(Course cr:ts.list){
                if(cr.getNum()==id){
                    s.getCourses().add(cr);
                }
            }
        }
        for (Course c:s.getCourses()){
            System.out.println("学生"+s.getName()+"的课程选择了："+c.getNum()+c.getName());
        }
        ts.testSetContains();
    }
}
