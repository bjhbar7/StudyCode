//package ����
package a.b.c.ch6;

//import ����
import java.util.Calendar;
//class ����
public class Exam_Time_Calendar_101 {
	
	//main() ����
	public static void main(String args[]) {
		System.out.println("Exam_Time_Calendar_101.main() ���� >>>>");
		//public abstract class Calendar
		//public static Calendar getInstance()
		Calendar cd = Calendar.getInstance();
		System.out.println("Exam_Time_Calendar_101.main() Calendar cd >>> : " + cd);
		
		//public int get(int field)
		//Returns the value of the given calendar field.
		//public static final int YEAR
		int y = cd.get(Calendar.YEAR);
		System.out.println("Exam_Time_Calendar_101.main() int y >>> : " + y);
		System.out.println("Exam_Time_Calendar_101.main() cd.get(1) >>> : " + cd.get(1));
		
		//public static final int MONTH
		int m = cd.get(Calendar.MONTH) +1;
		System.out.println("Exam_Time_Calendar_101.main() int m >>> : " + m);
		System.out.println("Exam_Time_Calendar_101.main() cd.get(2)+1 >>> : " + (cd.get(2)+1));
		
		//public static final int DATE
		int d = cd.get(Calendar.DATE);
		System.out.println("Exam_Time_Calendar_101.main() int d >>> : " + d);
		System.out.println("Exam_Time_Calendar_101.main() cd.get(5) >>> : " + cd.get(5));
		
		//public static final int DAY_OF_MONTH
		int d1 = cd.get(Calendar.DAY_OF_MONTH);
		System.out.println("Exam_Time_Calendar_101.main() int d1 >>> : " + d1);
		
		//public static final int HOUR_OF_DAY
		int t = cd.get(Calendar.HOUR_OF_DAY);
		System.out.println("Exam_Time_Calendar_101.main() int t >>> : " + t);
		System.out.println("Exam_Time_Calendar_101.main() cd.get(11) >>> : " + cd.get(11));
		
		//public static final int HOUR
		int t1 = cd.get(Calendar.HOUR);
		System.out.println("Exam_Time_Calendar_101.main() int t1 >>> : " + t1);
		
		//public static final int MINUTE
		int mm = cd.get(Calendar.MINUTE);
		System.out.println("Exam_Time_Calendar_101.main() int mm >>> : " + mm);
		System.out.println("Exam_Time_Calendar_101.main() cd.get(12) >>> : " + cd.get(12));
		
		//public static final int SECOND
		int s = cd.get(Calendar.SECOND);
		System.out.println("Exam_Time_Calendar_101.main() int s >>> : " + s);
		System.out.println("Exam_Time_Calendar_101.main() cd.get(13) >>> : " + cd.get(13));
		
		String time = "���� �ð��� " 
						+ y +"�� "
						+ m +"�� "
						+ d +"�� "
						+ t +"�� "
						+ mm +"�� "
						+ s +"�� �Դϴ�.";
		System.out.println("time >>> : \n" +time);
		
	}//end of main()
}//end of Exam_Time_Calendar_101
