package xml的测试;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

/**
 * @author : 猕猴桃
 * @create 2019/7/29 14:55
 */
public class Dom4jXpathTest {
    public static void main(String[] args) throws Exception {
        //创建解析器
        SAXReader saxReader=new SAXReader();
        Document document=saxReader.read(new File("E:\\IDEA-Project\\xml的测试\\book.xml"));
        //使用selectNodes()方法得到所有的简介元素
        List<Node> list=document.selectNodes("//简介");
        //遍历list集合
        for (Node node:list) {
            String jianjie=node.getText();
            System.out.println(jianjie);
        }
    }
}
