package a.b.c.ch5;

import java.util.Scanner;

public class Exam_Math_105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java.lang.Math
		//public static double random()
		int answer = (int)(Math.random()*100) + 1;
				
		int count = 0;
		int input = 0;
				
		//java.util.Scanner
		//public Scanner(InputStream source)
		Scanner sc = new Scanner(System.in);
		
		do {
			count++;
			System.out.println("count >>> : " + count);
			System.out.println("1 ���� 100 ���̿� ���� �Է��ϼ���.");
			//public int nextInt()
			//the int scanned from the input
			input = sc.nextInt();
			
			if (input < answer) {
				System.out.println("�� ���� ���� �Է��ϼ���. >>> : " + input);
			} else if (input > answer ) {
				System.out.println("�� ���� ���� �Է��ϼ���. >>> : " + input);
			} else {
				System.out.println("�����Դϴ�. >>> :" + input);
				break;
			}
			
			if (count == 10) {
				System.out.println("Ƚ���� �ʰ��߽��ϴ�. >>> : " + count);
				break;
			}
		} while(true);
		
		sc.close();
	}// end of main()
}// end of Exam_Math_105
