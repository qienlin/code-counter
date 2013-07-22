package com.pojo;

import java.util.Map;

import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author (Daniel) Jul 22, 2013
 */
@XmlRootElement(name = "types")
public class SourceCodeMap {
	@XmlAnyAttribute
	private Map<String,SourceCodeType> map;

	@XmlRootElement(name = "type")
	class SourceCodeType {
		private String extension;

		private String desc;

		private String singleLineComment;

		private String multiLineCommentBegin;

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
		@XmlElement(name = "single_line_comment")
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
		@XmlElement(name = "multi_line_comment_begin")
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
		@XmlElement(name = "multi_line_comment_end")
		public void setMultiLineCommentEnd(String multiLineCommentEnd) {
			this.multiLineCommentEnd = multiLineCommentEnd;
		}
	}
}
