package a.b.c.ch5;

public class Exam_String_105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exam_String_105 main() ÁøÀÔ >>>>");
		String sVal = "Hello Java Testing !!";
		System.out.println("Exam_String_105 main() String sVal >>> : " + sVal);
		//public boolean contains(CharSequence s)
		//Returns true if and only if this string contains the specified sequence of char values.
		boolean bool = sVal.contains("Hello");
		System.out.println("Exam_String_105 main() bool >>> : " + bool);
		//public boolean equals(Object anObject)
		boolean bool_1 = sVal.equals("Hello");
		System.out.println("Exam_String_105 main() bool_1 >>> : " + bool_1);
		
		String sVal1 = "ÇÐ±³Á¾ÀÌ ¶¯¶¯¶¯ ¾î¼­ ¸ðÀÌÀÚ";
		System.out.println("Exam_String_105 main() String sVal1 >>> : " + sVal1);
		
		bool = sVal1.contains("ÇÐ±³Á¾");
		System.out.println("Exam_String_105 main() bool >>> : " + bool);
		bool_1 = sVal1.equals("¶¯¶¯¶¯");
		System.out.println("Exam_String_105 main() bool_1 >>> : " + bool_1);
		
		String str = "Hello";
		System.out.println("Exam_String_105 main() String str >>> : " + str);
		String str1 = "Hello";
		System.out.println("Exam_String_105 main() String str1 >>> : " + str1);
		String str2 = "Would";
		System.out.println("Exam_String_105 main() String str2 >>> : " + str2);
		//public int compareTo(String anotherString)
		/*
		 * the value 0 if the argument string is equal to this string; 
		 * a value less than 0 if this string is lexicographically less than the string argument; 
		 * and a value greater than 0 if this string is lexicographically greater than the string argument.
		 * */
		System.out.println("str.compareTo(str1) >>> : " + str.compareTo(str1));
		System.out.println("str1.compareTo(str2) >>> : " + str1.compareTo(str2));
		System.out.println("str2.compareTo(str1) >>> : " + str2.compareTo(str1));
	}//end of main()

}//end of Exam_String_105
