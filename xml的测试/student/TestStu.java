package xml的测试.student;

/**
 * @author : 猕猴桃
 * @create 2019/7/29 15:25
 */
public class TestStu {
    public static void main(String[] args) throws Exception {
        //testAdd();
        //testRemove();
        testReaserch();
    }
    //测试添加方法
    public static void testAdd() throws Exception{
        //设置一些值
        Student stu=new Student();
        stu.setId("102");
        stu.setName("wangwu");
        stu.setAge("50");
        StuService.addStu(stu);
    }
    //测试删除方法
    public static void testRemove() throws Exception{
        Student stu=new Student();
        stu.setId("102");
        String id=stu.getId();
        StuService.delRemove(id);
    }
    public static void testReaserch() throws Exception{
        Student student=StuService.reaserch("100");
        System.out.println(student.toString());
    }
}

