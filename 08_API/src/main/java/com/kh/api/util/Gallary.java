package com.kh.api.util;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Gallary {
	public static void main(String[] args) {

String url ="https://apis.data.go.kr/B551011/PhotoGalleryService1/galleryList1?serviceKey=82GuXzhjXhorHmYjvAX7o69H8jy2UCtdtbJU8dGNPzp%2B0C6dPFIycKw8%2FnXyqr%2F1kUPxa1OWL2uV7w%2BNVHaBHw%3D%3D&numOfRows=10&pageNo=1&MobileOS=ETC&MobileApp=AppTest&arrange=A&_type=xml";
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	try {
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(url);
		
		doc.getDocumentElement().normalize();
		
		System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
		NodeList nList = doc.getElementsByTagName("item");
	    System.out.println("파싱할 수 : " + nList.getLength());
	      
		
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


