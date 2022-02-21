package a.b.c.ch4;

//extends java.lang.Object가 생략되어 있다.
//public class Object
//java.lang.Object : Since:JDK1.0
public class Exam_EqualsTest_101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() 함수 시작  >>>>>>>> :");
		String s = "abc";
		System.out.println("s >>> : " + s);
		String s1 = "abc";
		System.out.println("s1 >>> : " + s1);
		Object o = new Object();
		System.out.println("o >>> : " + o);
		Object o1 = new Object();
		System.out.println("o1 >>> : " + o1);
		
		//public boolean equals(Object anObject)
		boolean b = s.equals(s1);
		System.out.println("System.identityHashCode(s) >>> : " + System.identityHashCode(s));
		System.out.println("System.identityHashCode(s1) >>> : " + System.identityHashCode(s1));
		System.out.println("s.equals(s1) >>>> : " + b);
		
		boolean b_1 = o.equals(o1);
		System.out.println("System.identityHashCode(o) >>> : " + System.identityHashCode(o));
		System.out.println("System.identityHashCode(o1) >>> : " + System.identityHashCode(o1));
		System.out.println("o.equals(o1) >>>> : " + b_1);
		
		//숫자가 아니면 사용하면 안된다.
		boolean b_2 = s == s1;
		System.out.println("b_2 >>> : " + b_2);
		
		boolean b_3 = o == o1;
		System.out.println("b_3 >>> : " + b_3);
		
		
	}//end of main()

}//end of Exam_EqualsTest_101
