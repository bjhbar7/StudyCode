package ch2;

import ch2.Exam_Inter_102;
import ch2.Exam_Inter_103;
import ch2.Exam_Inter_101_Class;

public class Exam_Inter_101_Test {

	public static void main(String args[]) {
	Exam_Inter_102 ei = new Exam_Inter_101_Class();
	System.out.println("ei의 주소값 >>>>>>>> : " + ei);
	ei.aM();
	ei.bM();
	ei.cM();
	Exam_Inter_103 ei2 = new Exam_Inter_101_Class();
	System.out.println("ei2의 주소값 >>>>>>>> : " + ei2);
	ei2.eM();
	}
}
