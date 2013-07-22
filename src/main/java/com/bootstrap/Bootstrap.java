package com.bootstrap;

import java.util.Map.Entry;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.utils.CodeType;
import com.utils.Profile;

/**
 * @author (Daniel) Jul 22, 2013
 */
public class Bootstrap {

	public static void main(String[] args) throws JAXBException {

		// Get file in current class path
		Profile profile = (Profile) JAXBContext
				.newInstance(new Class[] { Profile.class })
				.createUnmarshaller()
				.unmarshal(ClassLoader.getSystemResourceAsStream("conf.xml"));
		for (Entry<String, CodeType> entry : profile.getTypes().entrySet()) {
			System.out.println(entry.getKey() + "\t"
					+ entry.getValue().getDesc() + "\t"
					+ entry.getValue().getSingleLineComment());
		}
	}
}
