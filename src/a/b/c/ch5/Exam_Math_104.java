package a.b.c.ch5;

import java.util.Scanner;

public class Exam_Math_104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() ���� >>>>>>>>>>");
		//java.lang.Math
		//public static double random()
		int answer = (int)(Math.random()*100) + 1;
		System.out.println("answer >>> : " + answer);
		
		int count = 0;
		System.out.println("���� ���� count �ʱ�ȭ �� >>>>>> : " + count);
		int input = 0;
		System.out.println("���� ���� input �ʱ�ȭ �� >>>>>> : " + input);
		
		//java.util.Scanner
		//public Scanner(InputStream source)
		Scanner sc = new Scanner(System.in);
		
	
		while (true) {
			System.out.println("while ���� >>>>>>>>>>>");
			System.out.println("1���� 100������ ���� �Է��ϼ���.");
			count++;
			System.out.println("count >>> : " + count);
			input = sc.nextInt();
			System.out.println("�Է� ���� �� : input >>>>> : " + input);
			if (input == answer) {
				System.out.println("if(input == answer) {} ���� >>>>>>>");
				System.out.println("�����Դϴ�. >>> : " + input);
				break;
			} else if (input > answer)  {
				System.out.println("else if(input > answer) {} ���� >>>>>>");
				System.out.println("���� �۰� �Է��ϼ���. >>> : " + input);
			} else if (input < answer){
				System.out.println("else if(input < answer) {} ���� >>>>>>");
				System.out.println("���� ���� �Է��ϼ���. >>> :" + input);
			}
			
			if ( count == 10 ) {
				System.out.println("if(count == 10) {} ���� >>>>>>");
				System.out.println("Ƚ���� �ʰ��߽��ϴ�. >>> : " + count);
				sc.close();
				break;
			}
			
		}
		
		sc.close();
	}

}
