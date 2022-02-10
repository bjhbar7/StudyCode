package ch1;

public class Exam_For_501 {
	public void for_Ch () {
		String s0 = "A";
		
		//public char charAt(int index)
		char ch_L = s0.charAt(0);

		for (int i = ch_L; i < (ch_L+26); i++) {
			System.out.print((char)i + " ");
		}
		
		System.out.println();

		//public String toLowerCase()
		String s1 = s0.toLowerCase();
		
		char ch_S = s1.charAt(0);

		for (int i = ch_S;i < (ch_S+26); i++) {
			System.out.print((char)i + " ");
		}

	}

	public static void main(String args[]) {
	
		new Exam_For_501().for_Ch();
	}
}