package com.bootstrap;

import java.io.IOException;
import java.util.Map.Entry;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.utils.CodeType;
import com.utils.Profile;

/**
 * @author (Daniel) Jul 22, 2013
 */
public class Bootstrap {

	/**
	 * @param args
	 * @throws ParserConfigurationException
	 * @throws IOException
	 * @throws SAXException
	 * @throws JAXBException
	 */
	public static void main(String[] args) throws JAXBException {

		// Get file in current class path
		Profile types = (Profile) JAXBContext
				.newInstance(new Class[] { Profile.class })
				.createUnmarshaller()
				.unmarshal(ClassLoader.getSystemResourceAsStream("conf.xml"));
		for (Entry<String, CodeType> entry : types.getTypes().entrySet()) {
			System.out.println(entry.getKey() + "\t"
					+ entry.getValue().getDesc() + "\t"
					+ entry.getValue().getSingleLineComment());
		}

		// Document conf =
		// DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("conf.xml");
		// NodeList typeList = conf.getElementsByTagName("type");
		// for (int i = 0; i < typeList.getLength(); i++) {
		// NodeList list = typeList.item(i).getChildNodes();
		// for (int j = 0; j < list.getLength(); j++) {
		// Node property = list.item(j);
		// if (property.getNodeType() == Node.ELEMENT_NODE) {
		// SourceCodeType sourceCodeType = new SourceCodeType();
		// switch (property.getNodeName()) {
		// case "extension":
		// System.out.println(property.getTextContent());
		// sourceCodeType.setExtension(property.getTextContent());
		// break;
		// case "desc":
		// System.out.println(property.getTextContent());
		// sourceCodeType.setDesc(property.getTextContent());
		// break;
		// }
		// }
		// }
		// }
	}
}
