package ch1;

public class Exam_For_502 {
	
	public void for_ch() {
		
		String s0 = "A";
		
		//public char charAt(int index)
		//���ڿ��� �ش� �ε����� �ִ� ���ڸ� char �ڷ����� ���ڷ� �ٱ��ش�.
		char ch_L = s0.charAt(0);

		for (int i = ch_L; i < (ch_L + 26); i++) {
			//ASCII �ڵ� ���ڷ� ǥ���� ���ڸ� ���ڷ� �ٱ��ش�. (�� ��ȯ)
			System.out.print((char)i + " ");
			System.out.print(i + "");
			//public static String toBinaryString(int i)
			//2������ �տ� 0B, 0b�� ���δ�.
			System.out.print(Integer.toBinaryString(i) + " ");
			//public static String toOctalString(int i)
			//8������ �տ� 0�� ���δ�.
			System.out.print("0"+Integer.toOctalString(i) + " ");
			//public static String toHexString(int i)
			//16������ �տ� 0X, 0x�� ���δ�.
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