package com;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.pojo.SourceCodeMap;

/**
 * @author (Daniel) Jul 22, 2013
 */
public class SourceCodeCounter {

	/**
	 * @param args
	 * @throws ParserConfigurationException
	 * @throws IOException
	 * @throws SAXException
	 * @throws JAXBException
	 */
	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException,
			JAXBException {

		JAXBContext.newInstance(SourceCodeMap.class).createUnmarshaller().unmarshal(new File("conf.xml"));

//		Document conf = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("conf.xml");
//		NodeList typeList = conf.getElementsByTagName("type");
//		for (int i = 0; i < typeList.getLength(); i++) {
//			NodeList list = typeList.item(i).getChildNodes();
//			for (int j = 0; j < list.getLength(); j++) {
//				Node property = list.item(j);
//				if (property.getNodeType() == Node.ELEMENT_NODE) {
//					SourceCodeType sourceCodeType = new SourceCodeType();
//					switch (property.getNodeName()) {
//					case "extension":
//						System.out.println(property.getTextContent());
//						sourceCodeType.setExtension(property.getTextContent());
//						break;
//					case "desc":
//						System.out.println(property.getTextContent());
//						sourceCodeType.setDesc(property.getTextContent());
//						break;
//					}
//				}
//			}
//		}
	}
}
