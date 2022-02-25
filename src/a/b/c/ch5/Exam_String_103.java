//package 선언
package a.b.c.ch5;

//import 선언

//class 선언
public class Exam_String_103 {
	
	//상수 선언
	//맴버 변수 선언
	//생성자 선언
	//함수 선언
	public void charSplit(String sVal) {
		System.out.println("Exam_String_103.charSplit (String sVal) 진입 >>>>> ");
		System.out.println("Exam_String_103.charSplit (String sVal) sVal >>> : " + sVal);
		if (sVal != null && sVal.length() > 0) {
			
		}//end of if
	}//end of charSplit
	
	public void charToken(String sVal) {
		
	}//end of charToken
	
	//main() 선언
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exam_String_103.main () 진입 >>>>> ");
		String sVal = "A BC#D EF#G HI#J KL#M NO";
		System.out.println("Exam_String_103.main() String sVal >>> : " + sVal);
		Exam_String_103 es = new Exam_String_103();
		System.out.println("Exam_String_103.main() es >>> : " + es);
		es.charSplit(sVal);
		es.charToken(sVal);
		
	}//end of main()

}//end of Exam_String_103
