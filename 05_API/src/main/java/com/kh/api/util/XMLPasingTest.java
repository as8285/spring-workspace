package com.kh.api.util;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLPasingTest {
public static void main(String[] args) {
	String url = "https://openapi.gg.go.kr/GGCULTUREVENTSTUS?KEY=a58a339100e84f0997bd90f5e1315bdd";
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	try {
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(url);
		
		doc.getDocumentElement().normalize();
		System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
		NodeList nList = doc.getElementsByTagName("row");
	    System.out.println("파싱할 수 : " + nList.getLength());
	    
	    for(int i=0; i<nList.getLength();i++) {
	    	
	    	Node nNode = nList.item(i);
	    	if(nNode.getNodeType()== Node.ELEMENT_NODE) {
	    		Element elElement = (Element) nNode;
	    		System.out.println(getTagValue("TITLE",elElement));
	    		System.out.println("BEGIN_DE : " + getTagValue("BEGIN_DE",elElement));
	    		System.out.println("END_DE : " + getTagValue("END_DE",elElement));
	    	}else {}
	    	
	    }
		
	} catch (Exception e) {

		e.printStackTrace();
	}
}

public static String getTagValue(String tag,Element eElement) {
	NodeList nList = eElement.getElementsByTagName(tag).item(0).getChildNodes();
	Node nValue = nList.item(0);
	if(nValue==null) return null;
	return nValue.getNodeValue();
	
}

}

