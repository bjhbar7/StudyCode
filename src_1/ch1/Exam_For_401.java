package ch1;

public class Exam_For_401 {

	public static void main(String args[]) {
		/*
		1. 지역 변수, 초기화해서 사용해야 한다.
		2. 참조 변수, 주소값을 갖는다.(생략)
		// public static int identityHashCode(Object x)
		3. rt.jar : java.lang.String : import 하지 않아도 사용 가능
		4. 문자열을 다루는 빌트인 클래스
		*/
		String s0 = "abc";
		//public String toUpperCase()
		//Converts all of the characters in this String to upper case using the rules of the default locale.
		String s1 = s0.toUpperCase();

		for (int i=0; i<s0.length(); i++) { 
			//public char charAt(int index)
			//Returns the char value at the specified index.
			System.out.println("s0의 charAt("+i+") >>> :"+s0.charAt(i));
		}
		for (int i=0; i<s1.length(); i++) {
			System.out.println("s1의 charAt("+i+") >>> :"+s1.charAt(i));
		}
	}
}