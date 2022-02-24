package ch1;

public class Exam_For_601 {
	String s0 = "abcdefghijklmnopqrstuvwxyz";
	String s1 = s0.toUpperCase();
	String s2 = "0123456789";
	String s3 = "*+-/";
	String s4 = "!@#%%^&*";

	public void toHex_S0() {
		System.out.println("toHex_S0 >>> : ");
		for (int i = 0; i<s0.length(); i++) {
			//public char charAt(int index)
			char ch_S = s0.charAt(i);
			//public static String toHexString(int i)
			System.out.print(Integer.toHexString(ch_S) + " ");
		}
		System.out.println();
	}
	public void toHex_S1() {
		System.out.println("toHex_S1 >>> : ");
		for ( int i = 0; i<s1.length(); i++) {
			char ch_L = s1.charAt(i);
			System.out.print(Integer.toHexString(ch_L) + " ");
		}
		System.out.println();
	}
	public void toHex_S2() {
		System.out.println("toHex_S2 >>> : ");
		for ( int i = 0; i<s2.length(); i++) {
			char ch_Num = s2.charAt(i);
			System.out.print(Integer.toHexString(ch_Num) + " ");
		}
		System.out.println();
	}
	public void toHex_S3() {
		System.out.println("toHex_S3 >>> : ");
		for (int i = 0; i<s3.length(); i++) {
			char ch_I = s3.charAt(i);
			System.out.print(Integer.toHexString(ch_I) + " ");
		}
		System.out.println();
	}
	public void toHex_S4() {
		System.out.println("toHex_S4 >>> : ");
		for (int i = 0; i<s4.length(); i++) {
			char ch_H = s4.charAt(i);
			System.out.print(Integer.toHexString(ch_H) + " ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		new Exam_For_601().toHex_S0();
		new Exam_For_601().toHex_S1();
		new Exam_For_601().toHex_S2();
		new Exam_For_601().toHex_S3();
		new Exam_For_601().toHex_S4();

	}
}