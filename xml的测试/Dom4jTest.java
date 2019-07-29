package xml的测试;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;


/**
 * @author : 猕猴桃
 * @create 2019/7/29 9:23
 */
public class Dom4jTest {
    public static void main(String[] args) throws Exception {
        getTextContent();
    }
    public static void getTextContent() throws Exception {
        /*
         * 获取第二本书
         */

        //获取解析器对象
        SAXReader sr = new SAXReader();
        //解析XML，返回Document对象
        Document dc = sr.read(new File("E:\\IDEA-Project\\xml的测试\\book.xml"));
        //获取根节点
        Element el = dc.getRootElement();
        //得到根节点的第一个书节点
        Element e11 = el.element("书");
        //得到书节点下面的子节点数组
        List<Element> els = e11.elements();
        //添加子节点
        Element es = DocumentHelper.createElement("school");
        es.setText("东南大学");
        els.add(2, es);
        //回写
        OutputFormat of = OutputFormat.createPrettyPrint();
        XMLWriter xmw = new XMLWriter(new FileOutputStream(new File("E:\\IDEA-Project\\xml的测试\\book.xml")), of);
        xmw.write(dc);
        xmw.close();

    }
}
