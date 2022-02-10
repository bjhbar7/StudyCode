package ch1;

public class Exam_For_502 {
	
	public void for_ch() {
		
		String s0 = "A";
		
		//public char charAt(int index)
		//문자열에 해당 인덱스에 있는 문자를 char 자료형의 문자로 바까준다.
		char ch_L = s0.charAt(0);

		for (int i = ch_L; i < (ch_L + 26); i++) {
			//ASCII 코드 숫자로 표현된 문자를 문자로 바까준다. (형 변환)
			System.out.print((char)i + " ");
			System.out.print(i + "");
			//public static String toBinaryString(int i)
			//2진수는 앞에 0B, 0b를 붙인다.
			System.out.print(Integer.toBinaryString(i) + " ");
			//public static String toOctalString(int i)
			//8진수는 앞에 0을 붙인다.
			System.out.print("0"+Integer.toOctalString(i) + " ");
			//public static String toHexString(int i)
			//16진수는 앞에 0X, 0x을 붙인다.
			System.out.print("0x"+Integer.toHexString(i) + " ");
			System.out.print("0X"+Integer.toHexString(i));
			System.out.println();
		}
		
		//public String toLowerCase()
		String s1 = s0.toLowerCase();

		char ch_S = s1.charAt(0);

		for (int i = ch_S; i < (ch_S + 26); i++) {
			System.out.print((char)i + " ");
			System.out.print(i + " ");
			System.out.print(Integer.toBinaryString(i) + " ");
			System.out.print("0" + Integer.toOctalString(i) + " ");
			System.out.print("0x" + Integer.toHexString(i) + " ");
			System.out.print("0X" + Integer.toHexString(i));
			System.out.println();
		}
	}
	public static void main(String args[]) {
	
		new Exam_For_502().for_ch();
	}
}