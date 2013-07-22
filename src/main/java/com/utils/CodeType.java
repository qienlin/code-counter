/**
 * 
 */
package com.utils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author Daniel
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CodeType {

	@XmlAttribute(name = "extension")
	private String extension;

	@XmlElement(name = "desc")
	private String desc;

	@XmlElement(name = "single_line_comment")
	private String singleLineComment;

	@XmlElement(name = "multi_line_comment_begin")
	private String multiLineCommentBegin;

	@XmlElement(name = "multi_line_comment_end")
	private String multiLineCommentEnd;

	/**
	 * @return the extension
	 */

	public String getExtension() {
		return extension;
	}

	/**
	 * @param extension
	 *            the extension to set
	 */
	public void setExtension(String extension) {
		this.extension = extension;
	}

	/**
	 * @return the desc
	 */

	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc
	 *            the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the singleLineComment
	 */

	public String getSingleLineComment() {
		return singleLineComment;
	}

	/**
	 * @param singleLineComment
	 *            the singleLineComment to set
	 */
	public void setSingleLineComment(String singleLineComment) {
		this.singleLineComment = singleLineComment;
	}

	/**
	 * @return the multiLineCommentBegin
	 */

	public String getMultiLineCommentBegin() {
		return multiLineCommentBegin;
	}

	/**
	 * @param multiLineCommentBegin
	 *            the multiLineCommentBegin to set
	 */
	public void setMultiLineCommentBegin(String multiLineCommentBegin) {
		this.multiLineCommentBegin = multiLineCommentBegin;
	}

	/**
	 * @return the multiLineCommentEnd
	 */
	public String getMultiLineCommentEnd() {
		return multiLineCommentEnd;
	}

	/**
	 * @param multiLineCommentEnd
	 *            the multiLineCommentEnd to set
	 */
	public void setMultiLineCommentEnd(String multiLineCommentEnd) {
		this.multiLineCommentEnd = multiLineCommentEnd;
	}
}
