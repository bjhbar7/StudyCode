//package 선언
package a.b.c.ch6;

//import 선언
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_Time_DigitalClock_101 extends JFrame implements Runnable{
	//상수 선언
	//맴버변수 선언
	private Thread thread;
	private JLabel label;
	//생성자 선언
	public Exam_Time_DigitalClock_101() {
		super("디지털 시계");
		
		setLayout(new FlowLayout());
		
		label = new JLabel();
		label.setFont(new Font("Serif",Font.PLAIN, 20));
		
		if(thread == null) {
			
			thread = new Thread(this);
			thread.start();
		}
		add(label);
		setBounds(100,100,400,100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	//함수 선언
	public void run() {
		while(true) {
			
			Calendar cal = Calendar.getInstance();
			String now = cal.get(Calendar.YEAR) + "년" +
							(cal.get(Calendar.MONTH)+1) + "월" +
							cal.get(Calendar.DATE) + "일" +
							cal.get(Calendar.HOUR) + "시" +
							cal.get(Calendar.MINUTE) + "분" +
							cal.get(Calendar.SECOND) + "초";
			
			label.setText(now);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
		}
	}
	
	public static void main(String args[]) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new Exam_Time_DigitalClock_101();
	}
}
