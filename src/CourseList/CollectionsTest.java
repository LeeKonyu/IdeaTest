package CourseList;

import java.util.*;

/**
 * @author : 猕猴桃
 * @create 2019/7/15 11:02
 */
public class CollectionsTest {

    //对Integer泛型的List进行排序
    public void testSort1(){
        List<Integer> integerList=new ArrayList<Integer>();
        Random random=new Random();
        Integer integer;
        for(int i=0;i<10;i++){
            do {
                integer = random.nextInt(100);
            }
            while (integerList.contains(integer));
            integerList.add(integer);
            System.out.println("成功添加整数"+integer);
        }
        System.out.println("-------排序前--------");
        for(Integer i:integerList)
            System.out.println(i);
        System.out.println("-------排序后--------");
        Collections.sort(integerList);
        for(Integer i:integerList)
            System.out.println(i);
    }
    //对String泛型的List进行排序
    public void testSort2(){
        List<String> stringList=new ArrayList<String>();
        stringList.add("qwer");
        stringList.add("asdf");
        stringList.add("zxcv");
        System.out.println("-------排序前--------");
        for(String s:stringList)
            System.out.println(s);
        Collections.sort(stringList);
        System.out.println("-------排序后--------");
        for(String s:stringList)
            System.out.println(s);
    }
    //以Student为例进行排序
    public void testSort3(){
        List<Student> list=new ArrayList<Student>();
        Student []students={new Student(1,"BOB"),new Student(2,"Alice"),new Student(3,"TOM")};
        list.addAll(Arrays.asList(students));
        System.out.println("----------排序前----------");
        for(Student stu:list){
            System.out.println("该学生姓名为："+stu.getName());
        }
        Collections.sort(list);
        System.out.println("----------排序后----------");
        for(Student stu:list){
            System.out.println("该学生姓名为："+stu.getName());
        }
        Collections.sort(list,new StudentComparator());
        System.out.println("----------排序后----------");
        for(Student stu:list){
            System.out.println("该学生姓名为："+stu.getName());
        }
    }
    public static void main(String[] args) {
        CollectionsTest ct=new CollectionsTest();
//        ct.testSort1();
//        ct.testSort2();
        ct.testSort3();
    }
}
