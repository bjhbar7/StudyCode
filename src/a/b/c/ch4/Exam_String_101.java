package a.b.c.ch4;

public class Exam_String_101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java";
		String s2 = "android";
		System.out.println("s1 >>> : " + s1);
		System.out.println("System.identityHashCode(s1) >>> : " + System.identityHashCode(s1));
		System.out.println("s2 >>> : " + s2);
		System.out.println("System.identityHashCode(s2) >>> : " + System.identityHashCode(s2));
		
		//public String concat(String str)
		//java.lang.String
		//Concatenates the specified string to the end of this string.
		String s3 = s1.concat(s2);
		System.out.println("s3 >>> : " + s3);
		//public static int identityHashCode(Object x)
		//Returns:the hashCode	Since:JDK1.1
		System.out.println("System.identityHashCode(s3) >>> : " + System.identityHashCode(s3));
		
		String sb0 = new String("abc");
		System.out.println("sb0 >>> : " + sb0);
		System.out.println("System.identityHashCode(sb0) >>> : " + System.identityHashCode(sb0));
		
		//public StringBuffer()
		StringBuffer sb1 = new StringBuffer();
		System.out.println("System.identityHashCode(sb1) >>> : " + System.identityHashCode(sb1));
		//public StringBuffer append(Object obj)
		//java.lang.StringBuffer
		//Appends the string representation of the Object argument.
		sb1.append(" and");
		sb1.append(" android");
		sb1.append(" programming is fun!!!!!!");
		System.out.println("sb1 >>>> : " + sb1);
		System.out.println("System.identityHashCode(sb1) >>> : " + System.identityHashCode(sb1));
		
		//sb0 는 String class의 참조변수이고
		//sb1 은 StringBuffer의 참조변수이다.
		//둘은 형이 다르므로 형 변환해서 사용해야한다.
		sb0 = sb1.toString();
		
		System.out.println("sb0 >>>> : " + sb0);
		System.out.println("System.identityHashCode(sh0) >>> : " + System.identityHashCode(sb0));
	}//end of main()
}//end of Exam_String_101
