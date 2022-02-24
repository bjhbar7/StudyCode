package a.b.c.ch5;

import java.util.Scanner;

public class Exam_Math_104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() 내부 >>>>>>>>>>");
		//java.lang.Math
		//public static double random()
		int answer = (int)(Math.random()*100) + 1;
		System.out.println("answer >>> : " + answer);
		
		int count = 0;
		System.out.println("지역 변수 count 초기화 값 >>>>>> : " + count);
		int input = 0;
		System.out.println("지역 변수 input 초기화 값 >>>>>> : " + input);
		
		//java.util.Scanner
		//public Scanner(InputStream source)
		Scanner sc = new Scanner(System.in);
		
	
		while (true) {
			System.out.println("while 내부 >>>>>>>>>>>");
			System.out.println("1부터 100까지의 값을 입력하세요.");
			count++;
			System.out.println("count >>> : " + count);
			input = sc.nextInt();
			System.out.println("입력 받은 값 : input >>>>> : " + input);
			if (input == answer) {
				System.out.println("if(input == answer) {} 내부 >>>>>>>");
				System.out.println("정답입니다. >>> : " + input);
				break;
			} else if (input > answer)  {
				System.out.println("else if(input > answer) {} 내부 >>>>>>");
				System.out.println("값을 작게 입력하세요. >>> : " + input);
			} else if (input < answer){
				System.out.println("else if(input < answer) {} 내부 >>>>>>");
				System.out.println("값을 높게 입력하세요. >>> :" + input);
			}
			
			if ( count == 10 ) {
				System.out.println("if(count == 10) {} 내부 >>>>>>");
				System.out.println("횟수를 초과했습니다. >>> : " + count);
				sc.close();
				break;
			}
			
		}
		
		sc.close();
	}

}
