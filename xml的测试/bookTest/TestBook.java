package xml的测试.bookTest;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
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
 * @create 2019/7/29 16:22
 */
public class TestBook {

    public static void main(String[] args) throws Exception {
        fineUser();
    }

    //读取文档中的数据
    public static void readText () throws Exception{
        SAXReader reader=new SAXReader();//得到解析器对象
        //通过解析器对象得到文档对象
        Document document=reader.read(new File("E:\\IDEA-Project\\xml的测试\\bookTest\\book.xml"));
        //得到根节点（此处的根节点是“书架”）
        Element root=document.getRootElement();
        //得到子节点“书”的子节点“书名”
        Element bookname=root.element("书").element("书名");
        //得到节点的值或者文本
        System.out.println(bookname.getText());
    }

    //读取xml文档的属性
    public static void readAttr() throws Exception{
        SAXReader reader=new SAXReader();//得到解析器对象
        //通过解析器对象得到文档对象
        Document document=reader.read(new File("E:\\IDEA-Project\\xml的测试\\bookTest\\book.xml"));
        //得到根节点（此处的根节点是“书架”）
        Element root=document.getRootElement();
        //得到标签中属性的值
        String value=root.element("书").attributeValue("name");
        System.out.println(value);
    }

    //添加一个标签和其文本（值），这里添加一个售价节点
    public static void aaaNode() throws Exception{
        SAXReader reader=new SAXReader();//得到解析器对象
        //通过解析器对象得到文档对象
        Document document=reader.read(new File("E:\\IDEA-Project\\xml的测试\\bookTest\\book.xml"));
        //得到"书"标签，之后将售价节点挂在此节点上
        Element booknode=document.getRootElement().element("书");

        //创建一个售价节点
        Element price = DocumentHelper.createElement("售价");
        //设置其文本
        price.setText("100元");

        booknode.add(price);

        //创建一个编码格式化工具，设置编码
        OutputFormat outputFormat=OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("UTF-8");

        //写入xml中去
        //注意：这里不能使用FileWriter(url)，因为这种方式是输出字符流于是会
        //按照gb2312进行输出，所有这里需要使用字节流FileOutputStream输出
        XMLWriter xmlWriter=new XMLWriter(new FileOutputStream("E:\\IDEA-Project\\xml的测试\\bookTest\\book.xml"),outputFormat);
        xmlWriter.write(document);
        xmlWriter.close();//关闭流
    }

    //修改售价
    public static void update() throws Exception{
        SAXReader reader=new SAXReader();//得到解析器对象
        //通过解析器对象得到文档对象
        Document document=reader.read(new File("E:\\IDEA-Project\\xml的测试\\bookTest\\book.xml"));
        //取得售价节点
        Element prive=document.getRootElement().element("书").element("售价");
        prive.setText("50元");

        //创建一个编码格式化工具
        OutputFormat outputFormat=OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("UTF-8");
        //写入xml中去
        XMLWriter xmlWriter=new XMLWriter(new FileOutputStream("E:\\IDEA-Project\\xml的测试\\bookTest\\book.xml"),outputFormat);
        xmlWriter.write(document);
        xmlWriter.close();//关闭流
    }

    //删除一个售价节点
    public static void delete() throws Exception{
        SAXReader reader=new SAXReader();//得到解析器对象
        //通过解析器对象得到文档对象
        Document document=reader.read(new File("E:\\IDEA-Project\\xml的测试\\bookTest\\book.xml"));
        //删除售价节点
        Element price=document.getRootElement().element("书").element("售价");
        price.getParent().remove(price);

        //创建一个编码格式化工具
        OutputFormat outputFormat=OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("UTF-8");
        //写入xml中去
        XMLWriter xmlWriter=new XMLWriter(new FileOutputStream("E:\\IDEA-Project\\xml的测试\\bookTest\\book.xml"),outputFormat);
        xmlWriter.write(document);
        xmlWriter.close();//关闭流
    }

    //向指定位置增加节点
    public static void add2() throws Exception{
        SAXReader reader=new SAXReader();//得到解析器对象
        //通过解析器对象得到文档对象
        Document document=reader.read(new File("E:\\IDEA-Project\\xml的测试\\bookTest\\book.xml"));
        //创建一个节点
        Element price=DocumentHelper.createElement("售价");
        price.setText("99元");

        //将节点挂到指定位置下
        List<Node> list=document.getRootElement().element("书").elements();
        list.add(1,price);

        //创建一个编码格式化工具
        OutputFormat outputFormat=OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("UTF-8");
        //写入xml中去
        XMLWriter xmlWriter=new XMLWriter(new FileOutputStream("E:\\IDEA-Project\\xml的测试\\bookTest\\book.xml"),outputFormat);
        xmlWriter.write(document);
        xmlWriter.close();//关闭流
    }

    //使用xpath解析
    //注意需要jaxen-1.1-beta-6.jar包
    public static void findWithXpath() throws Exception{
        SAXReader reader=new SAXReader();//得到解析器对象
        //通过解析器对象得到文档对象
        Document document=reader.read(new File("E:\\IDEA-Project\\xml的测试\\bookTest\\user.xml"));

        Element element=(Element) document.selectNodes("//书名").get(0);
        System.out.println(element.getText());
    }

    //使用xpath查找
    public static void fineUser() throws Exception{
        String username="aaa";
        String password="111";

        SAXReader reader=new SAXReader();//得到解析器对象
        //通过解析器对象得到文档对象
        Document document=reader.read(new File("E:\\IDEA-Project\\xml的测试\\bookTest\\user.xml"));
        //下面这种写法不需要去记，直接看xpath文档即可
        Element element=(Element)document.selectSingleNode( "//user[@username='" + username + "' and @password='"+password+"']");

        if(element!=null){
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }
    }


}
