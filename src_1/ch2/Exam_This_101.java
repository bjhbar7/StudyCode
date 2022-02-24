package ch2;

import java.util.Date;
import java.util.Calendar;

public class Exam_This_101 {

	String s;
	int i;
	
	public Exam_This_101() {
		System.out.println("Exam_This_101의 매개변수 없는 기본 생성자");
		//Class<?>	getClass()
		//Returns the runtime class of this Object.
		//public String getName()
		//Returns the name of the entity (class, interface, array class, primitive type, or void) represented by this Class object, as a String.
		System.out.println("Exam_This_101()의 this >>>> : " + this.getClass().getName());
		System.out.println("this.s >>> : " + this.s);
		System.out.println("this.i >>> : " + this.i);
	}
	
	public Exam_This_101(String ss) {
		System.out.println("Exam_This_101의 매개변수 있는 생성자");
		System.out.println("ss >>>> :" + ss);
		System.out.println("Exam_This_101(String ss)의 this >>>> : " + this.getClass().getName());
	}

	public static void main(String args[]) {
	
		Exam_This_101 et = new Exam_This_101();
		System.out.println("et의 주소값 >>> : " + et);
		Exam_This_101 et2 = new Exam_This_101("qowlsfid");
		System.out.println("et2의 주소값 >>> : " + et2);

		System.out.println("et의 네임스패이스 >>>> : " +et.getClass().getName());
		System.out.println("et2의 네임스패이스 >>>> : " +et2.getClass().getName());

		String str = "123";
		System.out.println("str의 값 >>> : " + str);
		System.out.println("str의 네임스패이스 >>>> : " + str.getClass().getName());

		int iV[] = new int[]{1,2,3};
		System.out.println("iV의 주소값 >>> : " + iV);
		System.out.println("iV의 네임스패이스 >>>> : " + iV.getClass().getName());

		int iV2[][] = new int[2][3];
		System.out.println("iV2의 주소값 >>> : " + iV2);
		System.out.println("iV2의 네임스패이스 >>>> : " + iV2.getClass().getName());

		Date d = new Date();
		System.out.println("Date()의 주소값 >>> : " + d);
		System.out.println("Date()의 네임스패이스 >>>> : " + d.getClass().getName());
	}
}