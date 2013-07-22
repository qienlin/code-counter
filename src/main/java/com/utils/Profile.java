/**
 * 
 */
package com.utils;

import java.util.HashMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * @author Daniel
 * 
 */
@XmlRootElement(name = "profile")
@XmlAccessorType(XmlAccessType.FIELD)
public class Profile {

	@XmlJavaTypeAdapter(CodeTypeAdapter.class)
	@XmlElement
	public HashMap<String, CodeType> types;

	/**
	 * @return the types
	 */
	public HashMap<String, CodeType> getTypes() {
		return types;
	}

	/**
	 * @param types
	 *            the types to set
	 */
	public void setTypes(HashMap<String, CodeType> types) {
		this.types = types;
	}

}
