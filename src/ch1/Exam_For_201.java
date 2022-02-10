package ch1;

public class Exam_For_201 {

	public static void main(String args[]) {
		
		/*
		자바에서 for문 초기화 식은 항상 초기화 값을 0으로 하는데
		그이유는 for 대부분 배열 데이터를 처리하는대 사용하기 때문이다.
		*/
		//for 문 : 반복문 : from to loop : (초기화식; 조건식; 증감식) : {반복수행할 표현식}
		for ( int i = 0; i<3; i++) {
			System.out.println("i >>> :" + i);
		}
		for ( int i = 1; i<3; i++) {
			System.out.println("i >>> :" + i);
		}
		for ( int i = 1; i<=3; i++) {
			System.out.println("i >>> :" + i);
		}
		for ( int i = 1; (i-1)<3; i++) {
			System.out.println("i >>> :" + i);
		}
	}
}