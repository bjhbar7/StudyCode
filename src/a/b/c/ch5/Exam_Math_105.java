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
			System.out.println("1 에서 100 사이에 값을 입력하세요.");
			//public int nextInt()
			//the int scanned from the input
			input = sc.nextInt();
			
			if (input < answer) {
				System.out.println("더 높은 값을 입력하세요. >>> : " + input);
			} else if (input > answer ) {
				System.out.println("더 낮은 값을 입력하세요. >>> : " + input);
			} else {
				System.out.println("정답입니다. >>> :" + input);
				break;
			}
			
			if (count == 10) {
				System.out.println("횟수를 초과했습니다. >>> : " + count);
				break;
			}
		} while(true);
		
		sc.close();
	}// end of main()
}// end of Exam_Math_105
