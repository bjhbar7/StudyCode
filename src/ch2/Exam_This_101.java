package ch2;

import java.util.Date;
import java.util.Calendar;

public class Exam_This_101 {

	String s;
	int i;
	
	public Exam_This_101() {
		System.out.println("Exam_This_101�� �Ű����� ���� �⺻ ������");
		//Class<?>	getClass()
		//Returns the runtime class of this Object.
		//public String getName()
		//Returns the name of the entity (class, interface, array class, primitive type, or void) represented by this Class object, as a String.
		System.out.println("Exam_This_101()�� this >>>> : " + this.getClass().getName());
		System.out.println("this.s >>> : " + this.s);
		System.out.println("this.i >>> : " + this.i);
	}
	
	public Exam_This_101(String ss) {
		System.out.println("Exam_This_101�� �Ű����� �ִ� ������");
		System.out.println("ss >>>> :" + ss);
		System.out.println("Exam_This_101(String ss)�� this >>>> : " + this.getClass().getName());
	}

	public static void main(String args[]) {
	
		Exam_This_101 et = new Exam_This_101();
		System.out.println("et�� �ּҰ� >>> : " + et);
		Exam_This_101 et2 = new Exam_This_101("qowlsfid");
		System.out.println("et2�� �ּҰ� >>> : " + et2);

		System.out.println("et�� ���ӽ����̽� >>>> : " +et.getClass().getName());
		System.out.println("et2�� ���ӽ����̽� >>>> : " +et2.getClass().getName());

		String str = "123";
		System.out.println("str�� �� >>> : " + str);
		System.out.println("str�� ���ӽ����̽� >>>> : " + str.getClass().getName());

		int iV[] = new int[]{1,2,3};
		System.out.println("iV�� �ּҰ� >>> : " + iV);
		System.out.println("iV�� ���ӽ����̽� >>>> : " + iV.getClass().getName());

		int iV2[][] = new int[2][3];
		System.out.println("iV2�� �ּҰ� >>> : " + iV2);
		System.out.println("iV2�� ���ӽ����̽� >>>> : " + iV2.getClass().getName());

		Date d = new Date();
		System.out.println("Date()�� �ּҰ� >>> : " + d);
		System.out.println("Date()�� ���ӽ����̽� >>>> : " + d.getClass().getName());
	}
}