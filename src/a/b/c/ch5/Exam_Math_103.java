package a.b.c.ch5;

import java.util.Scanner;

public class Exam_Math_103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main >>>>>>>> ");
		//java.lang.Math
		//public static double random()
		//a pseudorandom double greater than or equal to 0.0 and less than 1.0.
		int answer = (int)(Math.random()*100) + 1;
		//System.out.println("answer >>> : " + answer);
		
		int count = 0;
		int input = 0;
		
		//java.util.Scanner
		//public Scanner(InputStream source)
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("for�� ���� >>>>>>>>");
			System.out.println("1���� 100���� ���� �߿� �ϳ� ġ����.");
			
			count++;
			//public int nextInt()
			//the int scanned from the input
			input = sc.nextInt();
				if (input == answer) {
					System.out.println("if(input == answer){} ���� >>>>>>>");
					System.out.println("���� !! >>> : " + input);
					System.out.println("input >>> : " + input);
					System.out.println("answer >>> : " + answer);
					System.out.println("count >>> : " + count);
					break;
				} else if (input > answer) {
					System.out.println("else if (input > answer){} ���� >>>>>>>");
					System.out.println("���� �۰� �Է����ּ���. >>> : " + input );
				} else if (input < answer) {
					System.out.println("else if (input < answer){} ���� >>>>>>>");
					System.out.println("���� ���� �Է����ּ���. >>> : " + input);
				}
				
				if (count == 10) {
					System.out.println("if(count == 10) {} ���� >>>>>>");
					System.out.println("Ƚ���� �ʰ��߽��ϴ�.");
					sc.close();
					break;
				}
		} // end of for() {}
		sc.close();
	} // end of main()
} // end of Exam_Math_103
