package com.xebia.Labsyarks;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLParser {

	public static List<LabYark> herd=new ArrayList<LabYark>();
	private static Boolean parsed=false;
	public static Boolean getParsed() {
		return parsed;
	}
	public static void setParsed(Boolean parsed) {
		XMLParser.parsed = parsed;
	}
	public static List<LabYark> getHerd() {
		XMLParser parser = new XMLParser();
		return parser.getAllUserNames("C:\\Users\\ZKLSANI\\eclipse-workspace\\Labyarks\\src\\main\\java\\com\\xebia\\Labsyarks\\NewFile.xml");
	}
	public static void setHerd(List<LabYark> herd) {
		XMLParser.herd = herd;
	}
	public List<LabYark> getAllUserNames(String fileName) {
		try {
			if(!(XMLParser.getParsed()))
			{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			File file = new File(fileName);
			if (file.exists()) {
				Document doc = db.parse(file);
				Element docEle = doc.getDocumentElement();

				// Print root element of the document
				System.out.println("Root element of the document: "
						+ docEle.getNodeName());

				NodeList herdList = docEle.getElementsByTagName("labyak");
                 int i=0;
				while(i<herdList.getLength())
				{ herd.add(new LabYark(herdList.item(i).getAttributes().item(1).getNodeValue(),herdList.item(i).getAttributes().item(0).getNodeValue(),herdList.item(i).getAttributes().item(2).getNodeValue()));
					System.out.println("Total herd: " + herdList.item(i).getAttributes().item(1).getNodeValue());
				i++;
				}
			}
			XMLParser.setParsed(true);
			
			}
			
			return herd;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	public static void main(String[] args) {

		XMLParser parser = new XMLParser();
		parser.getAllUserNames("C:\\Users\\ZKLSANI\\eclipse-workspace\\Labyarks\\src\\main\\java\\com\\xebia\\Labsyarks\\NewFile.xml");
	}
}