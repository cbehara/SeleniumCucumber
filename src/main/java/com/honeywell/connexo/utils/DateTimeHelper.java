package com.honeywell.connexo.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeHelper {
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * This method is used for getting current Date and Time 
	 * @return
	 */
	public static String currentDateAndTime() {
		SimpleDateFormat sdfDate = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Calendar now = Calendar.getInstance();
		String strDate = sdfDate.format(now.getTime());
		return strDate;
	}
	
	public static String getDuration(String start, String end) {
		return end;
		
	}

}
