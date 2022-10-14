package com.honeywell.connexo.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.log4testng.Logger;

public class PathHelper {
	
	private static Logger log=Logger.getLogger(PathHelper.class);
	
	public static String getBasePath() {
		return System.getProperty("user.dir");
		
	}
	
	public static String getResourcePath(String path) {
		return getBasePath()+path;
	}
	
	public static FileInputStream getInputStreamResourcePath(String path) throws FileNotFoundException{
		return new FileInputStream(getResourcePath(path));
	}
	
	public static String getProjectPath(String path) {
		try {
			return java.net.URLDecoder.decode(path.replace("/target/classes", ""),"UTF-8");
		}
		catch(Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
		}
		return path;
	}

}
