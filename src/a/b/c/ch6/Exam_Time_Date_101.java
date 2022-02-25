//package 선언
package a.b.c.ch6;

//import 선언
import java.util.Date;
import java.text.SimpleDateFormat;

//class 선언
public class Exam_Time_Date_101 {

	//상수 선언
	//맴버 변수 선언
	//생성자 선언
	//함수 선언
	
	//main() 선언
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exam_Time_Date_101 main() 진입 >>>>");
		
		//public Date()
		Date d = new Date();
		System.out.println("Exam_Time_Date_101 main() Date d >>> : " + d);
		
		//public int getYear()
		int year = d.getYear();
		System.out.println("Exam_Time_Date_101 main() int year >>> : " + year);
		
		year = year + 1900;
		System.out.println("Exam_Time_Date_101 main() year >>> : " + year);
		
		//public int getMonth()
		int month = d.getMonth();
		System.out.println("Exam_Time_Date_101 main() int month >>> : " + month);
		
		month = month + 1;
		System.out.println("Exam_Time_Date_101 main() month >>> : " + month);
		
		//public int getDate()
		int date = d.getDate();
		System.out.println("Exam_Time_Date_101 main() int date >>> : " + date);
		
		String time = year + "." + month + "." + date;
		System.out.println("Exam_Time_Date_101 main() String time >>> : " + time);
		
		//public String replace(char oldChar, char newChar)
		time = time.replace('.', '/');
		System.out.println("Exam_Time_Date_101 main() time >>> : " + time);
		time = time.replace('/', '-');
		System.out.println("Exam_Time_Date_101 main() time >>> : " + time);
		
		String ymd[] = {"yyyy.MM.dd","yyyy-MM-dd","yyyy/MM/dd"};
		System.out.println("Exam_Time_Date_101 main() String ymd[] >>> : " + ymd);
		for (int i = 0; i < ymd.length; i++) {
			System.out.println("Exam_Time_Date_101 main() for(int i = 0; i<ymd.length; i++) i >>> : " + i);
			//public class SimpleDateFormat
			SimpleDateFormat sdf = new SimpleDateFormat(ymd[i]);
			System.out.println("Exam_Time_Date_101 main() for() SimpleDateFormat sdf >>> : " + sdf);
			//public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition pos)
			System.out.println("Exam_Time_Date_101 main() for() sdf.format(d) >>> : " +sdf.format(d));
		}//end of for
		
	}//end of main

}//end of Exam_Time_Date_101
