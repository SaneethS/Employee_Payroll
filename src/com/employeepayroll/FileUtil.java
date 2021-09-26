package com.employeepayroll;

import java.io.File;

/**
 * this is a util class where the delete operation of file takes place
 * @author saneeths
 *
 */
public class FileUtil {
	public static boolean deleteFiles(File fileContents) {
		File[] file = fileContents.listFiles();
		if (file != null) {
			for (File f : file) {
				deleteFiles(f);
			}
		}
		return fileContents.delete();
	}

}
