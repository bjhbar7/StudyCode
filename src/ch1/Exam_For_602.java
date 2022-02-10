package ch1;

import java.util.Scanner;

public class Exam_For_602 {
	
	public void test_X (int x) {
		
			if (x <= 'Z') { 
				int leng = 26;
				int a = 'Z'- leng;
				if (x >= a) { 
					ch_0(x,a,leng);	
				}
			}
			if (x <= 'z') {
				int leng = 26;
				int a = 'z'-leng;
				if (x >= a) {
					ch_0(x,a,leng);
				}
			}
			if (x <= '9') {
				System.out.println("if(x<='9') 내부 >>> : ");
				int leng = 10;
				int a = '9'-leng;
				System.out.println("a >>> : " + a + "   x >>> : " + x);
				boolean y = (x > a);
				System.out.println("y >>> :" + y);
				if (x >= a) {
					System.out.println("if(x>=a) 내부 >>> : ");
					ch_0(x,a,leng);
				}
			}
		}

	public void ch_0(int x, int a, int leng) {
			int i = a;
			for ( ; i<leng; i++)
			{ System.out.print((char)i + " ");
			}
			System.out.println();
			System.out.println(x+"는 "+a+"부터 "+(x-a)+"번째 있다.");
		}
	
	public static void main(String args[]) {
		System.out.println("숫자,영문(소문자),영문(대문자)중 한 문자를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		new Exam_For_602().test_X(x);
	}
}