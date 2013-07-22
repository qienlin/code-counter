/**
 * 
 */
package com.utils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author Daniel
 * 
 */
public class CodeTypeAdapter extends
		XmlAdapter<CodeTypes, Map<String, CodeType>> {

	@Override
	public Map<String, CodeType> unmarshal(CodeTypes v) throws Exception {
		Map<String, CodeType> map = new HashMap<String, CodeType>();
		for (CodeType type : v.types) {
			map.put(type.getExtension(), type);
		}
		return map;
	}

	@Override
	public CodeTypes marshal(Map<String, CodeType> v) throws Exception {
		CodeTypes types = new CodeTypes();
		Collection<CodeType> ms = v.values();
		types.types = ms.toArray(new CodeType[ms.size()]);
		return types;
	}
}