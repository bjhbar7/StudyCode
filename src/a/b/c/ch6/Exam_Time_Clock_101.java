//package 선언
package a.b.c.ch6;

//import 선언
import java.util.Calendar;
import java.util.TimeZone;

//class 선언
public class Exam_Time_Clock_101 implements Runnable{
	//상수 선언
	//맴버 변수 선언
	private Thread thread;
	
	//생성자 선언
	public Exam_Time_Clock_101 () {
		System.out.println("Exam_Time_Clock_101 매개변수 없는 생성자 진입 >>>>");
		if(thread == null) {
			
			thread = new Thread(this);
			thread.start();
		}
	}
	
	@Override
	public void run() {
		System.out.println("Exam_Time_Clock_101.run() 진입 >>>>");
		
		while(true) {
			System.out.println("Exam_Time_Clock_101.run() while() >>>>");
			
			Calendar cal = Calendar.getInstance();
			String now = cal.get(Calendar.YEAR) + "년" +
							(cal.get(Calendar.MONTH)+1) + "월" +
							cal.get(Calendar.DATE) + "일" +
							cal.get(Calendar.HOUR) + "시" +
							cal.get(Calendar.MINUTE) + "분" +
							cal.get(Calendar.SECOND) + "초";
			System.out.println(now);
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				
			}
		}//end of while()
		
	}//end of run()
	//main() 선언
	public static void main(String args[]) {
		System.out.println("Exam_Time_Clock_101");
		
		new Exam_Time_Clock_101();
	}//end of main()
}//end of Exam_Time_Clock_101
