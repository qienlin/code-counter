package com.bootstrap;

import java.io.IOException;

/**
 * @author (Daniel) Jul 22, 2013
 */
public class Bootstrap {

//	private static String path = "D:/Workspaces/SmartCity/code-counter/src/test/java/com/test/LineTest.java";

//		private static String path = "D:/Workspaces/SmartCity/code-counter/src/main/java";
		
		private static String path="D:/Workspaces/SmartCity/LYGCG/src";

	public static void main(String[] args) throws IOException {
		new CodeCounter().read(path);
	}
}
