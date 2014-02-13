package com.slyvronline.slyengine.utils;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.lang3.StringEscapeUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

public class ConfigurationFinder {

	private static String configurationFileName = "bin/data/config/config.xml";

	public static void getConfig(String path) {
		try {
			FileHandle xmlFile = Gdx.files.internal(configurationFileName);
			String strXmlFile = xmlFile.readString().trim();
			strXmlFile=strXmlFile.replace("\n", "").replace("\t", "").replace("\r","");
			strXmlFile=StringEscapeUtils.unescapeXml(strXmlFile);
			Document doc = loadXMLFromString(strXmlFile);
			doc.getDocumentElement().normalize();

			System.out.println(doc.getDocumentElement().getNodeName());
			

			NodeList nList = doc.getDocumentElement().getChildNodes();

			for (int i = 0; i < nList.getLength(); i++) {
				Node node = nList.item(i);
				if (node.hasChildNodes() | !"".equals(node.getNodeValue()))	loopNode(node);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Document loadXMLFromString(String xml) throws Exception{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		InputSource is = new InputSource(new StringReader(xml));
		return builder.parse(is);
	} 
	
	public static void loopNode(Node node){
		node.normalize();
		if (node.getNodeValue()!=null){
			System.out.println(node.getNodeName()+"="+node.getNodeValue().trim());
		}
		else{
			System.out.println(node.getNodeName());
		}
		NodeList nList = node.getChildNodes();
		for (int i = 0; i < nList.getLength(); i++) {
			Node childNode = nList.item(i);
			if (childNode.hasChildNodes() | !"".equals(childNode.getNodeValue())){
				loopNode(childNode);
			}
		}
	}

}
