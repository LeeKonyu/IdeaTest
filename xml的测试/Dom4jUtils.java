package xml的测试;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author : 猕猴桃
 * @create 2019/7/29 10:47
 */
public class Dom4jUtils {
    //返回document
    public static Document getDocument(String path) {
        try {
            SAXReader sr=new SAXReader();
            Document dc=sr.read(new File(path));
            return dc;
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return null;
    }
    //回写XML
    public static void xmlWriter(String path,Document document) throws Exception{
        OutputFormat of = OutputFormat.createPrettyPrint();
        XMLWriter xmw = new XMLWriter(new FileOutputStream(new File(path)), of);
        xmw.write(document);
        xmw.close();
    }
}
