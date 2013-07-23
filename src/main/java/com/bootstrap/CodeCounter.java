/*
 * FILE     :  CodeCounter.java
 *
 * CLASS    :  CodeCounter
 *
 * COPYRIGHT:
 *
 *   The computer systems, procedures, data bases and programs
 *   created and maintained by Qware Technology Group Co Ltd, are proprietary
 *   in nature and as such are confidential.  Any unauthorized
 *   use or disclosure of such information may result in civil
 *   liabilities.
 *
 *   Copyright Jul 23, 2013 by Qware Technology Group Co Ltd.
 *   All Rights Reserved.
 */
package com.bootstrap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.utils.CodeType;
import com.utils.Profile;

/**
 * @author (Daniel) Jul 23, 2013
 */
public class CodeCounter {

	private Profile profile;

	private void init() {
		try {
			profile = (Profile) JAXBContext.newInstance(Profile.class).createUnmarshaller()
					.unmarshal(ClassLoader.getSystemResourceAsStream("conf.xml"));
		} catch (JAXBException e) {
			// FIXME
		}
	}

	public void read(String path) {
		init();
		int count = 0;
		// countCode(new File(path),count);
		System.out.println("Totals: " + countCode(new File(path), count));
	}

	private int countCode(File file, int count) {
		if (!file.exists()) {
			System.out.println("No file/directory found!");
			return 0;
		}
		if (file.isFile()) {
			count += readFile(file);
		} else {
			for (File subFile : file.listFiles()) {
				count = countCode(subFile, count);
			}
		}
		return count;
	}

	private int readFile(File file) {
		int countWithoutComments = 0;
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String fileName = file.getName();
			CodeType codeType = null;
			if (fileName.contains(".")) {
				codeType = this.profile.getTypes().get(fileName.substring(fileName.lastIndexOf(".")));
			}
			if (null == codeType) {
				return 0;
			}
			if (codeType.getExtension().equals(".xml")) {
				// System.out.println(codeType.getSingleLineComment().equals(""));
			}
			String temp;
			int totalCount = 0;

			boolean multiLineComment = false;
			while ((temp = reader.readLine()) != null) {
				boolean singleLineComment = false;
				totalCount++;
				if ("".equals(temp.trim()) || !"".equals(codeType.getSingleLineComment())
						&& temp.trim().startsWith(codeType.getSingleLineComment())) {
					singleLineComment = true;
				} else if (temp.trim().startsWith(codeType.getMultiLineCommentBegin())) {
					multiLineComment = true;
				}

				if (!singleLineComment && !multiLineComment) {
					countWithoutComments++;
				}
				if (temp.trim().endsWith(codeType.getMultiLineCommentEnd())) {
					multiLineComment = false;
				}
			}
			System.out.println(fileName + "\t\t" + "Code lines: " + countWithoutComments + "\t Total Lines: "
					+ totalCount);

		} catch (IOException ex) {
			// FIXME
		}
		return countWithoutComments;
	}
}
