package uts.wsd.dom;

import java.io.*;
import java.util.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

public class UsersPrinter {

    public static final Printer name = new NamePrinter();
    public static final Printer plain = new PlainPrinter();
    public static final Printer xml = new XMLPrinter();
    public static final Printer html = new HTMLPrinter();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Select an output mode:");
        System.out.println("1: name");
        System.out.println("2: plain");
        System.out.println("3: xml");
        System.out.println("4: html");
        System.out.print("enter choice: ");
        int mode = keyboard.nextInt();
        switch (mode) {
            case 1:
                name.print("web/WEB-INF/users.xml", out);
                break;
            case 2:
                plain.print("web/WEB-INF/users.xml", out);
                break;
            case 3:
                xml.print("web/WEB-INF/users.xml", out);
                break;
            case 4:
                html.print("web/WEB-INF/users.xml", out);
                break;
        }
    }

    public static abstract class Printer {

        public abstract void print(Node node, PrintWriter out);

        public void print(String filePath, Writer out) throws ParserConfigurationException, SAXException, IOException {
            print(filePath, new PrintWriter(out, true));
        }

        public void print(String filePath, PrintWriter out) throws ParserConfigurationException, SAXException, IOException {
            FileInputStream in = new FileInputStream(filePath);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(in);
            Element root = document.getDocumentElement();
            print(root, out);
            out.flush();
        }
    }

    public static class NamePrinter extends Printer {
        // The "node" parameter corresponds to the <users> node
        // Use "out" to print out the answer

        public void print(Node node, PrintWriter out) {
            // INSERT YOUR CODE HERE

            // Here is some sample code to start with. This refers to
            // the second child of <users>. The first child item(0) actually
            // refers to the text node "\n\t" because there is a newline and
            // TAB character before the first <user>
            out.println("The first user is " + node.getChildNodes().item(1).getChildNodes().item(3).getTextContent());
        }
    }

    public static class PlainPrinter extends Printer {

        public void print(Node node, PrintWriter out) {
            // INSERT YOUR CODE HERE
            int type = node.getNodeType();
            String name = node.getNodeName();
            String value = node.getNodeValue();

            switch (type) {
                case Node.ELEMENT_NODE:
                    out.print(name);
                    NamedNodeMap attrs = node.getAttributes();
                    for (int i = 0; i < attrs.getLength(); i++) 
                    {
                        Node attr = attrs.item(i);
                        out.print(attr.getNodeName() + attr.getNodeValue());
                    }
                    NodeList children = node.getChildNodes();
                    if (children != null)
                    {
                        int len = children.getLength();
                        for (int i = 0; i < len; i++) 
                        {
                            print(children.item(i), out);
                        }
                    }
                    break;
                case Node.TEXT_NODE:
                    out.print(node.getNodeValue());
                    break;
            }

        }
    }

    public static class XMLPrinter extends Printer {

         public void print(Node node, PrintWriter out) {
            // INSERT YOUR CODE HERE
            int type = node.getNodeType();
            String name = node.getNodeName();
            String value = node.getNodeValue();

            switch (type) {
                case Node.ELEMENT_NODE:
                    out.print(name);
                    NamedNodeMap attrs = node.getAttributes();
                    for (int i = 0; i < attrs.getLength(); i++) 
                    {
                        Node attr = attrs.item(i);
                        out.print("< test" + attr.getNodeName() + attr.getNodeValue() + " >");
                    }
                    NodeList children = node.getChildNodes();
                    if (children != null)
                    {
                        int len = children.getLength();
                        for (int i = 0; i < len; i++) 
                        {
                            print(children.item(i), out);
                        }
                    }
                    break;
                case Node.TEXT_NODE:
                    out.print(node.getNodeValue());
                    break;
            }

        }
    }

    public static class HTMLPrinter extends Printer {

        public void print(Node node, PrintWriter out) {
            // INSERT YOUR CODE HERE
            int type = node.getNodeType();
            String name = node.getNodeName();
            String value = node.getNodeValue();

            switch (type) {
                case Node.ELEMENT_NODE:
                    out.print(name);
                    NamedNodeMap attrs = node.getAttributes();
                    for (int i = 0; i < attrs.getLength(); i++) 
                    {
                        Node attr = attrs.item(i);
                        out.print("<" + attr.getNodeName() + attr.getNodeValue() + ">");
                    }
                    NodeList children = node.getChildNodes();
                    if (children != null)
                    {
                        int len = children.getLength();
                        for (int i = 0; i < len; i++) 
                        {
                            print(children.item(i), out);
                        }
                    }
                    break;
                case Node.TEXT_NODE:
                    out.print(node.getNodeValue());
                    break;
            }

        }
    }
}
