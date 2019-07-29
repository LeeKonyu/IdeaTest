package xml的测试.student;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

/**
 * @author : 猕猴桃
 * @create 2019/7/29 15:13
 */
public class StuService {

    //增加
    public static void addStu(Student student) throws Exception{
        /*
        * 1.创建解析器
        * 2.得到document
        * 3.获取到根节点
        * 4.在根节点上面创建stu标签
        * 5.在stu标签上面依次添加id，name，age
        * 6.在id，name，age上面依次添加值
        * 7.回写xml
        * */

        //创建解析器
        SAXReader saxReader=new SAXReader();
       //得到document
        Document document=saxReader.read(new File("E:\\IDEA-Project\\xml的测试\\student\\student.xml"));
        //得到根节点
        Element root=document.getRootElement();
        //在根节点上面添加stu
        Element stu=root.addElement("stu");
        //在stu标签上依次添加id，name，age标签
        Element id1=stu.addElement("id");
        Element name1=stu.addElement("name");
        Element age1=stu.addElement("age");
        //在三个标签上面添加值
        id1.setText(student.getId());
        name1.setText(student.getName());
        age1.setText(student.getAge());
        //回写
        OutputFormat outputFormat=OutputFormat.createPrettyPrint();
        XMLWriter xmlWriter=new XMLWriter(new FileOutputStream(new File("E:\\IDEA-Project\\xml的测试\\student\\student.xml")));
        xmlWriter.write(document);
        xmlWriter.close();
    }

    //删除，根据学生的id删除
    public static void  delRemove(String id) throws Exception{
        //创建解析器
        SAXReader saxReader=new SAXReader();
        //得到document
        Document document=saxReader.read(new File("E:\\IDEA-Project\\xml的测试\\student\\student.xml"));
        //获取所有的id    xpath: //id
        List<Node> list = document.selectNodes("//id");
        //遍历list集合
        for (Node node:list) {
            //得到id的值
            String idv=node.getText();
            if(idv.equals(id)){
                //得到stu节点
                Element stu=node.getParent();
                //获取stu的父节点
                Element student=stu.getParent();
                //删除stu节点
                student.remove(stu);
            }
        }
        //回写XML
        OutputFormat outputFormat=OutputFormat.createPrettyPrint();
        XMLWriter xmlWriter=new XMLWriter(new FileOutputStream(new File("E:\\IDEA-Project\\xml的测试\\student\\student.xml")));
        xmlWriter.write(document);
        xmlWriter.close();
    }

    //查询，根据学生id来查询信息
    public static Student reaserch(String id) throws  Exception{
        //创建解析器
        SAXReader saxReader=new SAXReader();
        //得到document
        Document document=saxReader.read(new File("E:\\IDEA-Project\\xml的测试\\student\\student.xml"));
        //获取所有的id    xpath: //id
        List<Node> list = document.selectNodes("//id");
        //创建Student对象
        Student student=new Student();

        for (Node node:list) {
            if(node.getText().equals(id)){
                Element stu=node.getParent();
                //通过stu获取name和age
                String name=stu.element("name").getText();
                String age=stu.element("age").getText();

                student.setId(node.getText());
                student.setName(name);
                student.setAge(age);
            }
        }
        return student;

    }
}
