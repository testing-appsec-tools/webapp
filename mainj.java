// blank

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

// java.lang.security.audit.xxe.documentbuilderfactory-external-general-entities-true.documentbuilderfactory-external-general-entities-true.json
public class XXEVulnerableExample {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setFeature("http://xml.org/sax/features/external-general-entities", true);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


// java.lang.security.audit.xxe.documentbuilderfactory-external-parameter-entities-true.documentbuilderfactory-external-parameter-entities-true.json
public class XXEVulnerableExample2 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setFeature("http://xml.org/sax/features/external-parameter-entities", true);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
