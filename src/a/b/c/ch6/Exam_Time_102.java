//package ����
package a.b.c.ch6;
//import ����
import java.text.SimpleDateFormat;
//class ����
public class Exam_Time_102 {

	//��� ����
	//�ɹ� ���� ����
	//������ ����
	//�Լ� ����
	
	//main() ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exam_Time_102.main() �Լ� >>>>");
		//public static long currentTimeMillis()
		long start = System.currentTimeMillis();
		System.out.println("Exam_Time_102.main() start >>> : " + start);
		//public StringBuffer format(Date date,StringBuffer toAppendTo,FieldPosition pos)
		System.out.println("SimpleDateFormat().format(start) >>> : " + new SimpleDateFormat("yyyy��MM��dd��HH��mm��ss��").format(start));
		System.out.println("SimpleDateFormat().format(start) >>> : " + new SimpleDateFormat("HH��mm��ss��").format(start));
		System.out.println("SimpleDateFormat().format(start) >>> : " + new SimpleDateFormat("ss��").format(start));
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			//java.lang.Throwable
			//public void printStackTrace()
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("Exam_Time_102.main() end >>> : " + end);
		System.out.println("" + new SimpleDateFormat("yyyy��MM��dd��HH��mm��ss��").format(start));
		
	}//end of main()
}//end of Exam_Time_102
