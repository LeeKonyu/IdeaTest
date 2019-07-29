package xml的测试;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

/**
 * @author : 猕猴桃
 * @create 2019/7/29 11:40
 */
public class Dom4jTest2 {
    public static void main(String[] args) throws Exception{
        getValues();
    }
    public static void getValues() throws  Exception{
        //创建解析器
        SAXReader sax=new SAXReader();
        //获得Document对象
        Document document=sax.read(new File("E:\\IDEA-Project\\xml的测试\\book.xml"));
        //获得父节点
        Element fu=document.getRootElement();
        Element book1=fu.element("书");
        Attribute attribute=book1.attribute("出版社");
        System.out.println(book1.remove(attribute));
    }
}
