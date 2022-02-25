//package ����
package a.b.c.ch6;

//import ����
import java.util.Calendar;
import java.util.TimeZone;

//class ����
public class Exam_Time_Clock_101 implements Runnable{
	//��� ����
	//�ɹ� ���� ����
	private Thread thread;
	
	//������ ����
	public Exam_Time_Clock_101 () {
		System.out.println("Exam_Time_Clock_101 �Ű����� ���� ������ ���� >>>>");
		if(thread == null) {
			
			thread = new Thread(this);
			thread.start();
		}
	}
	
	@Override
	public void run() {
		System.out.println("Exam_Time_Clock_101.run() ���� >>>>");
		
		while(true) {
			System.out.println("Exam_Time_Clock_101.run() while() >>>>");
			
			Calendar cal = Calendar.getInstance();
			String now = cal.get(Calendar.YEAR) + "��" +
							(cal.get(Calendar.MONTH)+1) + "��" +
							cal.get(Calendar.DATE) + "��" +
							cal.get(Calendar.HOUR) + "��" +
							cal.get(Calendar.MINUTE) + "��" +
							cal.get(Calendar.SECOND) + "��";
			System.out.println(now);
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				
			}
		}//end of while()
		
	}//end of run()
	//main() ����
	public static void main(String args[]) {
		System.out.println("Exam_Time_Clock_101");
		
		new Exam_Time_Clock_101();
	}//end of main()
}//end of Exam_Time_Clock_101
