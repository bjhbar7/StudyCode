package a.b.c.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil_101 {

	public static String yyyymmdd() {
		return new SimpleDateFormat("yyyyMMdd").format(new Date()).toString();
	}
	
	public static String cTime() {
		
		long time = System.currentTimeMillis();
		/*
		 *  SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
		 *  String cTime = sdf.format(new java.util.Date(time));
		 *  return cTime;
		 */
		return new SimpleDateFormat("yyyy.MM.dd hh:mm:ss").format(new Date(time)).toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("yyyymmdd >>> : " + DateUtil.yyyymmdd());
		System.out.println("cTime >>> : " + DateUtil.cTime());
	}

}
