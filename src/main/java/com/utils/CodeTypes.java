/**
 * 
 */
package com.utils;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author Daniel
 * 
 */
public class CodeTypes {

	@XmlElement(name = "type")
	public CodeType[] types;
}
