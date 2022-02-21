package a.b.c.ch4;

public class Exam_EqualsTest_102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String("abc");
		String s1 = new String("abc");
		
		System.out.println("s >>> : " + s);
		System.out.println("s1 >>> : " + s1);
		//public static int identityHashCode(Object x) Since:JDK1.1
		/*
		 * Returns the same hash code for the given object as would be returned by the default method hashCode(), 
		 * whether or not the given object's class overrides hashCode(). The hash code for the null reference is zero.
		*/
		System.out.println("System.identityHashCode(s) >>> : " + System.identityHashCode(s));
		System.out.println("System.identityHashCode(s1) >>> : " + System.identityHashCode(s1));
		
		System.out.println("s == s1 ::: " + (s == s1));
		System.out.println("s.equals(s1) ::: " + s.equals(s1));
		
		Integer i = new Integer(100);
		Integer i1 = new Integer(100);
		
		System.out.println("i >>> : " + i);
		System.out.println("i1 >>> : " + i1);
		System.out.println("System.identityHashCode(i) >>> : " + System.identityHashCode(i));
		System.out.println("System.identityHashCode(i1) >>> : " + System.identityHashCode(i1));
		
		System.out.println("i == i1 ::: " + (i == i1));
		System.out.println("i.equals(i1) ::: " + i.equals(i1));
	}

}
