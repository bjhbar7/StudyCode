//package 선언
package a.b.c.ch6;
//import 선언
import java.text.SimpleDateFormat;
//class 선언
public class Exam_Time_102 {

	//상수 선언
	//맴버 변수 선언
	//생성자 선언
	//함수 선언
	
	//main() 선언
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exam_Time_102.main() 함수 >>>>");
		//public static long currentTimeMillis()
		long start = System.currentTimeMillis();
		System.out.println("Exam_Time_102.main() start >>> : " + start);
		//public StringBuffer format(Date date,StringBuffer toAppendTo,FieldPosition pos)
		System.out.println("SimpleDateFormat().format(start) >>> : " + new SimpleDateFormat("yyyy년MM월dd일HH시mm분ss초").format(start));
		System.out.println("SimpleDateFormat().format(start) >>> : " + new SimpleDateFormat("HH시mm분ss초").format(start));
		System.out.println("SimpleDateFormat().format(start) >>> : " + new SimpleDateFormat("ss초").format(start));
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			//java.lang.Throwable
			//public void printStackTrace()
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("Exam_Time_102.main() end >>> : " + end);
		System.out.println("" + new SimpleDateFormat("yyyy년MM월dd일HH시mm분ss초").format(start));
		
	}//end of main()
}//end of Exam_Time_102
