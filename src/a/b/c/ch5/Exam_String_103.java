//package ����
package a.b.c.ch5;

//import ����

//class ����
public class Exam_String_103 {
	
	//��� ����
	//�ɹ� ���� ����
	//������ ����
	//�Լ� ����
	public void charSplit(String sVal) {
		System.out.println("Exam_String_103.charSplit (String sVal) ���� >>>>> ");
		System.out.println("Exam_String_103.charSplit (String sVal) sVal >>> : " + sVal);
		if (sVal != null && sVal.length() > 0) {
			
		}//end of if
	}//end of charSplit
	
	public void charToken(String sVal) {
		
	}//end of charToken
	
	//main() ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exam_String_103.main () ���� >>>>> ");
		String sVal = "A BC#D EF#G HI#J KL#M NO";
		System.out.println("Exam_String_103.main() String sVal >>> : " + sVal);
		Exam_String_103 es = new Exam_String_103();
		System.out.println("Exam_String_103.main() es >>> : " + es);
		es.charSplit(sVal);
		es.charToken(sVal);
		
	}//end of main()

}//end of Exam_String_103
