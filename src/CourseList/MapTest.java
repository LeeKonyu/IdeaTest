package CourseList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author : 猕猴桃
 * @create 2019/7/14 16:14
 */
public class MapTest {
    public Map<Integer,Student> studentMap;
    public MapTest(){
        this.studentMap=new HashMap<Integer, Student>();
    }
    //添加学生信息
    public void Put(){
        Scanner scanner=new Scanner(System.in);
        int i=0;
        while(i<3){
            System.out.println("请输入学生ID");
            int id=scanner.nextInt();
            Student st=studentMap.get(id);
            if(st==null){
                System.out.println("输入学生姓名");
                String name=scanner.next();
                Student student=new Student(id,name);
                studentMap.put(id,student);
                System.out.println("成功添加学生："+studentMap.get(id).getName());
                i++;
            }
            else{
                System.out.println("该学生ID已被占用");
            }
        }
    }
    //测试Map的keySet方法
    public void keyset(){
        //通过keySet方法，返回Map中的所有"键"的Set集合
        Set<Integer> ks=studentMap.keySet();
        System.out.println("总共有"+studentMap.size()+"个学生");
        //遍历ks，取得每一个键，再调用get方法取得每个键对应的value
        for (int s:ks){
            Student st=studentMap.get(s);
            if (st!=null){
                System.out.println("学生"+st.getName());
            }
            else{
                System.out.println("该学生不存在");
            }
        }
    }
    //测试remove方法
    public void testRemove(){
        Scanner s=new Scanner(System.in);
        while (true){
            System.out.println("请输入你要删除的学生对象的ID");
            int i=s.nextInt();
            Student st=studentMap.get(i);
            if (st==null){
                System.out.println("该ID不存在");
                continue;
            }
            studentMap.remove(i);
            System.out.println("成功删除学生"+st.getName());
            break;
        }
    }

    //测试entrySet方法
    public void testEntrySet(){
        Set<Map.Entry<Integer, Student>> entry=studentMap.entrySet();
        for (Map.Entry<Integer,Student> e:entry
             ) {
            System.out.println("取得键："+e.getKey());
            System.out.println("取得值："+e.getValue().getName());
        }
    }
    //修改Map中的学生
    public void  xiuGai(){
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("请输入要修改的学生ID");
            int id=scanner.nextInt();
            Student st=studentMap.get(id);
            if (st==null){
                System.out.println("该学生不存在");
                continue;
            }
            System.out.println("该ID存在，请输入你要修改学生姓名");
            String name=scanner.next();
            Student newStudent=new Student(id,name);
            studentMap.put(id,newStudent);
            System.out.println("该学生id为"+newStudent.getId()+"姓名为"+newStudent.getName());
            break;
        }
    }
    //测试Map中，是否包含某个Key值或者某个Value值
    public void testContainsKeyOrValue(){
        System.out.println("请输入要查询的学生ID");
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        //再Map中，用containsKey()方法，来判断是否包含某个Key值
        System.out.println("该学生ID是否存在："+studentMap.containsKey(id));
        if(studentMap.containsKey(id)){
            System.out.println("对应的学生姓名为："+studentMap.get(id).getName());
        }
        //用containsValue()方法，来判断是否包含某个Value值
        System.out.println("请输入要查询的学生姓名");
        String name=sc.next();
        Student student=new Student(0,name);
        System.out.println("该学生姓名是否存在："+studentMap.containsValue(student));

    }
    public static void main(String[] args) {
        MapTest mt=new MapTest();
        mt.Put();
        //mt.keyset();
        //mt.testRemove();
        //mt.testEntrySet();
        //mt.xiuGai();
        //mt.testEntrySet();
        mt.testEntrySet();
        mt.testContainsKeyOrValue();

    }
}
