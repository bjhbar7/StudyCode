//package ����
package a.b.c.ch5;

//import ����

//class ����
public class Exam_String_104 {
	
	//��� ����
	//�ɹ� ���� ����
	//������ ����
	//�Լ� ����
	public void strSplit(String str) {
		System.out.println("Exam_String_104.strSplit(String str) ���� >>>>");
		System.out.println("Exam_String_104.strSplit(String str) str >>> : " + str);
		if (str != null && str.length() > 0) {
			System.out.println("Exam_String_104.strSplit() if() ���� >>>>");
			//public String[] split(String regex)
			//Returns: the array of strings computed by splitting this string around matches of the given regular expression
			String[] spl = str.split(" ");
			System.out.println("Exam_String_104.strSplit() if() String[] spl >>> : " + spl);
			int splLeng = spl.length;
			System.out.println("Exam_String_104.strSplit() if() int splLeng >>> : " + splLeng);
		}//end of if
	}//end of strSplit()
	
	public int aCount(String str) {
		System.out.println("Exam_String_104.aCount(String str) ���� >>>>");
		System.out.println("Exam_String_104.aCount(String str) str >>> : " + str);
		int aCnt = 0;
		System.out.println("Exam_String_104.aCount() int aCnt >>> : " + aCnt);
		if (str != null && str.length() > 0) {
			System.out.println("Exam_String_104.aCount() if() Validation ���� >>>>");
			for (int i=0; i<str.length(); i++) {
				System.out.println("Exam_String_104.aCount() for(i) i = " + i + " ���� >>>>");
				//public char charAt(int index)
				if ('a' == str.charAt(i)) {
					System.out.println("Exam_String_104.aCount() for() if() i = " + i + " ���� >>>>");
					aCnt++;
					System.out.println("Exam_String_104.aCount() for() if() aCnt >>> : " + aCnt);
				}//end of if
			}//end of for
		}//end of if
		System.out.println("Exam_String_104.aCount() return aCnt >>> : " + aCnt);
		return aCnt;
	}//end of aCount()
	
	//main() ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exam_String_104.main() ���� >>>>");
		String str = "The Curious Case of Benjamin Button";
		System.out.println("Exam_String_104.main() String str >>> : " + str);
		Exam_String_104 es = new Exam_String_104();
		System.out.println("Exam_String_104.main() es >>> : " + es);
		es.strSplit(str);
		int aCnt = es.aCount(str);
		System.out.println("Exam_String_104.main() int aCnt >>> : " + aCnt);
		
	}//end of main()

}//end of Exam_String_104
